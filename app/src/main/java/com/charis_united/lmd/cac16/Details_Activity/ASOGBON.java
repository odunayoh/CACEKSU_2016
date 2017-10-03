package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class ASOGBON extends AppCompatActivity {
    TextView tuy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asogbon);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tuy = (TextView) findViewById(R.id.textasogbon);
        tuy.setText(String.format("Name;Asogbon Samuel Oluwatimilehin\nNickname; Ashysam\nSex;Male\nD.O.B;13th,December\nHome Town;Ebute Ipare\nL.G.A;Ilaje\nState Of Origin;Ondo State\nHome Address;25,Mapamile Street,Okitipupa\nFaculty;Engineering\nDepartment;Civil Engineering\nWhatsapp/Phone Number(S); 0706 281 5532\nE-Mail;Samuel_Asogbon@Yahoo.Com\nFacebook Username;Samuel Asogbon\nInstagram Username;Ashysam\nBb Pin;\nFavourite Food;Nil\nFavourite Colour;White\nFavourite Quote; There Is No Limit To What You Can Achieve In Life,Just Believe In Yourself And Work Hard.\nFavourite Bible Verse;Romans 8 Vs 11\nTurn On;Praying,Giving,Honesty,Meekness,\nTurn Off;Pride,Laziness,Procrastination,Lying,\nMarital Status;Single\nPost Held;Fyb P.R.O\n\n"));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
