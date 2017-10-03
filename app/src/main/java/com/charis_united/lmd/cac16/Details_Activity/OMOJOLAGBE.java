package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class OMOJOLAGBE extends AppCompatActivity {

    TextView tuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_omojolagbe);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tuy = (TextView) findViewById(R.id.textomojolagbe);
        tuy.setText(String.format("NAME; OMOJOLAGBE BAMIDELE SAMUEL\nNICKNAME;KANOUTE\nSEX;MALE\nD.O.B;10TH OCTOBER\nHOME TOWN;AKURE\nL.G.A;AKURE SOUTH\nSTATE OF ORIGIN;ONDO STATE\nHOME ADDRESS;\nFACULTY;SOCIAL SCIENCE\nDEPARTMENT;PSYCHOLOGY\nWHATSAPP/PHONE NUMBER(S);08169727100, 08102365359\nE-MAIL;\nFACEBOOK USERNAME;\nINSTAGRAM USERNAME;\nBB PIN;\nFAVOURITE FOOD;EBA AND EGUSI\nFAVOURITE COLOUR;\nFAVOURITE QUOTE;WITH GOD ALL THINGS ARE POSSIBLE\nFAVOURITE BIBLE VERSE;PSALM 150 VS 6\nTURN ON;HONESTY\nTURN OFF;DISAPPOINTMENT\nMARITAL STATUS;SINGLE\nPOST HELD;\n"));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
