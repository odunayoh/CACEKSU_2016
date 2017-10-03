package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class LIBAMOYO extends AppCompatActivity {
    TextView tuy;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_libamoyo);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tuy = (TextView) findViewById(R.id.textliba);
        tuy.setText(String.format("NAME: LIBAMOYO OJO MICHEAL\nNICK NAME: MYKEL\nSEX: MALE\nD.O.B: 30/09\nHOME TOWN: ONDO\nL.G.A: ONDO WEST\nSTATE OF ORIGIN: ONDO\nHOME ADDRESS: NO 91 ROAD A PAM GROOVE OKA ONDO\nFACULTY: ENGINEERING\nDEPARTMENT: MECHANICAL \nWHATSAPP/PHONE NUMBER(S): 08165998750\nE-MAIL: libamoyoojomichael@gmail.com\nFACEBOOK USERNAME: OJO MICHAEL\nINSTAGRAM USERNAME:nil\nBB PIN: nil\nFAVOURITE FOOD: beans\nFAVOURITE COLOUR: blue\nFAVOURITE QUOTE: when you have everything, what could be your possibility desire? The one you love the most\nFAVOURITE BIBLE VERSE: john 14 :1\nTURN ON : good \nTURN OFF: bad\nMARITAL STATUS: single\n"));


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
