package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class ALADEYELU extends AppCompatActivity {
    TextView tgv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aladeyelu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tgv = (TextView) findViewById(R.id.textaladeyelu);
        tgv.setText(String.format("Name: Aladeyelu Oluwatobi Precious\nNick Name: Preshy\nSex: Female\nD.O.B: 25th Nov\nHome Town: Eyio Ekiti\nL.G.A: Irepodun/Ifelodun\nState Of Origin: Ekiti State\nHome Address: No 39, Olagunju Strt, Magbon,Badagry,Lagos State\nFaculty: Sciences\nDepartment: Plant Science\nWhatsapp/Phone Number(S): 08165914778\nE-Mail:Oluwatobiprecious25@Gmail.Com\nFacebook Username: Aladeyelu Oluwatobi\nInstagram Username: Nil\nBb Pin: Nil\nFavourite  Food: Rice\nFavourite Colour: Pink\nFavourite Quote: What Will Be Will Be\nFavourite Bible Verse:  Psalm 16v8\nTurn On : Open Minded\nTurn Off: Pretence\nMarital Status: Single\nPost Held: Nil\n"));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
