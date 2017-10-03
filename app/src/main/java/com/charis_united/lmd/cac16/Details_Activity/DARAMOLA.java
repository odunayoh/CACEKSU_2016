package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class DARAMOLA extends AppCompatActivity {
    TextView tuy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daramol);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tuy = (TextView) findViewById(R.id.textdaramola);
        tuy.setText(String.format("Name;Daramola Olajumoke\nNickname;Doj\nSex;Female\nD.O.B;Nov 22 199x\nHome Town;Ikere\nL.G.A;Ikere L.G\nState Of Origin;Ekiti State\nHome Address;No 12 Chrst Mission Lane Akure Ondo State\nFaculty;Education\nDepartment;Accounting\nWhatsapp/Phone Number(S);07063923953/07034907074\nE-Mail;Portablejummy4real@Yahoo.Com\nFacebook Username;Daramola Olajumoke\nInstagram Usernam;Nay\nBb Pin;Nay\nFavourite Food;Rice And Stew, Ponded Yam And Vegetable\nFavourite Colour;Pink\nFavourite Quote;I Can Do All Things Through Christ Who Strenthens Me\nFavourite Bible Verse;Phillippians 4;13\nTurn On;Honesty\nTurn Off;Cheating\nMarital Status;Single\nPost Held;Nay\n"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
