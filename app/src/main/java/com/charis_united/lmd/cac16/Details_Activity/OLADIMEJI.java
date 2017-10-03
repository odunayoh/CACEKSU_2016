package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class OLADIMEJI extends AppCompatActivity {
    TextView tuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oladimeji);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tuy = (TextView) findViewById(R.id.textoladimeji);
        tuy.setText(String.format("NAME: OLADIMEJI ENIOLA M.\nNICKNAME: PORTABLE\nSEX: FEMALE\nD.O.B: JANUARY 27\nHOME TOWN: ADO-EKITI\nL.G.A: ADO LOCAL GOVT.\nSTATE OF ORIGIN: EKITI\nHOME ADDRESS: NO. 1, LORUKO JESU STREET, BASIRI ADO EKITI\nFACULTY: EDUCATION\nDAPARTMENT: GUIDANCE AND COUNSELLING\nNUMBER/WHATSAAP: 080377447102/07036384531\nEMAIL: ENIOLADIMEJI01@GMAIL.COM\nFACEBOOK: ENIOLA AYO\nFAVOURITEB FOOD: DODO AND EGG\nFAVOURITE COLOUR: WHITE\nFAVOURITE QUOTE: I will praise thee; for I am fearfully and wonderfully made.\nFAVOURITE BIBLE VERSE: ECCLESIASTES 3: 1\nTURN ON: LOVE AND HONESTY\nTURN OFF: CHEATING AND GOSSIP\nMARITAL STATUS: SINGLE\n"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
