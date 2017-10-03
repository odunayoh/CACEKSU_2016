package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class AWE extends AppCompatActivity {
    TextView tuy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_awe);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tuy = (TextView) findViewById(R.id.textawe);
        tuy.setText(String.format("Name;Awe Ebenezer Gbenga\nNickname;Prof Ebenz\nSex;Male\nD.O.B;24th September\nHome Town;Osi Ekiti\nL.G.A;Ekiti L.G.A\nState Of Origin;Kwara State\nHome Address;\nFaculty;Art\nDepartment;Philosophy\nWhatsapp/Phone Number(S);07038071906\nE-Mail;Ebenezerawe@Gmail.Com\nFacebook Username;Awe Ebenezer\nInstagram Username;\nBb Pin;\nFavourite Food;Bread And Beans\nFavourite Colour;White And Yellow\nFavourite Quote;Jeremiah 29 Vs 11 {Nlt}\nFavourite Bible Verse; Jeremiah 29 Vs 11 {Amp}\nTurn On;Sincerity\nTurn Off;Insincerity\nMarital Status;Single\nPost Held;Financial Secretary(2015/2016 Tenure)\n\n"));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
