package com.yz.app.di.module;

import android.app.Activity;

import com.yz.app.R;
import com.yz.app.view.adapter.WelfareAdapter;

import dagger.Module;

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
 * 创建时间：2016-07-19 16:45
 * 修改人：zhangwei
 * 修改时间：2016-07-19 16:45
 * 修改备注：
 */
@Module
public class WelfareModule {
    public WelfareAdapter providesWelfareAdapter(Activity activity) {
        return new WelfareAdapter(activity, R.layout.adapter_welfare_layout);
    }


}
