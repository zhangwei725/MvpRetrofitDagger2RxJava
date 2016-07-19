package com.yz.app.di.module;

import android.app.Application;
import android.content.Context;

import com.yz.app.App;
import com.yz.app.common.api.ApiService;
import com.yz.app.di.ForApplication;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * 项目名称：RetrofitDagger2RxJava
 * 类描述：
 * 创建人：zhangwei
 * 创建时间：2016-07-16 19:05
 * 修改人：zhangwei
 * 修改时间：2016-07-16 19:05
 * 修改备注：
 */
@Module(includes = ApiServiceModule.class)
public class AppModule {
    protected final App mApp;

    public AppModule(App mApp) {
        this.mApp = mApp;
    }

    @Provides
    Application provideApplication() {
        return mApp;
    }

    @Provides
    @ForApplication
    Context provideContext() {
        return mApp;
    }

    @Provides
    public ApiService providesAPIService(Retrofit retrofit) {
        return retrofit.create(ApiService.class);
    }
}
