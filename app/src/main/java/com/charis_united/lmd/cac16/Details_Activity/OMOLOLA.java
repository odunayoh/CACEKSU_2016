package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class OMOLOLA extends AppCompatActivity {
    TextView tuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_omolol);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tuy = (TextView) findViewById(R.id.textomolola);
        tuy.setText(String.format("NAME: OMOLOLA RICHARD NIYI\nNICK NAME:  PRINCE\nSEX: MALE\nD.O.B: 25TH JUNE\nHOME TOWN: IKERE EKITI\nL.G.A: IKERE LGA\nSTATE OF ORIGIN: EKITI STATE\nHOME ADDRESS: 118, ARAROMI STRT IKERE EKITI\nFACULTY: SCIENCE\nDEPARTMENT: ZOOLOGY\nWHATSAPP/PHONE NUMBER(S): 08144344867\nE-MAIL: NIL\nFACEBOOK USERNAME: OMOLOLARICHARD N\nINSTAGRAM USERNAME:NIL\nBB PIN:NIL\nFAVOURITE FOOD: RICE AND BEANS\nFAVOURITE COLOUR: PINK\nFAVOURITE QUOTE: THE DOWNFALL OF A MAN IS NOT THE END OF HIS LIFE\nFAVOURITE BIBLE VERSE: GEN 1: 27\nTURN ON : HONESTY AND FOLLOW PEACE WITH ALL MEN\nTURN OFF: DISOBEDIENCE\nMARITAL STATUS: SINGLE\nPOST HELD: NIL\n"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
