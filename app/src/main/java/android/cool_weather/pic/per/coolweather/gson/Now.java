package android.cool_weather.pic.per.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by huping456257 on 2019/3/19.
 */
public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
