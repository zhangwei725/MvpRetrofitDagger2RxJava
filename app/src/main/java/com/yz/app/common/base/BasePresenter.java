package com.yz.app.common.base;

import android.support.annotation.UiThread;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/**
 * 解决内存泄露
 *
 * @param <IV>
 */
public abstract class BasePresenter<IV extends BaseView> {
    protected Reference<IV> mViewRef;//View接口类型的弱引用

    @UiThread
    public void attachView(IV v) {
        mViewRef = new WeakReference<>(v);
    }

    public IV getView() {
        return mViewRef.get();
    }

    public boolean isAttchView() {
        return mViewRef != null && mViewRef.get() != null;
    }

    @UiThread
    public void detachView() {
        if (mViewRef != null) {
            mViewRef.clear();
            mViewRef = null;
        }
    }

    public static class MvpViewNotAttachedException extends RuntimeException {
        public MvpViewNotAttachedException() {
            super("Please call Presenter.attachView(MvpView) before" +
                    " requesting data to the Presenter");
        }
    }

}