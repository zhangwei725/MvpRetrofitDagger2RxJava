package com.yz.app.common.api;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 *
 * 项目名称：RetrofitDagger2RxJava
 * 类描述：
 * 创建人：zhangwei
 * 创建时间：2016-07-17 17:04
 * 修改人：zhangwei
 * 修改时间：2016-07-17 17:04
 * 修改备注：
 *
 */
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
