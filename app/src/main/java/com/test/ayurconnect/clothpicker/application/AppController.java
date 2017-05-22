package com.test.ayurconnect.clothpicker.application;

import android.app.Application;

import com.activeandroid.ActiveAndroid;

/**
 * Created by Nitish Singh on 16/1/17.
 */

public class AppController extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        ActiveAndroid.initialize(this);
    }


}
