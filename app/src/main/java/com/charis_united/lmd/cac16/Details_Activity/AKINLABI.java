package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class AKINLABI extends AppCompatActivity {
    TextView ty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akinlabi);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);




        ty = (TextView) findViewById(R.id.textakinlabi);
        ty.setText(String.format("Name;Akinlabi Tobi Abraham\nNickname;Biggy\nSex;Male\nD.O.B;19th November\nHome Town;Ibadan\nL.G.A;Lagelu Local Government\nState Of Origin; Oyo\nHome Address;64 Wonderful Quarters Success Estate Olorunda Akobo Ibadan\nFaculty; Education\nDepartment; Educational Managent (Accounting)\nWhatsapp/Phone Number(S); 080141788544 Or 08059782724\nE-Mail;Biggto1@Yahoo.Com\nFacebook Username;Akinlabi Tobi\n Instagram Username;\nBb Pin;\nFavourite Food; Amala And Ewedu \nFavourite Colour; Green And White\nFavourite Quote; Whatever You Fimd Your Hand Doing Do It Well \nFavourite Bible Verse;\nTurn On;Hardwork And Creativity\nTurn Off;Hypocrisy And Dishonesty\nMarital Status;Single\nPost Held; Organizing Coordinator\n\n"));
    }

}
