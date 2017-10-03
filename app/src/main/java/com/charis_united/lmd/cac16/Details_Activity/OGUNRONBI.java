package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class OGUNRONBI extends AppCompatActivity {
    TextView tuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ogunronbi);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tuy = (TextView) findViewById(R.id.textogunronbi);
        tuy.setText(String.format("NAME: ogunronbi oluwatoyin Judith\nNICKNAME: Apoti eri\nSEX;female\nD.O.B;6th December\nHOME TOWN;Ibadan\nL.G.A;akinyele\nSTATE OF ORIGIN;oyo\nHOME ADDRESS;awka anambra state\nFACULTY; science\nDEPARTMENT; biochemistry\nWHATSAPP/PHONE NUMBERS;08160858829\nE-MAIL Judith. toyin36@gmail.com\nFACEBOOK USERNAME;TOYIN Judith\nINSTAGRAM USERNAME:\nBB PIN;\nFAVOURITE FOOD; rice and dodo\nFAVOURITE COLOUR; pink\nFAVOURITE QUOTE; an anthill will ever be ,no matter how the elephant tramples it.\nFAVOURITE BIBLE VERSE; God is able to do exceedingly abundantly more than we can ask or think.\nTURN ON (LIKES);honesty and love\nTURN OFF (DISLIKES):hatred and lies\nMARITAL STATUS; single\nPOST HELD; welfare directress\n"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
