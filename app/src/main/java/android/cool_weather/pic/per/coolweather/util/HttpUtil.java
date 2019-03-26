package android.cool_weather.pic.per.coolweather.util;

import android.util.Log;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by huping on 2019/3/13.
 */
public class HttpUtil {
    private static final String TAG = "HttpUtil";

    public static void sendOKHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).get().build();
        Log.d(TAG, "pinghu:" + address);
        client.newCall(request).enqueue(callback);
    }
}
