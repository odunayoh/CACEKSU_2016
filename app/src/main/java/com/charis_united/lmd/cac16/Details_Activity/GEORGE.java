package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class GEORGE extends AppCompatActivity {
    TextView tuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_george);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tuy = (TextView) findViewById(R.id.textgeorge);
        tuy.setText(String.format("Name;George Kehinde Omolayo\nNickname; Senator George\nSex; Male\nD.O.B; 11th Of August\nHome Town;Ipokia\nL.G.A;Ipokia Local Government\nState Of Origin;Ogun State\nHome Address;George Close, Oluyole Industrial Estate Ibadan\nFaculty;Engineering\nDepartment;Civil Engineering\nWhatsapp/Phone Number(S);08060305100 And 07033401212\nE-Mail;Kgeorjices10”Yahoo.Com\nFacebook Username;George Kehinde Omolayo \nInstagram Username;Georjices\nBb Pin;\nFavourite Food;Amala, Ewedu And Turkey\nFavourite Colour;Purple And Blue\nFavourite Quote;My Life Is For Rent\nFavourite Bible Verse;Ecc 11 Vs 9\nTurn On;Honesty And Self Confidence\nTurn Off;Lies And Low Self Esteem\nMarital Status;Complicated\nPost Held;Deputy Governor, Faculty P.R.0 2012/2013, Faculty Social Director 2014/2015, Eksu Student Union Senator(Audit Committee Chairman And Acting Sport&Social Committee Chairman)2015/2016\n"));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
