package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class ILUMOKA extends AppCompatActivity {
    TextView tuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ilumok);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tuy = (TextView) findViewById(R.id.textilumok);
        tuy.setText(String.format("NAME; ILUMOKA OLUWABUNMI M\nNICKNAME;\nSEX;FEMALE\nD.O.B;19TH,JULY\nHOME TOWN;IGBARA ODO EKITI\nL.G.A;EKITI SOUTH WEST\nSTATE OF ORIGIN;EKITI STATE\nHOME ADDRESS;TIWADAYO ESTATE,OFFATEDO AREA, OSOGBO.\nFACULTY;ARTS\nDEPARTMENT;ENGLISH AND LITERARY STUDIES\nWHATSAPP/PHONE NUMBER(S);08035792002\nE-MAIL;OLUWABUNMIILIMOKA@GMAIL.COM\nFACEBOOK USERNAME;ILUMOKA OLUWABUNMI\nINSTAGRAM USERNAME;\nBB PIN;\nFAVOURITE FOOD;FRIED RICE AND CHICKEN\nFAVOURITE COLOUR;GREEN\nFAVOURITE QUOTE;TREAT OTHERS THE WAY YOU WILL WANT TO BE TREATED\nFAVOURITE BIBLE VERSE;LOOKING UNTO JESUS,THE AUTHOR AND FINISHER OF OUR FAITH\nTURN ON;SINCERITY\nTURN OFF;DECEIT\nMARITAL STATUS;SINGLE\nPOST HELD;NIL\n"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
