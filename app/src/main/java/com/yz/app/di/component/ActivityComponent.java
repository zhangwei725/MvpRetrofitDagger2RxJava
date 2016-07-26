package com.yz.app.di.component;

import android.app.Activity;

import com.yz.app.di.PerActivity;
import com.yz.app.di.module.ActivityModule;

import dagger.Component;

@PerActivity
@Component(modules = ActivityModule.class)
public interface ActivityComponent {

    Activity activity();
}