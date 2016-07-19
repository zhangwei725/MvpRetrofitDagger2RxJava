package com.yz.app.entity;


import java.util.List;

/**
 * 随机数据Data
 * Created by Dimon on 2016/5/2.
 */
public class RandomData {
    public List<News> results;
    private boolean error;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }
}
