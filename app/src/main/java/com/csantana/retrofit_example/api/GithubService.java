package com.csantana.retrofit_example.api;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by CLsantana on 02/11/16.
 */

public interface GithubService {
    @GET("users/{user}/repos")
    Call<List<Repository>> listRepo(@Path("user") String user);
}
