package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class OGUNGBADE extends AppCompatActivity {
    TextView tuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ogungbade);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tuy = (TextView) findViewById(R.id.textogungbade);
        tuy.setText(String.format("NAME;OGUNGBADE AANUOLUWAPO TOSIN\nNICKNAME; T-GURL\nSEX; FEMALE\nD.O.B; AUGUST 19TH\nHOME TOWN; IYIN EKITI\nL.G.A; IFELODUN IREPODUN LOCAL GOVERNMENT\nSTATE OF ORIGIN; EKITI\nHOME ADDRESS; OGUN STATE\nFACULTY; MANAGEMENT SCIENCE\t\t\nDEPARTMENT; BANKING AND FINANCE\nWHATSAPP/PHONE NUMBER(S); 07064226034\nE-MAIL; \nFACEBOOK USERNAME; OGUNGBADE AANUOLUWAPO\nINSTAGRAM USERNAME;\nBB PIN;\nFAVOURITE FOOD; \nFAVOURITE COLOUR;\nFAVOURITE QUOTE;\nFAVOURITE BIBLE VERSE;\nTURN ON;\nTURN OFF;\nMARITAL STATUS; ENGAGED\nPOST HELD; \n\n\n"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
