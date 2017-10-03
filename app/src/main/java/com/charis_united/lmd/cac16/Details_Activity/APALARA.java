package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class APALARA extends AppCompatActivity {
    TextView tuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apalar);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
tuy = (TextView) findViewById(R.id.textapalar);
        tuy.setText(String.format("Name; Apalara Oluwabusayo\nNickname; Busayomi\nSex;Female\nD.O.B;8th Jan\nHome Town;Efon Alaaye\nL.G.A;Efon\nState Of Origin;Ekiti State\nHome Address;10 Apana Street,Off Coker Road Ejigbo\nFaculty;Sciences\nDepartment;Statistics\nWhatsapp/Phone Number(S);07065886121\nE-Mail;Lizayo20@Gmail.Com\nFacebook Username;Apalara Busayo\nInstagram Username;Busayomi\nBb Pin;7ae6b844\nFavourite Food;Amala And Ewedu\nFavourite Colour;Blue\nFavourite Quote;If God Be For Us,Who Can Be Against Us\nFavourite Bible Verse;Ephesians 6 Vs 10\nTurn On;Godliness\nTurn Off;Ungodliness\nMarital Status;Single\nPost Held;Gateway Zone Welfare Secretary\n"));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
