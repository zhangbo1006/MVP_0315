package com.example.mvp_0315.mvp.view.activity;

import android.os.Bundle;
import android.util.Log;

import com.example.mvp_0315.R;
import com.example.mvp_0315.mvp.presenter.presenterimpl.HomePresenter;
import com.example.mvp_0315.mvp.view.base.BaseActivity;
import com.example.mvp_0315.mvp.view.contract.Contract;

public class MainActivity extends BaseActivity<Contract.HomeView,HomePresenter> implements Contract.HomeView {

    private HomePresenter homePresenter;

    @Override
    protected void initActivityView(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void initView() {

    }

    @Override
    protected HomePresenter createPresenter() {
        homePresenter = new HomePresenter();
        return homePresenter;
    }

    @Override
    protected void getData() {
        homePresenter.onIHomePre();
    }

    @Override
    public void onHomeSuccess(Object o) {
        Log.i("首页Activity",o.toString());
    }

    @Override
    public void onHomeFail(String errorInfo) {

    }
}
