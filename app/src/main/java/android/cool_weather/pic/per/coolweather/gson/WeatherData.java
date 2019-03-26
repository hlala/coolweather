package android.cool_weather.pic.per.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by huping on 2019/3/26.
 */
public class WeatherData {
    public String pm25;
    public String pm10;
    public String quality;  //空气质量
    public String ganmao;

    @SerializedName("shidu")
    public String humidity;
    @SerializedName("wemdu")
    public String temperature;
    @SerializedName("forecast")
    public List<Forecast> forecastList;
}
