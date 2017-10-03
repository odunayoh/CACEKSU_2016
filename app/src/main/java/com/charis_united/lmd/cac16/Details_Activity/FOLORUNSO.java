package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class FOLORUNSO extends AppCompatActivity {
    TextView tuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_folorunso);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tuy = (TextView) findViewById(R.id.textfolorunsho);
        tuy.setText(String.format("Name; Folorunso Tolulope Isaac\nNickname;Executive\nSex;Male\nD.O.B;November 9\nHome Town;Afin Akoko\nL.G.A;Akoko North West\nState Of Origin;Ondo State\nHome Address;46,Olorunsogo Temidire Street,Odo Ado,Ado Ekiti\nFaculty;Engineering\nDepartment;Electrical Electronics Engineering\nWhatsapp/Phone Number(S);08136975978\nE-Mail;Isaactolu38@Gmail.Com\nFacebook Username;Folorunso Tolu\nInstagram Username;\nBb Pin;\nFavourite Food;Pounde Yam And Vegetable Soup\nFavourite Colour;Blue And White\nFavourite Quote;Let There Be Light\nFavourite Bible Verse;Genesis 1 Vs 3\nTurn On;Honesty And Love\nTurn Off;Disobedience\nMarital Status;Engaged\nPost Held;Treasurer{Nuesa},Library Coordinator{Prayer Unit}\n \n"));





        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
