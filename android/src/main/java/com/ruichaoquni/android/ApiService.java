package com.ruichaoquni.android;

import io.reactivex.Observable;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Url;

public interface ApiService {

    @GET("/wxarticle/chapters/json")
    Observable<Response<String>> test();
}
