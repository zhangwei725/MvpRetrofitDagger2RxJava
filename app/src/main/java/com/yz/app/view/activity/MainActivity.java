package com.yz.app.view.activity;


import android.content.Context;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.widget.Toast;

import com.yz.app.R;
import com.yz.app.common.base.BaseActivity;

public class MainActivity extends BaseActivity   {
    private FloatingActionButton fab;
    private Context mContext = this;
    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext,"你妈嗨",Toast.LENGTH_LONG);
            }
        });
    }

}
