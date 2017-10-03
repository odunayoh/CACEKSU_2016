package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class OLAITAN extends AppCompatActivity {
    TextView tuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_olaitan);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tuy = (TextView) findViewById(R.id.textolaitan);
        tuy.setText(String.format("NAME;OLAITAN OPEYEMI G \nNICKNAME;Olaope Go\nSEX;MALE\nD.O.B;6TH OCT \nHOME TOWN;ILA ORAGUN\nL.G.A;ILA ORAGUN\nSTATE OF ORIGIN;OSUN STATE\nHOME ADDRESS;\nFACULTY;SCIENCE\nDEPARTMENT;STATISTICS\nWHATSAPP/PHONE NUMBER(S);07066718569\nE-MAIL;\nFACEBOOK USERNAME;OLAITAN OPEYEMI\nINSTAGRAM USERNAME;\nBB PIN;\nFAVOURITE FOOD;ANYTHING EATABLE\nFAVOURITE COLOUR;\nFAVOURITE QUOTE;\nFAVOURITE BIBLE VERSE;PSALM 114\nTURN ON;\nTURN OFF;\nMARITAL STATUS;\nPOST HELD;\n"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
