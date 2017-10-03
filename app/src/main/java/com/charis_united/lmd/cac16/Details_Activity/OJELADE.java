package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class OJELADE extends AppCompatActivity {
    TextView tuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ojelade);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tuy = (TextView) findViewById(R.id.textojelade);
        tuy.setText(String.format("NAME;Ojelade ifeoluwa\nNICKNAME;Dominionhify\nSEX;Male\nD.O.B;18th of oct\nSTATE OF ORIGIN;Osogbo\nL.G.A;Ifelodun\nHOMETOWN;Osun\nHOME ADDRESS;6 lane4 Asaolu strt ogungbade\nFACULTY;Science\nDEPARTMENT;Biochemistry\nWHATSAPP/PHONE CONTACT;08064540495\nE-MAIL;Olajmklove08064@gmail.com\nFACEBOOK ID;Horlayinkar love D\nFAVOURITE FOOD;Rice with anything\nFAVOURITE COLOUR;Blue\nFAVOURITE QUOTE;Never think too low bcos u r destine to domain\nFAVOURITE BIBLE VERSE;2pet 2\nTURN ON;Football nd being lively\nTURN OFF;Gossiping \nMARITAL STATUS;Engaged\nPOST HELD;Member\n\n\n"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
