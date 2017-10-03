package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class FASANYA extends AppCompatActivity {
    TextView tuy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fasany);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tuy = (TextView) findViewById(R.id.textfasany);
        tuy.setText(String.format("Name;Fasanya Marquis Adedire\nNickname;Marquis-D1\nSex;Male\nD.O.B;15th October\nHome Town;Ijebu Ode\nL.G.A;Ijebu Ode Local Government\nState Of Origin;Ogun State\nHome Address;Oko-Afo(Badagry), Along Lagos Badagry Exp. Way Lagos.\nFaculty;Engineering\nDepartment;Computer Engineering\nWhatsapp/Phone Number(S);07061177238\nE-Mail;Marquisfasanya@Gmail.Com\nFacebook Username;Marquis Adedire\nInstagram Username;Marquis Adedire\nBb Pin;\nFavourite Food;Fried Rice And Chicken With Spicy\nFavourite Colour;Lemon Green\nFavourite Quote;Love God With All Thy Might\nFavourite Bible Verse;Matthew 11 Vs 12\nTurn On;Faithfulness And Honesty\nTurn Off;Lies And Disappointment\nMarital Status;Single\nPost Held;Fyb Prayer Cord\n"));


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
