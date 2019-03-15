package com.example.mvp_0315.mvp.view.contract;

public class Contract {
    public interface HomeView{

        void onHomeSuccess(Object o);

        void onHomeFail(String errorInfo);

    }
    public interface HomePre{

        void onIHomePre();

    }
    public interface HomeModel{
        void Home(HomeCallBack homeCallBack);
    }

    public interface HomeCallBack{
        void onSuccess(Object o);

        void onFail(String errorInfo);
    }
}
