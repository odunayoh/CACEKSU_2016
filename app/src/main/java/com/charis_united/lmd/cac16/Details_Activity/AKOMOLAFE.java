package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class AKOMOLAFE extends AppCompatActivity {
    TextView tyo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akomolafe);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tyo = (TextView) findViewById(R.id.textakomolafe);
        tyo.setText(String.format("Name: Akomolafe Dorcas Oluwaseyi\nNick Name: Sheydus\nSex: Female\nD.O.B: 25/03\nHome Town: Igede Ekiti\nL.G.A: Ifelodun/Irepodun\nState Of Origin: Ekiti\nHome Address: No 3, Cele Strt Igbesa Ogun State\nFaculty: Education\nDepartment: Business Education\nWhatsapp/Phone Number(S): 08137010345\nE-Mail: Sheydus6@Gmail.Com\nFacebook Username: Akomolafe Dorcas Joy\nInstagram Username:Nil\nBb Pin:Nil\nFavourite Food: Poundedyamwith Egusi Soup\nFavourite Colour: White And Pink\nFavourite Quote: Life Is Not A Bed Of Roses\nFavourite Bible Verse:Looking Unto Jesus The Author And Finisher Our Faith\nTurn On : Honesty\nTurn Off: Dishonesty\nMarital Status:Single\n"));


    }

}
