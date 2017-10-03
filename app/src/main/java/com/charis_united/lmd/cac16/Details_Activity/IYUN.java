package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class IYUN extends AppCompatActivity {
    TextView tuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iyun);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tuy = (TextView) findViewById(R.id.textiyun);
        tuy.setText(String.format("NAME;IYUN TITILAYO DORCAS\nNICKNAME;TABITHA\nSEX;FEMALE\nD.O.B;18TH AUGUST\nHOME TOWN;\nL.G.A;\nSTATE OF ORIGIN;\nHOME ADDRESS;37,DIPO OLUBI STREET IKATE\nFACULTY;SOCIAL SCIENCES\nDEPARTMENT;PSYCHOLOGY\nWHATSAPP/PHONE NUMBER(S);08061671569\nE-MAIL;\nFACEBOOK USERNAME;TITILAYO EMMANUEL\nINSTAGRAM USERNAME;\nBB PIN;\nFAVOURITE FOOD;RICE AND PLANTAIN\nFAVOURITE COLOUR;ANY COOL COLOUR\nFAVOURITE QUOTE;IT PAYS TO SERVE GOD\nFAVOURITE BIBLE VERSE;1PETER 1 VS 15\nTURN ON;PATIENCE\nTURN OFF;PRIDE\nMARITAL STATUS;SINGLE BUT SETTLED\nPOST HELD;NIL\n\n"));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
