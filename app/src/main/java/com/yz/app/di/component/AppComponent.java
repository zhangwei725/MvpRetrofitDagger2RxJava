package com.yz.app.di.component;

import android.content.Context;

import com.yz.app.App;
import com.yz.app.common.api.ApiService;
import com.yz.app.di.ForApplication;
import com.yz.app.di.module.ApiServiceModule;
import com.yz.app.di.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * 项目名称：RetrofitDagger2RxJava
 * 类描述：
 * 创建人：zhangwei
 * 创建时间：2016-07-16 19:08
 * 修改人：zhangwei
 * 修改时间：2016-07-16 19:08
 * 修改备注：
 */
@Singleton
@Component(modules = {AppModule.class, ApiServiceModule.class})
public interface AppComponent {
    @ForApplication
    Context context();

    App application();

    ApiService getApiService();


}
