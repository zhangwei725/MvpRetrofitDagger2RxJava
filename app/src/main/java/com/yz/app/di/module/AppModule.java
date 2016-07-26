package com.yz.app.di.module;

import android.content.Context;

import com.yz.app.App;
import com.yz.app.common.api.ApiService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;


@Module
public class AppModule {
    protected final App mApp;

    public AppModule(App mApp) {
        this.mApp = mApp;
    }


    @Provides
    @Singleton
    Context providesContext() {
        return mApp;
    }

    @Provides
    ApiService providesApiService(Retrofit retrofit) {
        return retrofit.create(ApiService.class);
    }


}
