package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class ORIDUPA extends AppCompatActivity {
    TextView tuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oridup);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tuy = (TextView) findViewById(R.id.textoridupe);
        tuy.setText(String.format("NAME; ORIDUPA YETUNDE SUSAN\nNICKNAME;YETTY\nSEX;FEMALE\nD.O.B;30TH SEPTEMBER\nHOME TOWN;OKELUSE\nL.G.A;OSE LOCAL GOVERNMENT,IFON\nSTATE OF ORIGIN;ONDO STATE\nHOME ADDRESS;26,KAJOLA QUARTERS,OFF AKURE HIGH SCHOOL,AKURE\nFACULTY;SOCIAL SCIENCE\nDEPARTMENT;PSYCHOLOGY\nWHATSAPP/PHONE NUMBER(S);08138581397\nE-MAIL;YETUNDESUSAN@GMAIL.COM\nFACEBOOK USERNAME; YETUNDESUSAN.1\nINSTAGRAM USERNAME;\nBB PIN;\nFAVOURITE FOOD;POUNDED YAM AND EFO RIRO\nFAVOURITE COLOUR;PINK\nFAVOURITE QUOTE;DON’T GIVE UP UNTIL YOU ACHIEVE YOUR GOAL\nFAVOURITE BIBLE VERSE;PSALM 23 VS 1\nTURN ON;TRUST\nTURN OFF;JEALOUSY\nMARITAL STATUS;SINGLE\nPOST HELD;\n"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
