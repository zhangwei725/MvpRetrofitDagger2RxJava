package com.yz.app.preserter;

import com.yz.app.common.base.BasePresenter;
import com.yz.app.common.base.NetLoadView;
import com.yz.app.entity.Image;
import com.yz.app.entity.ImageData;
import com.yz.app.model.WelfareModel;

import java.util.List;

import javax.inject.Inject;

import rx.functions.Action1;


public class WelfarePresenter extends BasePresenter<NetLoadView<List<Image>>> {
    @Inject
    WelfareModel model;

    @Inject
    public WelfarePresenter() {
    }

    public void getWelfareData(int page) {
        model.getWelfareData(page, new Action1<ImageData>() {
            @Override
            public void call(ImageData imageData) {
                if (!imageData.isError() && imageData.getResults() != null && !imageData.getResults().isEmpty()) {
                    getView().onSuccess(imageData.getResults());
                }
            }
        });
    }
}
