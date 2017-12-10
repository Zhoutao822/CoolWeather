package com.project.android.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * AQI class
 *
 * @author zhoutao
 * @date 10/12/2017
 */
public class AQI {
    @SerializedName("city")
    public AQICity city;

    public class AQICity{
        @SerializedName("aqi")
        public String aqi;
        @SerializedName("pm25")
        public String pm25;
    }
}
