package com.charis_united.lmd.cac16.FireBase;

import android.app.Application;

/**
 * Created by Baba2nde on 10/4/2016.
 */
public class AwesomeFireBase extends Application
{

    private static final String TAG = "AwesomeFireBase";


    @Override
    public void onCreate()
    {
        super.onCreate();
       // Firebase.setAndroidContext(this);
    }

}
