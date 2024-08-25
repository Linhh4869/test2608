package com.example.resrfulapi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    @GET("check")
    Call<ApiResponse> checkMigrate(@Query("username") String userName);
}
