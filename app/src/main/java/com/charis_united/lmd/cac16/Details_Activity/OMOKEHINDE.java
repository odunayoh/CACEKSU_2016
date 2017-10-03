package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class OMOKEHINDE extends AppCompatActivity {
    TextView tuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_omokehinde);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tuy = (TextView) findViewById(R.id.textomokehinde);
        tuy.setText(String.format("NAME: Omokehinde Tayo\nNICK NAME: Sirty\nSEX: Male\nD.O.B: 01/02/19**\nHOME TOWN: Idanre \nL.G.A: Idanre Lga\nSTATE OF ORIGIN: Ondo State\nHOME ADDRESS: New Town Utaja Road Idanre\nFACULTY: Education\nDEPARTMENT: Accounting Education\nWHATSAPP/PHONE NUMBER(S): 08069017804\nE-MAIL: Omokehindetayo@Gmail.Com\nFACEBOOK USERNAME: Tayo Kehinde\nINSTAGRAM USERNAME:Nil\nBB PIN:Nil\nFAVOURITE FOOD: Beans\nFAVOURITE COLOUR: White\nFAVOURITE QUOTE: Love All But Trust Few\nFAVOURITE BIBLE VERSE: Psalms 124:1\nTURN ON :Nil\nTURN OFF:Nil\nMARITAL STATUS:Single\nPOST HELD: Bethel Zone Rep\n"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
