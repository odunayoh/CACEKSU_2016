package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class OLABODE extends AppCompatActivity {
    TextView tuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_olabode);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tuy = (TextView) findViewById(R.id.textolabode);
        tuy.setText(String.format("NAME; OLABODE PHEBE INIOLUWA\nNICKNAME;CHANOCKITE\nSEX;FEMALE\nD.O.B;1ST AUGUST\nHOME TOWN;OYAN TOWN\nL.G.A;ODO OTIN\nSTATE OF ORIGIN;OSUN\nHOME ADDRESS;ADJACENT METHODIST GRAMMAR SCHOOL,ONDO\nFACULTY;SCIENCE\nDEPARTMENT;GEOLOGY\nWHATSAPP/PHONE NUMBER(S);08136898490\nE-MAIL;OPHEBE@ROCKETMAIL.COM\nFACEBOOK USERNAME;OLABODE PHEBE\nINSTAGRAM USERNAME;\nBB PIN;287884DE\nFAVOURITE FOOD;EBA AND EGUSI/ELEFO SOUP\nFAVOURITE COLOUR;CHOCOLATE BROWN\nFAVOURITE QUOTE;\nFAVOURITE BIBLE VERSE;GALATIANS 2 VS 20\nTURN ON;\nTURN OFF;UNFAITHFULNESS\nMARITAL STATUS;SINGLE\nPOST HELD;FYB TREASURER\n"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
