package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class KOLAWOLE extends AppCompatActivity {
    TextView tuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kolawole);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tuy = (TextView) findViewById(R.id.textkola);
        tuy.setText(String.format("NAME: KOLAWOLE ADERONKE GRACE\nNICK NAME: PORTABLE\nSEX: FEMALE\nD.O.B: 13TH DEC\nHOME TOWN:  OKEMESI EKITI\nL.G.A: EKITI WEST\nSTATE OF ORIGIN: EKITI STATE\nHOME ADDRESS: NO 28 CHURCH STREET, PLEASURE BUS STOP LAGOS STATE\nFACULTY: SCIENCE\nDEPARTMENT: COMPUTER\nWHATSAPP/PHONE NUMBER(S): 07069330817\nE-MAIL: ronkybaby10@yahoo.com\nFACEBOOK USERNAME: kolawole ronke\nINSTAGRAM USERNAME: omg-itzgracie\nBB PIN: 5c47516d\nFAVOURITE FOOD: rice\nFAVOURITE COLOUR: white and pink\nFAVOURITE QUOTE: 2corinth 10:4-5 and eph 3:20-21\nFAVOURITE BIBLE VERSE: 2corinth 10:4-5 and eph 3:20-21\nTURN ON :nil\nTURN OFF:nil\nMARITAL STATUS: engaged\n"));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
