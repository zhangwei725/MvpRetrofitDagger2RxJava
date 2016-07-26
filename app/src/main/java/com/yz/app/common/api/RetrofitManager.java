package com.yz.app.common.api;

import retrofit2.Retrofit;


public class RetrofitManager {
    private static volatile RetrofitManager instance = null;
    public static Retrofit retrofit;

    private RetrofitManager() {

    }

    public static RetrofitManager getInstance() {
        if (instance == null) {
            synchronized (RetrofitManager.class) {
                if (instance == null) {
                    instance = new RetrofitManager();
                }
            }
        }
        return instance;
    }

}
