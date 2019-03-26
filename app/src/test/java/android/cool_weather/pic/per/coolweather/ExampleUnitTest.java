package android.cool_weather.pic.per.coolweather;

import android.provider.Settings;
import android.util.Log;

import org.junit.Test;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    private static final String TAG = "ExampleUnitTest";
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
    
    @Test
    public void testHttp() {
        String address = "http://guolin.tech/api/china";
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        System.out.print(address);
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                System.out.print("fail...");
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                System.out.print("success...");
                System.out.print("[" + response.body().string() + "]");
            }
        });
    }
}