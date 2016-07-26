package com.yz.app.di.component;

import android.content.Context;

import com.yz.app.common.api.ApiService;
import com.yz.app.di.module.AppModule;
import com.yz.app.di.module.RetrofitModule;

import javax.inject.Singleton;

import dagger.Component;


@Singleton
@Component(modules = {AppModule.class, RetrofitModule.class})
public interface AppComponent {
    Context getContext();

    ApiService getApiService();

}
