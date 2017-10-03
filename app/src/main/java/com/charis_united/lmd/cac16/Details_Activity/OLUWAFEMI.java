package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class OLUWAFEMI extends AppCompatActivity {
    TextView tuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oluwafemi);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tuy = (TextView) findViewById(R.id.textoluwafemi);
        tuy.setText(String.format("NAME; OLUWAFEMI AYOBAMI DAMILOLA\nNICKNAME; JORDAN\nSEX; MALE\nD.O.B; 27TH FEBRUARY\nHOME TOWN; ABEOKUTA\nL.G.A; OBAFEMI OWODE L.G.A\nSTATE OF ORIGIN; OGUN\nHOME ADDRESS; 12 HOSANNAH CLOSE,OTTA.OGUN STATE\nFACULTY;SCIENCE\nDEPARTMENT; PLANT SCIENCE\nWHATSAPP/PHONE NUMBER(S); 07060482284\nE-MAIL; fayo82@yahoo.com\nFACEBOOK USERNAME; OLUWAFEMI AYOBAMI JORDAN\nINSTAGRAM USERNAME;\nBB PIN;\nFAVOURITE FOOD; RICE\nFAVOURITE COLOUR; BLUE\nFAVOURITE QUOTE; THE AMOUNT OF KNOWLEDGE ,WISDOM ACQUIRED,IF NOT ADMINISTERED WITH PRUDENCE,WILL GIVE NOTHING BUT DEATH,INSTEAD LET IT GIVE LIFE\nFAVOURITE BIBLE VERSE; ROMANS 12 VS 11\nTURN ON; WISDOM AND PRUDENCE\nTURN OFF; ANGER\nMARITAL STATUS; SINGLE\nPOST HELD;USHERING COORDINATOR\n"));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
