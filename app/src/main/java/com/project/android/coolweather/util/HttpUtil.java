package com.project.android.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * HttpUtil class
 *
 * @author zhoutao
 * @date 2017/11/11
 */

public class HttpUtil {
    public static void sendOkhttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
