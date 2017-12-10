package com.project.android.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Forecast class
 *
 * @author zhoutao
 * @date 10/12/2017
 */
public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Temperature temperature;
    @SerializedName("cond")
    public More more;

    public class Temperature {
        public String max;
        public String min;
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }
}
