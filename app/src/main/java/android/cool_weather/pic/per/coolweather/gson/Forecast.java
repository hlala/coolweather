package android.cool_weather.pic.per.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by huping on 2019/3/19.
 */
public class Forecast {
    public String date;
    public String ymd;
    public String week;
    public String sunrise;

    @SerializedName("high")
    public String hignTemperature;
    @SerializedName("low")
    public String lowTemperature;

    public String sunset;
    public String aqi;
    public String fx;
    public String fl;
    public String type;
    public String notice;
}