package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class AKINWALE extends AppCompatActivity {
TextView tuy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akinwale);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        tuy = (TextView) findViewById(R.id.textakinwale);
        tuy.setText(String.format("Name; Akinwale Ayoola Oluyinka\nNickname;Slimmest Yinkosh\nSex;Male\nD.O.B;09 May\nHome Town; Ikire\nL.G.A; Irewole\nState Of Origin; Osun\nHome Address; Ayepe, Gbaga Area,Moro, Osun State\nFaculty; Science\nDepartment; Statistics\nWhatsapp/Phone Number(S); 08102392308, 08104300886\nE-Mail; Slimmestyinkosh@Yahoo.Com\nFacebook Username; Slimmest Yinkosh\nInstagram Username; Cant Remember, Maybe Slimmest Yinkosh\nBb Pin; 58a3443a\nFavourite Food; Fried Egg And Dodo\nFavourite Colour; Red\nFavourite Quote; There Is Always A Little Seriousness Out Of Every Unseriousness, Alays Pay Attention To People \nFavourite Bible Verse; Every Verse I Got The Revelation\nTurn On; Lovely Smile\nTurn Off; Check Back For That Later\nMarital Status; Not Searching \nPost Held; C.A.C Eksu Fyb Drama Coord\n"));


    }

}
