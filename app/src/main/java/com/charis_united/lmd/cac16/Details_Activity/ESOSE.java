package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class ESOSE extends AppCompatActivity {
    TextView tuy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esose);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tuy = (TextView) findViewById(R.id.textesose);
        tuy.setText(String.format("Name: Esose Humphrey Ehiz\nNick Name: Oshey\nSex: Male\nD.O.B:  Nov 3rd\nHome Town: Ewossa \nL.G.A: Igueben\nState Of Origin: Edo State\nHome Address: No 76 Canaan-Land Qrts Off Ijoka Road Akure\nFaculty: Engineering\nDepartment: Mech\nWhatsapp/Phone Number(S): 08062854376\nE-Mail: Blurtj@Gmail.Com\nFacebook Username: Chris Humphrey\nInstagram Username:\nBb Pin:\nFavourite Food: Anything I Find Eating As At When Eating It, Is My Best Food\nFavourite Colour: Red And White\nFavourite Quote: Do To Others What You Want Them To Do To You\nFavourite Bible Verse: Luke 18:27\nTurn On : Trust,  Discipline\nTurn Off: Dishonesty,Arrogance/Disobedient To Authorities\nMarital Status: Single\nPost Held: Ass.Follow-Up Secretary\n"));


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
