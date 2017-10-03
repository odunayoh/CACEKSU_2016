package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class OLANIPEKUN extends AppCompatActivity {
    TextView tuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_olanipekun);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tuy = (TextView) findViewById(R.id.textolanipekun);
        tuy.setText(String.format("NAME;OLANIPEKUN TOBILOBA EMMANUEL\nNICKNAME;ENDLESSRICHES\nSEX;MALE\nD.O.B;15TH APRIL \nHOME TOWN;OSUN\nL.G.A; OBOKUN LGA\nSTATE OF ORIGIN; OSUN STATE\nHOME ADDRESS; ALAKIA ADEGBAYI IBADAN\nFACULTY; SCIENCES SLT\nDEPARTMENT; BIOCHEMISTRY\nWHATSAPP/PHONE NUMBER(S); 08100768734\nE-MAIL; tobbyboi4real@yahoo.com\nFACEBOOK USERNAME; OLANIPEKUN TOBILOBA EMMANUEL\n INSTAGRAM USERNAME;\nBB PIN;\nFAVOURITE FOOD; POUNDED YAM AND EGUSI SOUP \nFAVOURITE COLOUR; WHITE\nFAVOURITE QUOTE; JOHN 3 : 16 \nFAVOURITE BIBLE VERSE;\nTURN ON;HARDWORK AND CREATIVITY\nTURN OFF;HYPOCRISY AND DISHONESTY\nMARITAL STATUS;SINGLE\nPOST HELD; IFAKI COORDINATOR\n"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
