package android.cool_weather.pic.per.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by huping456257 on 2019/3/11.
 */
public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;

    public City() {
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int proviceId) {
        this.provinceId = proviceId;
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

    @Override
    public String toString() {
        return id + ":" + cityName + ":" + cityCode + ":" + provinceId;
    }
}
