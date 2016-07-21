package com.yz.app.di.component;

import com.yz.app.di.ForActivity;
import com.yz.app.di.module.ActivityModule;

import dagger.Component;
@ForActivity
@Component( modules = ActivityModule.class)
public interface ActivityComponent {
}