package com.bj.luapp.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.bj.luapp.R;
import com.bj.lulibrary.utils.AppUtils;

/**
 * lucky 2018/11/30
 * 2018 10:14
 * 收集工具类
 */
public class AppActivity extends AppCompatActivity {

    private TextView app_name;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_main);

        initView();


    }

    private void initView() {
        app_name = (TextView) findViewById(R.id.app_main);
        int bar_height = AppUtils.getStatusBarHeight(AppActivity.this);
        String verName = AppUtils.getVerName(AppActivity.this);
        String appName = AppUtils.getAppName(AppActivity.this);
        int versionCode = AppUtils.getVersionCode(AppActivity.this);
        String versionName = AppUtils.getVersionName(AppActivity.this);
        String vendor = AppUtils.getVendor();
        String systemLanguage = AppUtils.getSystemLanguage();


        app_name.setText("状态栏高度:" + bar_height + "获取版本号名称:"
                + verName + "获取应用程序名称:" + appName + "获取当前本地apk的版本" + versionCode
                + "获取app版本名称:" + versionName + "获取制造商:" + vendor + "获取当前默认系统使用语言类型" + systemLanguage);

    }

}
