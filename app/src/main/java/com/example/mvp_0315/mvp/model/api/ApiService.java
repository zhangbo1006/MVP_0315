package com.example.mvp_0315.mvp.model.api;

import com.example.mvp_0315.mvp.model.bean.HomeBean;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface ApiService {
    @GET(Api.BASE_API)
    Observable<HomeBean> getHome();
}
