package com.project.android.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Basic class
 *
 * @author zhoutao
 * @date 10/12/2017
 */
public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
