package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class GBAJUOLA extends AppCompatActivity {
    TextView tuy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gbajuol);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tuy = (TextView) findViewById(R.id.textgbajuol);
        tuy.setText(String.format("Name: Gbajuola Gideon O\nNick Name: Gideonite\nSex: Male\nD.O.B: Aug 18th\nHome Town:Oka Akoko\nL.G.A: Akoko South West\nState Of Origin: Ondo\nHome Address: Cac Alabukun Akinjaguola,Ondo\nFaculty: Agric Sciences\nDepartment: Forestry,Wildlife And Fish Management \nWhatsapp/Phone Number(S): 08067369513\nE-Mail: Gid4lovekonism@Yahoo.Com\nFacebook Username: Gbajuola Gideonite\nInstagram Username: Gideonite\nBb Pin: Nil\nFavourite Food: Iyan And Egusi Soup With Ogunfe\nFavourite Colour: Sky Blue And Pink \nFavourite Quote: Ile Aye Ile Asan\nFavourite Bible Verse: John 3:16\nTurn On : Hanging Out With Friends\nTurn Off: Lies And Dishonesty\nMarital Status: Single\n"));


    }

}
