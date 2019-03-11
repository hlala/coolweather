package android.cool_weather.pic.per.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by huping456257 on 2019/3/11.
 */
public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int proviceId;

    public City() {
    }

    public int getProviceId() {
        return proviceId;
    }

    public void setProviceId(int proviceId) {
        this.proviceId = proviceId;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {

        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {

        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }
}
