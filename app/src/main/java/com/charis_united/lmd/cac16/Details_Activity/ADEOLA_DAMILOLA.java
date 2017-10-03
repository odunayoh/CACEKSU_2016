package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class ADEOLA_DAMILOLA extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adeola__damilol);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        textView = (TextView) findViewById(R.id.textadeola);
        textView.setText(
                "NAME; ADEOLA DAMILOLA ESTHER\n" +
                "NICKNAME; \n" +
                "SEX;FEMALE\n" +
                "D.O.B; 21ST DEC\n" +
                "HOME TOWN;ODE EKITI\n" +
                "L.G.A; GBONYIN\n" +
                "STATE OF ORIGIN; EKITI STATE\n" +
                "HOME ADDRESS; EKITI STATE HOUSING ESTATE\n" +
                "FACULTY; EDUCATION\n" +
                "DEPARTMENT; V.T.E (AGRIC.SC.OPTION)\n" +
                "WHATSAPP/PHONE NUMBER(S); 08136689406\n" +
                "E-MAIL; ADEOLAD9@GMAIL.COM\n" +
                "FACEBOOK USERNAME; ADEOLA PROMISE\n" +
                "INSTAGRAM USERNAM;\n" +
                "BB PIN;\n" +
                "FAVOURITE FOOD; RICE AND BEANS\n" +
                "FAVOURITE COLOUR; BLUE\n" +
                "FAVOURITE QUOTE; GOD IS FAITHFUL \n" +
                "FAVOURITE BIBLE VERSE; PHIL 4:13\n" +
                "TURN ON; \n" +
                "TURN OFF;\n" +
                "MARITAL STATUS; SINGLE\n" +
                "POST HELD; \n");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
