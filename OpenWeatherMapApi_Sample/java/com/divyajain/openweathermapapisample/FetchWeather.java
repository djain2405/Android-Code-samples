package com.divyajain.openweathermapapisample;

import android.content.Context;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Divya Jain on 7/9/2016.
 */
public class FetchWeather {

    private static final String OPEN_WEATHER_MAP_API =
            "http://api.openweathermap.org/data/2.5/weather?q=%s&units=metric";

        public static JSONObject getJSON(Context context, String city){
        try {


            URL url = new URL(String.format(OPEN_WEATHER_MAP_API, city));

            HttpURLConnection connection =
                    (HttpURLConnection)url.openConnection();
            connection.setRequestProperty("x-api-key",
                    context.getString(R.string.open_weather_maps_app_id));


            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()));
            if (reader == null)
                System.out.println("Divya Testing null!!!");
            StringBuilder json = new StringBuilder(1024);
            String tmp="";
            while((tmp=reader.readLine())!=null)
                json.append(tmp).append("\n");
            reader.close();

            JSONObject data = new JSONObject(json.toString());


            // This value will be 404 if the request was not
            // successful
            if(data.getInt("cod") != 200){


                return null;
            }

            return data;
        }catch(Exception e){
            System.out.println("Error " + e.toString());
            return null;
        }

        }
}
