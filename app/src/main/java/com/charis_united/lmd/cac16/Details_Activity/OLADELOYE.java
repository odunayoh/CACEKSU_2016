package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class OLADELOYE extends AppCompatActivity {
    TextView tuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oladeloye);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tuy = (TextView) findViewById(R.id.textoladeloye);
        tuy.setText(String.format("NAME: OLADELOYE OLAWUMI MABEL\nNICK NAME: EYINJUOLODUMARE (TAOGE)\nSEX: FEMALE\nD.O.B: 26TH APRIL\nHOME TOWN: OWO\nL.G.A: OWO LGA\nSTATE OF ORIGIN: ONDO STATE\nHOME ADDRESS: NIL\nFACULTY: ARTS\nDEPARTMENT: ENGLISH AND LITERARY STUDIES\nWHATSAPP/PHONE NUMBER(S): 08136925652\nE-MAIL: wummywhite53@yahoo.com\nFACEBOOK USERNAME: OLADELOYE OLAWUMI MABEL\nINSTAGRAM USERNAME:\nBB PIN: 2BCEB938\nFAVOURITE FOOD: BEANS\nFAVOURITE COLOUR: WHITE, PURPLE & BLUE\nFAVOURITE QUOTE: NIL\nFAVOURITE BIBLE VERSE: GAL 3V2-5\nTURN ON : SINCERITY & LOYALTY\nTURN OFF: LIES & HYPOCRISY\nMARITAL STATUS: SINGLE\n\n \n"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
