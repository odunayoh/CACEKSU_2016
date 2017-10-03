package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class EHINFUNJOWO extends AppCompatActivity {
    TextView tuy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ehinfunjowo);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tuy = (TextView) findViewById(R.id.textehinfunjowo);

        tuy.setText(String.format("Name; Ehinfunjowo Ayodele P\nNickname;Oluomo\nSex;Male\nD.O.B;1st April\nHome Town;Ara Ijero Ekiti\nL.G.A;Ijero Ekiti\nState Of Origin;Ekiti\nHome Address;\nFaculty;\nDepartment;Statistics\nWhatsapp/Phone Number(S);08162392517\nE-Mail;Ehinfunjowopet@Yahoo.Com\nFacebook Username;Rudeboy\nInstagram Username;\nBb Pin;\nFavourite Food;Rice And Beans\nFavourite Colour;Blue\nFavourite Quote;Learn From Yesterday,Hope For Today And Dream Of Tomorrow\nFavourite Bible Verse;John 3 Vs 16\nTurn On;Faithfulness\nTurn Off;Lies\nMarital Status;In A Relationship\nPost Held;Honourable In School And Class Governor\n"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
