package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class AFOWOWE extends AppCompatActivity {
    TextView textViewv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afowowe);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        textViewv = (TextView) findViewById(R.id.textafowowe);
        textViewv.setText("Name; Afowowe Racheal Abiodun\n" +
                "Nickname;Treasure\n" +
                "Sex;Female\n" +
                "D.O.B;31st December\n" +
                "Home Town;Ipetu Ijesha\n" +
                "L.G.A;Oriade\n" +
                "State Of Origin;Osun\n" +
                "Home Address;35,Arewa Street, Apapa.Lagos\n" +
                "Faculty;Engineering\n" +
                "Department;Civil Engineering\n" +
                "Whatsapp/Phone Number(S);08165661266\n" +
                "E-Mail; Aforabio@Gmail.Com\n" +
                "Facebook Username;Afowowe Abiodun\n" +
                "Instagram Username;Afowowe Racheal\n" +
                "Bb Pin;\n" +
                "Favourite Food;Semo And Vegatable With Turkey\n" +
                "Favourite Colour;Blue And Pink\n" +
                "Favourite Quote;You Cant Give What You Don’t Have\n" +
                "Favourite Bible Verse;Romans 12 Vs 11\n" +
                "Turn On;Harmony\n" +
                "Turn Off;Rudeness\n" +
                "Marital Status;Engaged\n" +
                "Post Held;Bethel Zone Secretary And Ass’ Prayer Cordinator\n");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
