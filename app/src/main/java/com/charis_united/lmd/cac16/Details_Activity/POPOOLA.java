package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class POPOOLA extends AppCompatActivity {
    TextView tuy;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popool);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tuy = (TextView) findViewById(R.id.textpopoola);
        tuy.setText(String.format("NAME: POPOOLA OLUWAGBENGA MATTHEW\nNICKNAME: PROF. G.\nDOB. 20 NOV.\nHOME TOWN: ILUPEJU EKITI\nL.G.A: OYE \nSTATE OF ORIGIN: EKITI\nHOME ADDRESS: N0. 13 ESINKUN STT. ILUPEJU EKITI\nFACULTY: EDUCATION\nDEPARTMENT: GUIDAINCE AND COUNSELLING\nNUMBER/WHATSAPP: 08139675540\nEMAIL: gbengamayor@gmail.com\nFACEBOOK: MATTHEWGBENGA POPOOLA\nFAVOURITE: BEANS\nFAVOURITE COLOUR: WHITE AND BLACK\nFAVOURITE QUOTE: Eye hath not seen, nor ear heard, neither has it entered into the heart of men, the        things which God hath prepared for them that love him.\nTURN ON: HONEST\nTURN OFF: FORMING, DISHONESTY\nMARITAL STATUS: SINGLE\nPOST HELD: TECHNICAL DIRECTOR\n"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
