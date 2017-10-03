package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class OROTAYO extends AppCompatActivity {
    TextView tuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orotayo);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tuy = (TextView) findViewById(R.id.textorotayo);
        tuy.setText(String.format("NAME; OROTAYO ADEWALE THOMAS\nNICKNAME;DIDYMUS\nSEX;MALE\nD.O.B;21ST NOVEMBER\nHOME TOWN;\nL.G.A;OKEIGBO, ILE OLUJI\nSTATE OF ORIGIN;ONDO STATE\nHOME ADDRESS;LINE 3,ZONE 3,EESA TITUN,IDO OSUN,OSUN STATE\nFACULTY;SCIENCES\nDEPARTMENT;BIOCHEMISTRY\nWHATSAPP/PHONE NUMBER(S);08031170480\nE-MAIL;DIDYMUS7007@GMAIL.COM\nFACEBOOK USERNAME;OROTAYO DIDYMUS ADEWALE\nINSTAGRAM USERNAM;\nBB PIN;\nFAVOURITE FOOD; POUNDED YAM WITH VEGETABLE AND EGUSI\nFAVOURITE COLOUR;NIL\nFAVOURITE QUOTE;\nFAVOURITE BIBLE VERSE; I JOHN 2;24\nTURN ON;LOVE AND HUMILITY\nTURN OFF;DISHONESTY,CUNNING CRAFTNESS OF MEN\nMARITAL STATUS;SINGLE\nPOST HELD;DRAMA COORDINATOR(2015/2016) TENURE\n"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
