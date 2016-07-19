package com.yz.app.view.fragment;


import android.os.Bundle;
import android.support.annotation.NonNull;

import com.malinskiy.superrecyclerview.SuperRecyclerView;
import com.yz.app.R;
import com.yz.app.common.base.MvpFragment;
import com.yz.app.common.base.NetLoadView;
import com.yz.app.entity.Image;
import com.yz.app.preserter.WelfarePresenter;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;

public class WelfareFragment extends
        MvpFragment<NetLoadView<List<Image>>, WelfarePresenter>
        implements NetLoadView<List<Image>> {
    @Inject
    WelfarePresenter presenter;
    @BindView(R.id.welfare_srv)
    SuperRecyclerView welfareSrv;

    public static WelfareFragment newInstance() {
        Bundle args = new Bundle();
        WelfareFragment fragment = new WelfareFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @NonNull
    @Override
    public WelfarePresenter createPresenter() {
        return new WelfarePresenter();
    }

    @Override
    public void initView() {
//        welfareSrv.setAdapter();
        welfareSrv.setRefreshing(true);


    }

    @Override
    public void initData() {

    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_welfare;
    }


    @Override
    public void onSuccess(List<Image> data) {

    }

    @Override
    public void onFail(Throwable e) {

    }

}
