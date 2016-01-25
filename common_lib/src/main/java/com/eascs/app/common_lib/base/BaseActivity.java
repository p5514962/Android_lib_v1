package com.eascs.app.common_lib.base;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.eascs.app.common_lib.model.BaseEvent;
import com.eascs.app.common_lib.untils.ConvertUntil;

import de.greenrobot.event.EventBus;

/**
 * @author KevinHo
 * @version V1.0
 * @ClassName: BaseActivity
 * @Description: 公用父类activity
 * @email 20497342@qq.com
 * @date 2016/1/21
 */
public abstract class BaseActivity extends AppCompatActivity {

    protected abstract void setContentLayout();

    protected abstract void initViews();

    protected abstract void initDatas();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentLayout();//设置布局资源文件或对应布局view
        initViews();//初始化views
        addEvents();//设置
        initVars();//初始化变量
        initDatas();//初始化页面数据，如调用API接口
    }


    /**
     *
     */
    protected void addEvents() {
    }

    /**
     *
     */
    protected void initVars() {
    }

    //============生命周期方法============//
    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

}
