package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class BABALOLA extends AppCompatActivity {
    TextView tuy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babalol);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tuy = (TextView) findViewById(R.id.textbabalola);
        tuy.setText(String.format("Name;Babalola Maryann\nNickname;Mary & Ann\nSex;Female\nD.O.B;12th November\nHome Town;Ajaokuta\nL.G.A;Ajaokuta Local Government\nState Of Origin;Ekiti\nHome Address;84,B+B Workers Camp\nFaculty;Arts\nDepartment;French\nWhatsapp/Phone Number(S);07035511490\nE-Mail;Maryannabcd@Gmail.Com\nFacebook Username;Babalola Maryann\nInstagram Username;Maryann\nBb Pin;\nFavourite Food;\nFavourite Colour;\nFavourite Quote;\nFavourite Bible Verse;Ephesians 5 Vs 18\nTurn On;Humility,Respect,Responsibility\nTurn Off;Lousiness,Show Off,\nMarital Status;Single\nPost Held;Assistant Fyb Welfare\n"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
