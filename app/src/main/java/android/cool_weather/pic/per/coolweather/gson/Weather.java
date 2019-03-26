package android.cool_weather.pic.per.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by huping on 2019/3/19.
 */
public class Weather {
    public String time;
    public CityInfo cityInfo;
    public String date;
    public String message;
    public String status;
    public WeatherData data;
}
