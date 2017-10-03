package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class ELEHINAFE extends AppCompatActivity {
    TextView tuy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elehinafe);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tuy = (TextView) findViewById(R.id.textelehinafe);
        tuy.setText(String.format("Name: Elehinafe Temitayo M.\nNick Name: Larrytee\nSex: Male\nD.O.B: 30th May\nHome Town: Ilawe Ekiti\nL.G.A: Ekiti South West\nState Of Origin: Ekiti\nHome Address: \nFaculty: Agricultural Science\nDepartment: Fisheries Management\nWhatsapp/Phone Number(S): 08063837708\nE-Mail: Larrytee30@Gmail.Com\nFacebook Username: Elehinafe.Temitayo\nInstagram Username:\nBb Pin:58abde8c\nFavourite Food: Rice And Beans\nFavourite Colour:Blue\nFavourite Quote: He Who Is Afraid To Ask Is Ashamed Of Learning\nFavourite Bible Verse:Rev 4:11\n\n"));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
