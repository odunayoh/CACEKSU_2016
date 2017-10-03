package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class FAMILUSI extends AppCompatActivity {
    TextView tuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_familusi);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tuy = (TextView) findViewById(R.id.textfamilusi);
       tuy.setText(String.format("Name;Familusi Oluwaseun Abayomi\nNickname;Dr Shema\nSex;Male\nD.O.B;1st May\nHome Town;Imesi Ile\nL.G.A;Obokun Local Government\nState Of Origin;Osun State\nHome Address;Ado Ekiti\nFaculty;Science\nDepartment;Statistics\nWhatsapp/Phone Number(S);08130447856,08060128468\nE-Mail;Currency014luv@Gmail.Com\nFacebook Username;Familusi Oluwaseun\nInstagram Username;Familusi 01\nFavourite Food;Pounded Yam With Egusi Soup\nFavourite Colour;Pink\nFavourite Quote;What Will Be ..Will Be..All Is Well\nFavourite Bible Verse;Luke 12 Vs 23 The Life Is More Than Meat,And The Body Is More Than Raiment\nTurn On;Honesty\nTurn Off;Lies And Disobedient\nMarital Status;Single\nPost Held;\n"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
