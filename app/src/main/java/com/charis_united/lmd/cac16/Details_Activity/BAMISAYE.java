package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class BAMISAYE extends AppCompatActivity {
    TextView tuy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bamisaye);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tuy = (TextView) findViewById(R.id.textbamisaye);
        tuy.setText(String.format("Name; Bamisaye Oluwafunmiilayo Ruth\nNick Name; Ruthie\nSex; Female\nD.O.B; Jan 2\nHome Town; Isaoye\nL.G.A.; Moba Lga\nState Of Origin…Ekiti State\nHome Address; N0 9, 0misanjana Strt, Along 132 Kll Road, Ado Ekiti\nFaculty;Arts\nDepartment;English And Literary Studies\nWhatsapp/Phone Number(S);07032489091\nE-Mail;Oluwafunmilayo760@Gmail.Com\nFacebook Username;Bamisaye Oluwafunmilayo Ruth\nInstagram Username;\nBb Pin;560a3b52\nFavourite Food;Yam And Egg\nFavourite Colour; White\nFavourite Quote;What Is Worth Doing Is Worth Doing Well\nFavourite Bible Verse;Matthew 7 Vs 12\nTurn On ;Honesty\nTurn Off;Dishonesty\nMarital Status;Engaged\nPost Held;Nil\n"));


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
