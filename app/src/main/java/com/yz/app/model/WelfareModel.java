package com.yz.app.model;

import com.yz.app.App;
import com.yz.app.entity.ImageData;

import javax.inject.Inject;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
 * 项目名称：RetrofitDagger2RxJava
 * 类描述：
 * 创建人：zhangwei
 * 创建时间：2016-07-18 17:41
 * 修改人：zhangwei
 * 修改时间：2016-07-18 17:41
 * 修改备注：
 */

public class WelfareModel {

    @Inject
    public WelfareModel() {
    }

    public void getWelfareData(int page, Action1<ImageData> action) {
        Observable<ImageData> imageData = App.getInstance()
                .getAppComponent()
                .getApiService()
                .getImageData(page);
        imageData.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(action);
    }

}
