package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class OJO extends AppCompatActivity {
    TextView tuy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ojo);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tuy = (TextView) findViewById(R.id.textojo);
        tuy.setText(String.format("NAME;OJO OLUWASEYI MERCY \nNICKNAME;YEMMYSHEX\nSEX;FEMALE\nD.O.B;3RD NOBEMBER\nHOME TOWN;AKURE\nL.G.A;AKURE SOUTH\nSTATE OF ORIGIN;ONDO STATE\nHOME ADDRESS;\nFACULTY;ENGINEERING\nDEPARTMENT;CIVIL ENGINEERING\nWHATSAPP/PHONE NUMBER(S);07060835339\nE-MAIL;CEDDONMERCY@GMAIL.COM\nFACEBOOK USERNAME;SEYI MERCY OJO\nINSTAGRAM USERNAME;TEMMYSHEX\nBB PIN;\nFAVOURITE FOOD;SPAGHETTI AND PORRIDGE\nFAVOURITE COLOUR;GREEN\nFAVOURITE QUOTE;THE END OF A THING IS BETTER THAN THE BEGINNING\nFAVOURITE BIBLE VERSE;PSALM 23 VS 1\nTURN ON;SWIMMING AND READING\nTURN OFF;CUNNY PEOPLE\nMARITAL STATUS;SINGLE\nPOST HELD;LIBRARY AND COUNSELLING COORDINATOR\n"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
