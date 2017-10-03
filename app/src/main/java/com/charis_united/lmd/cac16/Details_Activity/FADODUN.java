package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class FADODUN extends AppCompatActivity {
    TextView tuy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fadodun);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tuy = (TextView) findViewById(R.id.textfadodun);
        tuy.setText(String.format("\nName: Fadodun Temitope Esther\nNickname; Temifad Stellah\nSex; Female\nD.O.B; 01 June \nHome Town; Ile- Ife\nL.G.A; Ife Central\nState Of Origin; Osun State\nHome Address; Sam Ethnan Naf Base Ikeja,Lagos State.\nFaculty; Engineering\nDepartment; Computer Engineering\nWhatsapp/Phone Number(S); 08038479805  ,08022939756\nE-Mail;Temifadstellah50@Gmail.Com ------------Temifad4success@Yahoo.Com\nFacebook Username; Fadodun Temitope Temifad Stellah\nFavourite Food; Pounded Yam/Semo Efo Riro Elemimeje And Chicken\nFavourite Colour; All Shades Of Blue\nFavourite Bible Verse;\nTurn On;\n"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
