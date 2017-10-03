package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class OGUNDINIYI extends AppCompatActivity {
    TextView tuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ogundiniyi);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tuy = (TextView) findViewById(R.id.textogundiniyi);
        tuy.setText(String.format("NAME; OGUNDINIYI ABIODUN PAUL \nNICKNAME;BABA SEME\nSEX;MALE\nD.O.B;31ST DECEMBER\nHOME TOWN;IBADAN\nL.G.A;ALADE IDANRE\nSTATE OF ORIGIN;ONDO\nHOME ADDRESS;E9/763,AGODI GATE,PRISON,IBADAN\nFACULTY;SOCIAL SCIENCES\nDEPARTMENT;PSYCHOLOGY\nWHATSAPP/PHONE NUMBER(S);08169254611\nE-MAIL;OGUNDINIYI@GMAIL.COM\nFACEBOOK USERNAME;\nINSTAGRAM USERNAME;\nBB PIN;\nFAVOURITE FOOD;POUNDED YAM AND VEGETABLE\nFAVOURITE COLOUR;WHITE\nFAVOURITE QUOTE;THE LORD STRONG IN BATTLE IS MY GOD\nFAVOURITE BIBLE VERSE;LUKE 4 VS 17-21\nTURN ON;\nTURN OFF;\nMARITAL STATUS;SINGLE\nPOST HELD;ZION ZONE WELFARE SECRETARY(2015/2016) SESSION\n"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
