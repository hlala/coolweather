package android.cool_weather.pic.per.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by huping456257 on 2019/3/13.
 */
public class HttpUtil {
    public static void sendOKHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
