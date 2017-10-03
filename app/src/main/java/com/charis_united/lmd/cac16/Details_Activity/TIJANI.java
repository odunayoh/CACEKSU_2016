package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class TIJANI extends AppCompatActivity {
    TextView tuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tijani);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tuy = (TextView) findViewById(R.id.texttijani);
        tuy.setText(String.format("NAME;TIJANI ADEYINKA GRACE\nNICKNAME;DEYINKI\nSEX;FEMALE\nD.O.B;13TH MAY\nHOME TOWN;OYO\nL.G.A;IBARAPA CENTRE\nSTATE OF ORIGIN;OYO\nHOME ADDRESS;\nFACULTY;SOCIAL SCIENCE\nDEPARTMENT;ECONOMICS\nWHATSAPP/PHONE NUMBER(S);08108165045\nE-MAIL;ADEYINKA@GMAIL.COM\nFACEBOOK USERNAME;ADEGBAYE ADEYINKA\nINSTAGRAM USERNAME;\nBB PIN;\nFAVOURITE FOOD;AMALA AND EWEDU SOUP\nFAVOURITE COLOUR;PINK AND WHITE\nFAVOURITE QUOTE;WHEN THE LORD IS SPEAKING,ANY OTHER "));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
