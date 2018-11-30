package com.bj.luapp.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * lucky 2018/11/29
 * 2018 16:34
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        titleBar();
        super.onCreate(savedInstanceState);
        //  setContentView();
     /*   intView();
        initData();
*/
    }
/*
    private abstract void getlayoutID();

    private abstract void initData() {

    }

    private abstract void intView() {
    }*/

    /*状态栏适配*/
    public static void titleBar() {
    }
}
