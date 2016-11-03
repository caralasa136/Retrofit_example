package com.csantana.retrofit_example.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by CLsantana on 02/11/16.
 */

public class GithubClient {

    private Retrofit retrofit;
    private final static String BASE_URL = "https://api.github.com/";

        public GithubClient() {
            this.retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

    public GithubService getGithubService() {
        return this.retrofit.create(GithubService.class);
    }
}
