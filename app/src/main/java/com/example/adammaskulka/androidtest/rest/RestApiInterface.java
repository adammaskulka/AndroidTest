package com.example.adammaskulka.androidtest.rest;

import com.example.adammaskulka.androidtest.rest.model.*;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface RestApiInterface {

    @GET("jokes/random")
    Call<ApiResponse> call_1();

    @GET("jokes/random")
    Call<ApiResponse> call_2();

    @GET("jokes/random")
    Call<ApiResponse> call_3();

    @GET("jokes/random")
    Call<ApiResponse> call_4();

}
