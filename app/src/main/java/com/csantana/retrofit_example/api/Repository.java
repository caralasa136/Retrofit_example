package com.csantana.retrofit_example.api;

/**
 * Created by CLsantana on 02/11/16.
 */

public class Repository {

    private String id;
    private String name;

    @Override
    public String toString() {
        return id + "/" + name;
    }
}
