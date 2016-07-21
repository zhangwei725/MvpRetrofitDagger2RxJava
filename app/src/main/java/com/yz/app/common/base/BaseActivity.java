package com.yz.app.common.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * ----------BigGod be here!----------/
 * ***┏┓******┏┓*********
 * *┏━┛┻━━━━━━┛┻━━┓*******
 * *┃             ┃*******
 * *┃     ━━━     ┃*******
 * *┃             ┃*******
 * *┃  ━┳┛   ┗┳━  ┃*******
 * *┃             ┃*******
 * *┃     ━┻━     ┃*******
 * *┃             ┃*******
 * *┗━━━┓     ┏━━━┛*******
 * *****┃     ┃神兽保佑*****
 * *****┃     ┃代码无BUG！***
 * *****┃     ┗━━━━━━━━┓*****
 * *****┃              ┣┓****
 * *****┃              ┏┛****
 * *****┗━┓┓┏━━━━┳┓┏━━━┛*****
 * *******┃┫┫****┃┫┫********
 * *******┗┻┛****┗┻┛*********
 * ━━━━━━神兽出没━━━━━━
 *
 * 项目名称：RetrofitDagger2RxJava
 * 类描述：
 * 创建人：zhangwei
 * 创建时间：2016-07-17 16:59
 * 修改人：zhangwei
 * 修改时间：2016-07-17 16:59
 * 修改备注：
 */

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        if (savedInstanceState == null) {
            ButterKnife.bind(this);
            init();
        }
    }

    public abstract int getLayoutId();

    public final void init() {
        initView();
        initData();
    }

    public void initData() {

    }

    public abstract void initView();

//    protected AppComponent getAppComponent() {
//        return App.getInstance().getAppComponent();
//    }
//
//    protected ActivityModule getActivityModule() {
//        return new ActivityModule(this);
//    }

//    protected ActivityComponent getActivityComponent() {
//        return DaggerActivityComponent.builder()
//                .appComponent(getAppComponent())
//                .activityModule(getActivityModule())
//                .build();
//    }
}
