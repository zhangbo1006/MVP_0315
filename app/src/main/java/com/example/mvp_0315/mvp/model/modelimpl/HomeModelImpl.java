package com.example.mvp_0315.mvp.model.modelimpl;

import android.util.Log;

import com.example.mvp_0315.mvp.model.api.ApiService;
import com.example.mvp_0315.mvp.model.bean.HomeBean;
import com.example.mvp_0315.mvp.model.network.RetrofitUtils;
import com.example.mvp_0315.mvp.view.contract.Contract;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DefaultObserver;
import io.reactivex.schedulers.Schedulers;

public class HomeModelImpl implements Contract.HomeModel {
    @Override
    public void Home(final Contract.HomeCallBack homeCallBack) {
        ApiService apiService = RetrofitUtils.getInstance().create(ApiService.class);
        apiService.getHome()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new DefaultObserver<HomeBean>() {
                    @Override
                    public void onNext(HomeBean homeBean) {
                        Log.i("首页M",homeBean.toString());
                        homeCallBack.onSuccess(homeBean);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
