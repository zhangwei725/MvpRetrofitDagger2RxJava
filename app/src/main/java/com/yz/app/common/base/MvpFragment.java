package com.yz.app.common.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

public abstract class MvpFragment<IV extends BaseView, P extends BasePresenter<IV>>
        extends BaseFragment implements BaseView {

    public BasePresenter<IV> mPresenter;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (mPresenter == null) {
            mPresenter = createPresenter();
        }
        setPresenter(mPresenter);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (mPresenter != null) {
            mPresenter.detachView();
        }
    }

    @Override
    public void setPresenter(@NonNull BasePresenter presenter) {
        this.mPresenter = presenter;
    }


    @Override
    @NonNull
    public abstract
    P createPresenter();
}