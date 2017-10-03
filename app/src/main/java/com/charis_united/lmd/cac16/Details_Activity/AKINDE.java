package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class AKINDE extends AppCompatActivity {

    TextView tvb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akinde);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tvb = (TextView) findViewById(R.id.textakinde);
        tvb.setText(String.format("Name; Akinde Babatunde Samuel\nNickname; Samtee\nSex; Male\nD.O.B; 29th,October\nHome Town; Idanre\nL.G.A;Idanre\nState Of Origin;Ondo State\nHome Address; 29,Oke Aro Street,Off Idanre Road,Akure\nFaculty; Science(Slt)\nDepartment; Slt(Biochemistry Option)\nWhatsapp/Phone Number(S); 08160628797\nE-Mail; Akinssam.Tunde@Gmail.Com\nFacebook Username; Samuel Tunde\nInstagram Username;\nBb Pin;\nFavourite Food;Semovita With Vegetable Soup\nFavourite Colour;Orange\nFavourite Quote;If You Don’t Believe In Yourself,Nobody Will\nFavourite Bible Verse;Romans 8 Vs 9\nTurn On;\nTurn Off;\nMarital Status;Single\nPost Held;\n"));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
