package com.example.jayarbautista.retrofitsample;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by Jay R Bautista on 8/2/2016.
 */
public interface gitapi {
    @GET("/users/{user}")
    public void getFeed(@Path("user") String user, Callback<gitmodel> response);
}
