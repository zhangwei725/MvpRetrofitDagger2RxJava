package com.yz.app.di.component;

import android.app.Activity;

import com.yz.app.di.PerActivity;
import com.yz.app.di.module.ActivityModule;
import com.yz.app.view.activity.MainActivity;
import com.yz.app.view.fragment.WelfareFragment;

import dagger.Component;

@PerActivity
@Component(dependencies = AppComponent.class
        , modules = ActivityModule.class)
public interface ActivityComponent {
    Activity activity();

    void inject(WelfareFragment fragment);

    void inject(MainActivity activity);

}