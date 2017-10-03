package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class DADA extends AppCompatActivity {
    TextView tuy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dad);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tuy = (TextView) findViewById(R.id.textdada);
        tuy.setText(String.format("Name;Dada Oluwagbenga Peter\nNickname;Petrex\nSex;Male\nD.O.B;29th July\nHome Town;Iloro Ekiti\nL.G.A;Ijero Local Government\nState Of Origin;Ekiti State\nHome Address;D26 Ijemu Street,Iloro Ekiti\nFaculty;Engineering\nDepartment;Electrical/Electronics Engineering\nWhatsapp/Phone Number(S);07032353720\nE-Mail;Petrex011@Yahoo.Com\nFacebook Username;Dada Peter\nInstagram Username;\nBb Pin;2bd032aa\nFavourite Food;Pounded Yam\nFavourite Colour;Blue\nFavourite Quote;Whatever Life Throws At Me Even When It Hurts,I ‘Ll Just Be Strong And Fight Through It,Because Strong Walls Shake But Never Collapse\nFavourite Bible Verse;Psalm 8 Vs 2\nTurn On;Hypocrite\nTurn Off;\nMarital Status;Single\nPost Held;\n"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
