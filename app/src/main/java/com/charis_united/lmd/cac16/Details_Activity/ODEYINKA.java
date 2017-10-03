package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class ODEYINKA extends AppCompatActivity {
    TextView tuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_odeyink);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tuy = (TextView) findViewById(R.id.textodeyinka);
        tuy.setText(String.format("NAME; ODEYINKA KAYODE TOBI\nNICKNAME;\nSEX;MALE\nD.O.B;13TH AUGUST\nHOME TOWN;OSUN STATE\nL.G.A;BOLUWADURO LOCAL GOVERNMENT\nSTATE OF ORIGIN;OSUN STATE\nHOME ADDRESS;1,ODEYINKS CLOSE.IGBOGBO ALAYO,IJAKO,SANGO OTA\nFACULTY;SCIENCE\nDEPARTMENT;COMPUTER SCIENCE\nWHATSAPP/PHONE NUMBER(S);08164871576\nE-MAIL;KODEYINKA@GMAIL.COM\nFACEBOOK USERNAME;KAYODE ODEYINKA\nINSTAGRAM USERNAME;\nBB PIN;\nFAVOURITE FOOD;BEANS\nFAVOURITE COLOUR;GREEN AND PURPLE\nFAVOURITE QUOTE;THE BEST IS YET TO COME\nFAVOURITE BIBLE VERSE;2CORINTHIANS 5 VS 17\nTURN ON;SEEING OTHERS AND YOURSELF AS GOD SEES THEM\nTURN OFF;EASILY GIVING UP ON GOD’S WORD ABOUT ANYTHING\nMARITAL STATUS;SINGLE\nPOST HELD;GENERAL COORDINATOR(2015/2016) SESSION\n"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
