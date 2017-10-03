package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class ELUFOWOJU extends AppCompatActivity {
    TextView tuy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elufowoju);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tuy = (TextView) findViewById(R.id.textelufowoju);
        tuy.setText(String.format("Name: Elufowoju Felicia Oluwabunmi\nNick Name: Feliqueen\nSex: Female\nD.O.B:  20th Jan, 1989\nHome Town: Ile-Ife\nL.G.A:  Ife East\nState Of Origin:  Osun State\nHome Address: No 21, Ogo Oluwa Quarters, Ondo Rd,Ile Ife\nFaculty: Science\nDepartment: Science Laboratory Tech (Chemistry)\nWhatsapp/Phone Number(S): 07034491381\nE-Mail: Elubunmi105@Gmail.Com\nFacebook Username: Elubunmi Joy Feliqueen\nInstagram Username:  Elubunmi Joy Feliqueen\nBb Pin:5bfa9380\nFavourite Food: Rice And Beans With Stew\nFavourite Colour: Blue And Pink\nFavourite Quote: No Matter The Situation, Be Happy\nFavourite Bible Verse: \nTurn On : I Like To Be Singing And Dancing\nTurn Off: I Hate Laziness\nMarital Status: Engage\nPost Held: Assistant Ifaki Coordinator\n"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
