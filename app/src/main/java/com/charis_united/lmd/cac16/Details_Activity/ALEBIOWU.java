package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class ALEBIOWU extends AppCompatActivity {

    TextView bnm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alebiowu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
bnm = (TextView) findViewById(R.id.textalebiowu);
        bnm.setText("Name;Alebiowu Motunrayo A");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
