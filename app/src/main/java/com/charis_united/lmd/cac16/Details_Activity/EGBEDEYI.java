package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class EGBEDEYI extends AppCompatActivity {
    TextView tuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_egbedeyi);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tuy = (TextView) findViewById(R.id.textdaramola);
        tuy.setText(String.format("Name; Egbedeyi Jumoke Damilola\nNickname;Hollar J\nSex;Female\nD.O.B;29th April\nHome Town;Ibadan\nL.G.A;Ona Ara\nState Of Origin;Oyo State\nHome Address;Block D9,Ifelajulo,Sogade,Olunloyo.Ibadan\nFaculty;Engineering\nDepartment;Computer Engineering\nWhatsapp/Phone Number(S);08038358304\nE-Mail;Egbedeyijumoke@Gmail.Com\nFacebook Username;Egbedeyi Jumoke D\nInstagram Username;\nBb Pin;\nFavourite Food;\nFavourite Colour;Pink\nFavourite Quote;First Impression Lasts Longer\nFavourite Bible Verse;Romans 8 Vs 37\nTurn On;Honesty\nTurn Off;Cheating And Lies\nMarital Status;Single\nPost Held;\n"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
