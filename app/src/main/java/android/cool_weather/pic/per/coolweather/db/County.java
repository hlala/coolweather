package android.cool_weather.pic.per.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by huping456257 on 2019/3/11.
 */
public class County extends DataSupport {
    private int id;
    private String countyName;
    private int countyCode;
    private String weatherId;
    private int cityId;

    public County() {
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {

        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getCountyCode() {

        return countyCode;
    }

    public void setCountyCode(int countyCode) {
        this.countyCode = countyCode;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}

