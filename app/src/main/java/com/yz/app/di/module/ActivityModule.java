package com.yz.app.di.module;

import android.app.Activity;

import com.yz.app.di.PerActivity;

import dagger.Module;
import dagger.Provides;

/**
 * 这个module把activity暴露给相关联的类。
 * 比如在fragment中使用activity的context。
 */
@Module
public class ActivityModule {
    private final Activity activity;

    public ActivityModule(Activity activity) {
        this.activity = activity;
    }

    @Provides
    @PerActivity
    Activity activity() {
        return activity;
    }
}