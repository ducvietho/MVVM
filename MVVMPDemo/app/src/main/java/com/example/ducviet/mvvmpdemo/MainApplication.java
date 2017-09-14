package com.example.ducviet.mvvmpdemo;

import android.app.Application;
import android.content.Context;

/**
 * Created by ducviet on 14/09/2017.
 */

public class MainApplication extends Application {
    private static Context context;
    public static Context getContext(){return context;}

    @Override
    public void onCreate(){
        super.onCreate();
        context = getApplicationContext();

    }
}
