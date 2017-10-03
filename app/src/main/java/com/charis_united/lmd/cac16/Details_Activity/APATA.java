package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class APATA extends AppCompatActivity {
    TextView tuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apat);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tuy = (TextView) findViewById(R.id.textapat);
        tuy.setText(String.format("Name: Apata Damilola Gabriel\nNick Name: Deewhy, D’riel, Dahmiel\nSex:Male\nD.O.B: 2nd March\nHome Town: Ilawe Ekiti\nL.G.A: Ekiti South/West\nState Of Origin: Ekiti State\nHome Address: N0 28 Unity Awe, Anuoluwa Estate Badagry, Lagos\nFaculty: Social Sciences\nDepartment: Sociology\nWhatsapp/Phone Number(S):  08164871826\nE-Mail: Dammyapata@Gmail,Com\nFacebook Username: Apata Deewhy Gabriel\nInstagram Username: Dammy Gabriel\nBb Pin: 7e385bba\nFavourite Food: Beans And Sauce (Agoyin Beans)\nFavourite Colour: Red\nFavourite Quote: Don’t Magnify Your Problem, Magnify God\nFavourite Bible Verse: 1 Corinthians 2:9\nTurn On :Music\nTurn Off:Lying\nMarital Status: Very Single\n"));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
