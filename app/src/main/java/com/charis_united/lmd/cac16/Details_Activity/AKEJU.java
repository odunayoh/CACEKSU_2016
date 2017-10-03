package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class AKEJU extends AppCompatActivity {

    TextView ty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akeju);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ty = (TextView) findViewById(R.id.textakeju);
        ty.setText(String.format("Name: Akeju Miracle Oluwaseun\nNick Name: Olu-A-Seun\nSex: Male\nD.O.B: 21st Oct\nHome Town Ilogbo Ekiti:\nL.G.A: Ido Osi\nState Of Origin: Ekiti State\nHome Address: Nil\nFaculty: Arts\nDepartment English &Literary Studies\nWhatsapp/Phone Number(S): 08160869773\nE-Mail: Seun4beloved@Gmail.Com\nFacebook Username: Gentleswags\nInstagram Username: Nil\nFavourite Food: Poundedyam & Fried Rice\nFavourite Colour: White And Pink\nFavourite Quote: Better Days Ahead \nFavourite Bible Verse: They That Worship, Must Worship In Spirit And Truth\nTurn On : Love And Truth \nTurn Off: Hypocrisy –Living Outside Life\nMarital Status: Single\nPost Held: Choir M.F /Fyb Chairman\n"));




        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
