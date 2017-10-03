package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class OYEDEJI extends AppCompatActivity {
    TextView tuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oyedeji);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tuy = (TextView) findViewById(R.id.textoyedeji);
        tuy.setText(String.format("NAME;OYEDEJI OLUWAFERANMI ESTHER\nNICKNAME;FERANMIA\nSEX;FEMALE\nD.O.B;24TH DECEMBER\nHOME TOWN;IGBAYE \nL.G.A;ODO-OTIN LOCAL GOVERNMENT\nSTATE OF ORIGIN;OSUN STATE\nHOME ADDRESS;AJILOSUN,ADO EKITI\nFACULTY;SCIENCES\nDEPARTMENT;PLANT SCIENCE AND BIOTECHNOLOGY\nWHATSAPP/PHONE NUMBER(S);08101077286\nE-MAIL;FERANMIOYE24@GMAIL.COM\nFACEBOOK USERNAME;OYEDEJI OLUWAFERANMI\nINSTAGRAM USERNAME;\nBB PIN;\nFAVOURITE FOOD;POUNDED YAM AND EGUSI SOUP\nFAVOURITE COLOUR;PURPLE\nFAVOURITE QUOTE;WHEN YOU STOP TALKING,YOU START TOUCHING @ RELATIONSHIP\nFAVOURITE BIBLE VERSE;ECCLESIASTES 2 VS 26,1 JOHN 3 VS 18\nTURN ON;LOVE AND GIVING\nTURN OFF;DON’T TAKE ME FOR GRANTED\nMARITAL STATUS;SINGLE\nPOST HELD;FYB SATELLITE REPRESENTATIVE\n"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
