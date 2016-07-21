package com.yz.app.di.module;

import android.content.Context;

import com.yz.app.di.ForActivity;

import dagger.Module;
import dagger.Provides;

/**
 * 这个module把activity暴露给相关联的类。
 * 比如在fragment中使用activity的context。
 */
@Module
public class ActivityModule {
    private final Context mContext;

    public ActivityModule(Context mContext) {
        this.mContext = mContext;
    }

    @Provides
    @ForActivity
    Context provideActivityContext() {
        return mContext;
    }
}