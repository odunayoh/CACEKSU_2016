package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class ABIODUN_KEHINDE_DAVID extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abiodun__kehinde__david);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        textView = (TextView) findViewById(R.id.textr);
        textView.setText("" +
                "\n" +
                "Name;Abiodun Kehinde David \n" +
                "Nickname; Ketubah\n" +
                "Sex; Male\n" +
                "D.O.B; February 16\n" +
                "Home Town; Akure\n" +
                "L.G.A; Akure South\n" +
                "State Of Origin; Ondo State\n" +
                "Home Address; 19, Ijemikin Street, Akure\n" +
                "Faculty; Science\n" +
                "Department; Industrial Chemistry\n" +
                "Whatsapp/Phone Number(S); 08139099734\n" +
                "E-Mail; Abiodunkehinde94@Yahoo.Com\n" +
                "Facebook Username; Abiodun Kehinde\n" +
                "Instagram Username;\n" +
                "Bb Pin;\n" +
                "Favourite Food; Pounded Yam And Efo Elegunsi\n" +
                "Favourite Colour; White And Pink\n" +
                "Favourite Quote; If Patience Will Indeed Melt A Stone, Then Love Can Sublime The Rock\n" +
                "Favourite Bible Verse; 1 John 3:1.\n" +
                "Turn On; Word And Music Ministrations\n" +
                "Turn Off; Religion\n" +
                "Marital Status; Single\n" +
                "Post Held; Bible Study Cordinator\n");


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
