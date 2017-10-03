package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class OGUNROTIMI extends AppCompatActivity {
    TextView tuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ogunrotimi);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tuy = (TextView) findViewById(R.id.textogunrotimi);
        tuy.setText(String.format("NAME: OGUNROTIMI SHINA JOHN\nNICKNAME: OLATAYO\nSEX: MALE\nDOB: 24TH AUG\nHOME TOWN: OSI EKITI\nLGA: IDO OSI \nSTATE OF ORIGIN: EKITI\nHOME ADDRESS: IREPODUN STREET, OLUFOAM, AKURE\nFACULTY: EDUCATION\nDEPARTMENT: POLITICAL SCIENCE\nNUMBEER/WHATSAPP: 07064405572\nEMAIL: ROTIMISHINA@YMAIL.COM/THARYOUR31@GMAIL.COM\nFACEBOOK: JEFF ROTIMI\nFAVOURITE FOOD: POUNDED YAM WITH EGUSI SOUP\nFAVOURITE COLOUR: BLACK\nFAVOURITE BIBLE VERSE: PHIL. 1:6\nTURN ON: HONESTY\nTURN OFF: LIES\nMARITAL STATUS: ENGAGED\n"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
