package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class AKINBUSOLA extends AppCompatActivity {
        TextView tyi;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akinbusol);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tyi = (TextView) findViewById(R.id.textakinbusol);
        tyi.setText(String.format("Name ;Akinbusola Omolara Theresa\nNickname: Larahrahghold\nSex;Female\nD.O.B;19th February\nHome Address;Ipetu Ijesha\nL.G.A;Oriade Local Gvt\nState Of Origin;Osun\nHome Address: Niomco Staff Quathers,Okene,Kogi State\nFaculty: Engineering\nDepartment: Computer Engineering\nWhatsapp/Phone Contact; 07039395627\nE-Mail: Akinbusolaomolara11@Gmail.Com\nFb Username:Akinbusola Omolara Theresa\nFavourite Food: Pounded Yam N Vegetable\nFavourite Colour: Royal Blue\nFavourite Quote: A New Day Is A New Opportunity\nFavourite Bible Verse: Philippians 4:13\nTurn On: Marital And Carrer Talks \nTurn Off: Unfaithfulness \nMarital Status: Single\nPost Held: Nil\n"));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
