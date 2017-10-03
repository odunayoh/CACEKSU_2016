package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class AJAKAYE extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajakaye);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tv= (TextView) findViewById(R.id.textajakaye);
        tv.setText("Name: Ajakaye Oluwatimilehin .S \n" +
                "Nick Name: Da Golden Boy\n" +
                "Sex: Male\n" +
                "D.O.B: 29th August\n" +
                "Home Town: Osu\n" +
                "L.G.A: Atakunmosa West\n" +
                "State Of Origin: Osun State\n" +
                "Home Address: No 2, Atakunmosa Area,Osu,Osun State \n" +
                "Faculty: Engineering\n" +
                "Department: Mechanical Endineering\n" +
                "Whatsapp/Phone Number(S):08139374665/08149778487\n" +
                "E-Mail:Ajakayeoluwatimilehin@Yahoo.Com\n" +
                "Facebook Username:Ajakaye Oluwatimilehin\n" +
                "Instagram Username:Dagoldenboy\n" +
                "Bb Pin:\n" +
                "Favourite Food:Pounded Yam And Egusi Soup\n" +
                "Favourite Colour:Pink\n" +
                "Favourite Quote:Don’t Let Your Haters See Your End And At The End They Will Understand That You Cant Stop What You Cant See\n" +
                "Favourite Bible Verse:John 3;16\n" +
                "Turn On :Listening To Music&Watching Football\n" +
                "Turn Off:Backstabbing&Lies\n");


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
