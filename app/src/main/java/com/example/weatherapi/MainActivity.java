package com.example.weatherapi;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.androdocs.httprequest.HttpRequest;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
    String API_KEY ="7a9d28d47fmshd25ac92c2e00a93p17c20bjsn57eeeabfc20b";
    private String cityString;

    public String getCityString() {
        return cityString;
    }

    public void setCityString(String cityString) {
        this.cityString = cityString;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button1);

        if (AppStatus.getInstance(this).isOnline()) {
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
//                    Intent intent = new Intent(getApplicationContext(),Test_Activity.class);
//                    startActivity(intent);
                    EditText inputCityName = findViewById(R.id.cityEditText);
                    setCityString(inputCityName.getText().toString());
                    new MainActivity.weatherTask().execute();
                    TextView textView = findViewById(R.id.cityDisplay);
                    textView.setText(inputCityName.getText());
                }
            });
        } else {
            Toast.makeText(this,"You are not online!!!!",Toast.LENGTH_LONG).show();
            Log.v("Home", "############################You are not online!!!!");
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
//                    Intent intent = new Intent(getApplicationContext(),Test_Activity.class);
//                    startActivity(intent);
                    EditText inputCityName = findViewById(R.id.cityEditText);
                    setCityString(inputCityName.getText().toString());
                    TextView textView = findViewById(R.id.cityDisplay);
                    textView.setText(inputCityName.getText());
                }
            });
        }
    }


        class weatherTask extends AsyncTask<String, Void, String> {
            @Override
            protected void onPreExecute() {
                super.onPreExecute();
            }

            protected String doInBackground(String... args) {
                String response = HttpRequest.excuteGet("https://community-open-weather-map.p.rapidapi.com/weather?q=" + getCityString() + "&units=metric&rapidapi-key=" + API_KEY);
                return response;
            }
            @Override
            protected void onPostExecute(String result) {
                JSONObject jsonObj = null;
                try {
                    jsonObj = new JSONObject(result);
                    JSONObject main = jsonObj.getJSONObject("main");
                    JSONObject sys = jsonObj.getJSONObject("sys");
                    JSONObject wind = jsonObj.getJSONObject("wind");
                    JSONObject weather = jsonObj.getJSONArray("weather").getJSONObject(0);
                    String temp = main.getString("temp") + "°C";
                    String pressure = main.getString("pressure");
                    String humidity = main.getString("humidity");

                    String weatherString = getCityString() + '\n' +
                            "temperature: " + temp + '\n' +
                            "pressure:    " + pressure +  " hPa" + '\n' +
                            "humidity:    " + humidity + " %" + '\n';
                    TextView weatherTextView = findViewById(R.id.weather);
                    weatherTextView.setText(weatherString);

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
}
