package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class ODEBUNMI extends AppCompatActivity {
    TextView tuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_odebunmi);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tuy = (TextView) findViewById(R.id.textodebunmi);
        tuy.setText(String.format("NAME: ODEBUNMI YINKA SAMUEL\t\nNICK NAME:YCONCEPT\nSEX:MALE\nD.O.B:3RD OCTOBER\nHOME TOWN:……\nL.G.A:OYE LGA\nSTATE OF ORIGIN:EKITI STATE\nHOME ADDRESS:TANKE,ILORIN KWARA STATE\nFACULTY:EDUCATION\nDEPARTMENT:SOCIAL SCIENCE(EDUCATION)\nWHATSAPP/PHONE NUMBER(S):07035667617\nE-MAIL:odebunmiyinka@yahoo.com\nFACEBOOK USERNAME: horlayimiker odebunmi\nINSTAGRAM USERNAME:\nBB PIN:5eea6560\nFAVOURITE FOOD: poundedyam with egusi\nFAVOURITE COLOUR:lilac and blue\nFAVOURITE QUOTE:life will never give what you deserve, u gat to contend for it\nFAVOURITE BIBLE VERSE: Gen 15:1\nTURN ON : music\nTURN OFF: laziness and deceit\nMARITAL STATUS: single\nPOST HELD: hall rep (satellite)\n"));


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
