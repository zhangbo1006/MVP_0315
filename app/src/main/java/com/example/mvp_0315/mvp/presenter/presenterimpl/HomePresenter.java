package com.example.mvp_0315.mvp.presenter.presenterimpl;

import android.util.Log;

import com.example.mvp_0315.mvp.model.modelimpl.HomeModelImpl;
import com.example.mvp_0315.mvp.presenter.basepresenter.BasePresenter;
import com.example.mvp_0315.mvp.view.contract.Contract;

public class HomePresenter extends BasePresenter<Contract.HomeView> implements Contract.HomePre {
    private HomeModelImpl homeModelImpl;

    public HomePresenter(){
        homeModelImpl = new HomeModelImpl();
    }

    @Override
    public void onIHomePre() {
        homeModelImpl.Home(new Contract.HomeCallBack() {
            @Override
            public void onSuccess(Object o) {
                Log.i("首页P",o.toString());
                getView().onHomeSuccess(o);
            }

            @Override
            public void onFail(String errorInfo) {

            }
        });
    }
}
