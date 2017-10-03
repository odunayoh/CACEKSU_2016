package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class OGUNMOYIN extends AppCompatActivity {
    TextView tuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ogunmoyin);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tuy = (TextView) findViewById(R.id.textsylvester);
        tuy.setText(String.format("NAME; OGUNMOYIN SYLVESTER OLAWALE\nNICKNAME;SYLVMAN\nSEX;MALE\nD.O.B;4TH NOVEMBER\nHOME TOWN;ODO ORO EKITI\nL.G.A;IKOLE LOCAL GOVERNMENT\nSTATE OF ORIGIN;EKITI STATE\nHOME ADDRESS;LANE 4, IFESOWAPO QUARTERS,ADEBAYO,ADO EKITI\nFACULTY;SCIENCE\nDEPARTMENT;COMPUTER SCIENCE\nWHATSAPP/PHONE NUMBER(S);08038393624\nE-MAIL;STALON4TOYLUV@YAHOOMAIL.COM\nFACEBOOK USERNAME;SYLVESTER OLAWALE\nINSTAGRAM USERNAME;SYLVESTER OLAWALE\nBB PIN;\nFAVOURITE FOOD;POUNDED YAM AND VEGETABLE SOUP\nFAVOURITE COLOUR;PINK\nFAVOURITE QUOTE;THE MEASURE OF A MAN IS NOT IN TIMES OF COMFORT AND CONVENIENCE,BUT IN TIMES OF TRIALS AND INCONVENIENCE.(MARTIN LUTHER KING JNR)\nFAVOURITE BIBLE VERSE;PHILEMON 1 VS 6\nTURN ON;MEEKNESS AND INTELLIGENCE\nTURN OFF;PRIDE AND DISLOYALTY\nMARITAL STATUS;IN A RELATIONSHIP\nPOST HELD;CHOIR COORDINATOR(2015/2016) SESSION\n"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
