package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class ADEGBOYEGA extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adegboyeg);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        textView = (TextView) findViewById(R.id.textadegboyega);
        textView.setText(
                "Name;Adegboyega Adebukola Christianah\n" +
                "Nickname: Bukite\n" +
                "Gender;Female\n" +
                "D.O.B;17th February\n" +
                "Home Town;Iwo\n" +
                "L.G.A;Iwo Local Govt\n" +
                "State Of Origin;Osun\n" +
                "Home Address: Zone 2,  No 68, Agbamu Road, Sanyo, Ibadan\n" +
                "Faculty: Arts\n" +
                "Department: English And Literary Studies\n" +
                "Whatsapp Contact: 08106661444\n" +
                "Email: Adebuka17@Gmail.Com\n" +
                "Facebook Username: Shayofunmi Adebukola\n" +
                "Instagram Username: Shayofunmi1702\n" +
                "Bb Pin:7b2c47c1\n" +
                "Favourite Food: Amala And Ewedu\n" +
                "Favourite Colour: Pink\n" +
                "Favourite Quote: One Day Enjoyment, Is An Everlasting Sorrow\n" +
                "Favourite Bible Verse: James 1 Vs 2 \n" +
                "Turn On: Marital And Carrer Talks \n" +
                "Turn Off: Unfaithfulness \n" +
                "Marital Status: Engaged\n" +
                "Post Held: Nil\n" +
                "\n");


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
