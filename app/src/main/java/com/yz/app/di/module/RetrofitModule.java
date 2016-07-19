package com.yz.app.di.module;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.yz.app.common.api.UrlManager;
import com.yz.app.common.okhttp.CacheInterceptor;
import com.yz.app.common.okhttp.CookiesManager;
import com.yz.app.common.utils.AppConfig;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 项目名称：RetrofitDagger2RxJava
 * 类描述：
 * 创建人：zhangwei
 * 创建时间：2016-07-19 14:19
 * 修改人：zhangwei
 * 修改时间：2016-07-19 14:19
 * 修改备注：
 */
@Module
public class RetrofitModule {
    private final Context context;

    public RetrofitModule(Context context) {
        this.context = context;
    }

    @Singleton
    @Provides
    public Retrofit providesRetrofit() {
        return new Retrofit.Builder()
                .baseUrl(UrlManager.BASE_URL)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(provideGson()))
                .build();
    }

    @Provides
    public Gson provideGson() {
        return new GsonBuilder().
                serializeNulls().
                create();
    }

    @Provides
    public OkHttpClient provideOkhttpClient() {
        return new OkHttpClient.Builder()
                .cache(provideCache())//添加缓存
                .addInterceptor(providesCacheInterceptor())
                .cookieJar(providesCookies())
                .build();

    }

    @Provides
    public CacheInterceptor providesCacheInterceptor() {
        return new CacheInterceptor(context);
    }


    @Provides
    public Cache provideCache() {
        return new Cache(context.getExternalFilesDir(AppConfig.DEFAULT_JOSN_CACHE), AppConfig.DEFAULT_CACHE_SIZE);
    }

    @Provides
    public CookiesManager providesCookies() {
        return new CookiesManager();
    }


}
