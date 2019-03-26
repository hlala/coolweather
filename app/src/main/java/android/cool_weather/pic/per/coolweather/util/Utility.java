package android.cool_weather.pic.per.coolweather.util;

import android.cool_weather.pic.per.coolweather.db.City;
import android.cool_weather.pic.per.coolweather.db.County;
import android.cool_weather.pic.per.coolweather.db.Province;
import android.cool_weather.pic.per.coolweather.gson.Weather;
import android.text.TextUtils;
import android.util.Log;

import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by huping456257 on 2019/3/14.
 */
public class Utility {
    private static final String TAG = "Utility";
    public static boolean handleProvinceResponse(String response) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allProvinses = new JSONArray(response);
                for (int i = 0; i < allProvinses.length(); i++) {
                    JSONObject provinceObject = allProvinses.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceName(provinceObject.getString("name"));
                    province.setProvinceCode(provinceObject.getInt("id"));
                    province.save();
                }

                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        return false;
    }
    public static boolean handleCityResponse(String response, int provinceId) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allCities = new JSONArray(response);
                for (int i = 0; i < allCities.length(); i++) {
                    JSONObject provinceObject = allCities.getJSONObject(i);
                    City city = new City();
                    city.setCityName(provinceObject.getString("name"));
                    city.setCityCode(provinceObject.getInt("id"));
                    city.setProvinceId(provinceId);
                    city.save();
                }

                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        return false;
    }
    public static boolean handleCountyResponse(String response, int cityId) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allcounties = new JSONArray(response);
                for (int i = 0; i < allcounties.length(); i++) {
                    JSONObject countyObject = allcounties.getJSONObject(i);
                    County county = new County();
                    county.setCountyName(countyObject.getString("name"));
                    county.setCountyCode(countyObject.getInt("id"));
                    county.setWeatherId(countyObject.getString("weather_id"));
                    county.setCityId(cityId);
                    county.save();
                }

                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        return false;
    }

    public static Weather handleWeatherReaponse(String response) {
        try {
            JSONObject jsonObject = new JSONObject(response);
           // JSONArray jsonArray = jsonObject.getJSONArray("Weather");
            //String weatherContent = jsonArray.getJSONObject(0).toString();
            return new Gson().fromJson(jsonObject.toString(), Weather.class);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
