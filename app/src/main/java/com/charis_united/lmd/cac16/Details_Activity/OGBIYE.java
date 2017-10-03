package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class OGBIYE extends AppCompatActivity {
    TextView tuy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ogbiye);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tuy = (TextView) findViewById(R.id.textogbiyi);
        tuy.setText(String.format("NAME:  OGBIYE RACHAEL OLUWAKEMI\nNICK NAME: KEMI\nSEX: FEMALE \nD.O.B: 28TH APRIL 19**\nHOME TOWN: IKERE \nL.G.A: IKERE LGA\nSTATE OF ORIGIN: EKITI\nHOME ADDRESS: NO 7, OKE OSUN, IKERE EKITI\nFACULTY: EDUCATION \nDEPARTMENT: EDUCATIONAL MANAGEMENT\nWHATSAPP/PHONE NUMBER(S): 08061345443\nE-MAIL: oluwakemirachaelo1@yahoo.com\nFACEBOOK USERNAME: ogbiye7\nINSTAGRAM USERNAME: nil\nBB PIN: nil\nFAVOURITE FOOD: semo and egusi soup\nFAVOURITE COLOUR: green \nFAVOURITE QUOTE: change your mind you change your world( believe right to live right)\nFAVOURITE BIBLE VERSE: ROM 8V28\nTURN ON : TRUTH\nTURN OFF: LIES\nMARITAL STATUS: SINGLE\n"));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
