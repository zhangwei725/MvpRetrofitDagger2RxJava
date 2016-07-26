package com.yz.app;

import android.app.Application;

import com.yz.app.di.component.AppComponent;
import com.yz.app.di.component.DaggerAppComponent;
import com.yz.app.di.module.AppModule;
import com.yz.app.di.module.RetrofitModule;

/**
 * 项目名称：RetrofitDagger2RxJava
 * 类描述：
 * 创建人：zhangwei
 * 创建时间：2016-07-16 18:54
 * 修改人：zhangwei
 * 修改时间：2016-07-16 18:54
 * 修改备注：
 * 修改人：lvyerose
 * 修改时间：2016-07-16 18:54
 * 修改备注：妈蛋 给老子提交上
 */

public class App extends Application {
    private AppComponent appConponent;
    private static App app;

    public static App getInstance() {
        return app;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        initAppComponent();
    }

    public AppComponent getAppComponent() {
        return appConponent;
    }

    private void initAppComponent() {
        appConponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .retrofitModule(new RetrofitModule(this))
                .build();
    }

}
