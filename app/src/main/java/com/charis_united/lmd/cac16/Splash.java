package com.charis_united.lmd.cac16;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

        Thread timer = new Thread()
        {
            public void run()
            {
                try
                {
                    sleep(2500);
                } catch (Exception e)
                {
                    e.printStackTrace();
                    // TODO: handle exception

                }finally
                {
                    Intent intent= new Intent(Splash.this, MainActivity.class);

                    startActivity(intent);

                    finish();

                }
            }
        };
        timer.start();





    };


    }

