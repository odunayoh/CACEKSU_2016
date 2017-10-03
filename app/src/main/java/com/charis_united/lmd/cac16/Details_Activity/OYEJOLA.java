package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class OYEJOLA extends AppCompatActivity {
    TextView tuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oyejol);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tuy = (TextView) findViewById(R.id.textoyejol);
        tuy.setText(String.format("NAME;OYEJOLA OLUWAKEMISOLA ADEOLA\nNICKNAME;CHEMIRIUM\nSEX;FEMALE\nD.O.B;30TH JULY\nHOME TOWN;OKEMESI\nL.G.A;EKITI WEST\nSTATE OF ORIGIN;EKITI\nHOME ADDRESS;\nFACULTY;SCIENCE\nDEPARTMENT;CHEMISTRY\nWHATSAPP/PHONE NUMBER(S);08037244252\nE-MAIL;OYEJOLAOLUWAKEMI12345@GMAIL.COM\nFACEBOOK USERNAME;EZEKIEL CHEMIE\nINSTAGRAM USERNAME;NIL\nBB PIN;NIL\nFAVOURITE FOOD;SEMOLINA AND VEGETABLE SOUP\nFAVOURITE COLOUR;PINK AND NAVY BLUE\nFAVOURITE QUOTE;PHILLIPIANS 4 VS 13\nFAVOURITE BIBLE VERSE;LUKE 1 VS 37\nTURN ON;TRANSPARENCY\nTURN OFF;MALICE\nMARITAL STATUS;THE LORD IS DOING IT\nPOST HELD;GRACE TO CONTINUE IN CHRIST AND NOT LOOKING BACK\n\n"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
