package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class IGE extends AppCompatActivity {

    TextView tuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ige);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tuy = (TextView) findViewById(R.id.textige);
        tuy.setText(String.format("Name: Ige Peter Ayobami\nNick Name: Privilege\nSex: Male\nD.O.B: 12th Oct\nHome Town: Atiba\nL.G.A: Atiba\nState Of Origin: Oyo\nHome Address: No 2, Ore Ofe Street Igando Lagos\nFaculty: Engineering\nDepartment: Civil Engineering\nWhatsapp/Phone Number(S): 07061399911\nE-Mail: Shegsmo816@Gmail.Com\nFacebook Username: Ige Peter\nInstagram Username:  Nil\nBb Pin: 2b752312\nFavourite Food: Rice And Watermelon\nFavourite Colour: Skyblue\nFavourite Quote: The Most Wasted Of All Days Is One Without Laughter\nFavourite Bible Verse: Phil 6\nTurn On : Teaching\nTurn Off: Disrespecting Of Elders\nMarital Status: Single\n"));


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
