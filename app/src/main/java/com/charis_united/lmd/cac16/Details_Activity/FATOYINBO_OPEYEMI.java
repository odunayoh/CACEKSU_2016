package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class FATOYINBO_OPEYEMI extends AppCompatActivity {
    TextView tuy;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fatoyinbo__opeyemi);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tuy = (TextView) findViewById(R.id.textfatoyinboop);
        tuy.setText(String.format("Name:Fatoyinbo Opeyemi Promise\nNick Name:Promise\nSex:Male\nD.O.B:31st July\nHome Town:Ise Ekiti\nL.G.A: Ise Orun Ekiti\nState Of Origin:Ekiti\nHome Address:L/49 Olele Street,Ise Ekiti\nFaculty:Social Science\nDepartment:Sociology\nWhatsapp/Phone Number(S):08063195979\nE-Mail:Opeyemipromise@Gmail.Com\nFacebook Username:\nInstagram Username:\nBb Pin:\nFavourite Food:Rice&Beans\nFavourite Colour:Pink\nFavourite Quote:God Is Our Sufficiency\nFavourite Bible Verse:\nTurn On :Honesty\nTurn Off:Dishonesty\nMarital Status:Single\nPost Held:\n"));


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
