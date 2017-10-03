package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class ADESUGBA_ADEJOKE extends AppCompatActivity {
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adesugba__adejoke);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tv= (TextView) findViewById(R.id.textadesugba);
       // assert tv != null;
        tv.setText("NAME: ADESUGBA ADEJOKE ADEBUSOLAMI\n" +
                "NICKNAME: TRIPLE CROWN\n" +
                "SEX: FEMALE\n" +
                "DOB: 5TH FEB\n" +
                "HOME TOWN: OGBAGI AKOKO\n" +
                "LGA: AKOKO NORTH-WEST\n" +
                "STATE OF ORIGIN: ONDO STATE\n" +
                "HOME ADDRESS: odopo layout, ijoka  rd, Akure.\n" +
                "FACULTY: ARTS\n" +
                "DEPARTMENT: ENGLISH AND LITERARY STUDIES\n" +
                "NUMBER/WHATSAPP: 08160836831\n" +
                "FACEBOOK: ADEJOKE ADEBUSOLA EUNICE\n" +
                "FAVOURITE FOOD: SPHAG& STEW, MORSEL WITH DRAW SOAP\n" +
                "FAVOURITE COLOUR: GREEN\n" +
                "FAVOURITE QUOTE: Be yourself and try to adapt irrespective of any situation.\n" +
                "FAVOURITE BIBLE VERSE: The effective prayer of the righteous…\n" +
                "TURN ON: SINCERITY AND INDEPENDENCE\n" +
                "TURN OFF: INSULTS AND DISAPPOINTMENT\n" +
                "MARITAL STATUS: INDEPENDENTLY SINGLE\n");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
