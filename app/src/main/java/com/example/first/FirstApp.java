package com.example.first;

import android.app.Application;

public class FirstApp extends Application {

    public static FirstApp sInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
    }
}
