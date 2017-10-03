package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class ASAOLU extends AppCompatActivity {
    TextView tuy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asaolu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tuy = (TextView) findViewById(R.id.textasaolu);
        tuy.setText(String.format("Name; Asaolu Victor Olalekan\nNickname; Vickybom\nSex; Male\nD.O.B; 22/June\nHome Town; Efon Alaye\nL.G.A; Efon \nState Of Origin; Ekiti State\nHome Address; No 2 Igbeyinadun Street Ikola, Ipaja Lagos State\nFaculty; The Social Sciences\nDepartment; Geography And Planning Science\nWhatsapp/Phone Number(S); 08132958726\nE-Mail; Vickybomasaolu@Gmail.Com\nFacebook Username; Asaolu Victor\nInstagram Username; Vickybom92\nBb Pin; None\nFavourite Food; Pounded Yam Plus Egusi Soup+Coca-Cola\nFavourite Colour; Blue And Black\nFavourite Quote; With God All Thingd Are Possible\nFavourite Bible Verse; John 1 Vs 3\nTurn On; Godliness\nTurn Off; Lies And Dishonesty\nMarital Status; Single\nPost Held; Prayer\n"));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
