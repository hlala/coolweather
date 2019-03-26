package android.cool_weather.pic.per.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by huping456257 on 2019/3/26.
 */
public class CityInfo {
    @SerializedName("city")
    public String cityName;

    public String cityId;
    public String parent;
    public String updateTime;
}
