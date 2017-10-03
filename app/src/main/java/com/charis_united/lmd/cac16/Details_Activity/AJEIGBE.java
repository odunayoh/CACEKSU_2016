package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class AJEIGBE extends AppCompatActivity {
    TextView tva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajeigbe);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        tva = (TextView) findViewById(R.id.textajeigbe);
        tva.setText("Name;Ajeigbe Damilola James\n" +
                "Nickname; Dhammie\n" +
                "Sex; Male\n" +
                "D.O.B; 11th April\n" +
                "Home Town; Oloje Ekiti\n" +
                "L.G.A; Oye\n" +
                "State Of Origin; Ekiti\n" +
                "Home Address; 20, Latona Street, Osogbo, Osun State\n" +
                "Faculty; Management Sciences\n" +
                "Department; Accounting\n" +
                "Whatsapp/Phone Number(S); 08065894907\n" +
                "E-Mail; Jamesajeigbe@Yahoo/Gmail.Com\n" +
                "Facebook Username; Ajeigbe Oluwadamiloloa James\n" +
                "Instagram Username; Damilolaajeigbe\n" +
                "Bb Pin;\n" +
                "Favourite Food; Pounded Yam And Egusi\n" +
                "Favourite Colour; White\n" +
                "Favourite Quote; \n" +
                "Favourite Bible Verse; Psalm 48: 14\n" +
                "Turn On; Music\n" +
                "Turn Off: Noise And Lies\n" +
                "Post Held: Fyb Financial Secretary\n");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
