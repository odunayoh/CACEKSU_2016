package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class OLAOLUWA extends AppCompatActivity {
    TextView tuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_olaoluw);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tuy = (TextView) findViewById(R.id.textolaolu);
        tuy.setText(String.format("NAME; OLAOLUWA SEUN E\nNICKNAME;OSCAR\nSEX;MALE\nD.O.B;\nHOME TOWN;\nL.G.A;\nSTATE OF ORIGIN;\nHOME ADDRESS;\nFACULTY;ARTS\nDEPARTMENT;ENGLISH AND LITERARY STUDIES\nWHATSAPP/PHONE NUMBER(S);\nE-MAIL;\nFACEBOOK USERNAME;\nINSTAGRAM USERNAM;\nBB PIN;\nFAVOURITE FOOD;\nFAVOURITE COLOUR;\nFAVOURITE QUOTE;\nFAVOURITE BIBLE VERSE;\nTURN ON;\nTURN OFF;\nMARITAL STATUS;\nPOST HELD;\n"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
