package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class OKOILU extends AppCompatActivity {
    TextView tuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_okoilu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tuy = (TextView) findViewById(R.id.textokoilu);
        tuy.setText(String.format("NAME: OKOILU AYODEJI D.\nNICKNAME: C.H\nSEX: MALE\nDOB: 9TH JANUARY\nHOME TOWN: OKA AKOKO\nLGA: AKOKO SOUTH-WEST\nSTATE OF ORIGIN: ONDO STATE\nHOME ADDRESS: IKANMU, OKE OKA, AKOKO\nFACULTY: ENGINEERING\nDEPARTMENT: CIVIL ENGINEERING\nNUMBEER/WHATSAPP: 07030236463\nEMAIL: OLU4SAKE@GMAIL.COM\nFACEBOOK: AYODEJI D. OLUSOLA\nFAVOURITE FOOD: RICE AND BEANS\nFAVOURITE COLOUR: PINK AND PURPLE\nFAVOURITE QUOTE: DON’T GIVE UP, FOR IT WILL SURELY COME TO PASS\nFAVOURITE BIBLE VERSE: PSALM 16: 8\nTURN ON: MUSICAL SOUNDS, FOOTBALL WATCHING\nTURN OFF: INDISCIPLINE \nMARITAL STATUS: SINGLE\n\n"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
