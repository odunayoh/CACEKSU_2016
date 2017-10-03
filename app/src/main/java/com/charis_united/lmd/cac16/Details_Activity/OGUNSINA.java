package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class OGUNSINA extends AppCompatActivity {
    TextView tuy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ogunsin);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tuy = (TextView) findViewById(R.id.textogunsin);
        tuy.setText(String.format("NAME:Ogunsina Temitope Samuel\nNICKNAME\u202C: SAMKLEF\nGENDER; Male\nD.O.B; August 21\nHOME TOWN;Ibadan\nL.G.A: Egbeda local govt\nSTATE OF ORIGIN\u202C: Oyo state\nHOME ADDRESS\u202C: 2 ogunjobi street,new gbagi old ife road,ibadan,\nFACULTY\u202C: Education\nDEPARTMENT\u202C: Economics (social science dept)\nPHONE/WHATSAPP CONTACT\u202C: 08036836675\nE-MAIL\u202C: Temitopeogunsina@yahoo.com\nFACEBOOK ID; Ogunsina temitope samuel\nINSTAGRAM ID:nil\nBBPIN: 2B0901C3\nFAVOURITE FOOD\u202C: Anything sensible and edible\nFAVOURITE COLOUR\u202C: All cool colours.\nFAVOURITE BIBLE VERSE: Hebrew 11:1-3\nFAVOURITE QUOTE: Been straight forward/man or woman of ur words.\nTURN OFF: Hypocrite/dubious personalty\nMARITAL STATUS: Single\nPOST HELD: Faculty of Education GENERAL SECRETARY\n\n"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
