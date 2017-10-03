package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class MABIGUN extends AppCompatActivity {
    TextView tuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mabigun);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tuy = (TextView) findViewById(R.id.textmabigun);
        tuy.setText(String.format("NAME: MABIGUN ADESHOLA ESTHER\nNICKNAME: EMABS1\nSEX: FEMALE\nD.O.B:  9TH OF SEPTEMBER\nHOME TOWN: IJEBU ODE\nLGA: IJEBU ODE\nSTATE OF ORIGIN: OGUN\nHOME ADDRESS: 2, KOLAWOLE-EBODA STREET; KETU, LAGOS\nFACULTY: SCIENCE\nDEPARTMENT: CHEMISTRY\nNUMBER/WHATSAPP: 08100825105/09020338012\nE-MAIL: mabsadeshola999@yahoo.com\nFACEBOOK: MABIGUN ADESHLA ESTHER\nFAVOURITE FOOD: YAM & FRIED EGG\nFAVOURITE COLOUR: WHITE & PINK\nFAVOURITE QUOTE: The greatest failure is not the one who fails, but he that fails to raise when he fails\nFAVOURITE BIBLE VERSE: EPH. 1: 8\nTURN ON: MUSIC\nTURN OFF: LIES\nMARITAL STATUS: ENGAGED\nPOST HELD: FYB VICE- CHAIRMAN\n\n"));



        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
