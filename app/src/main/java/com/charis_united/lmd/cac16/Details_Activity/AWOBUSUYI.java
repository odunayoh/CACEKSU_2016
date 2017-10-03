package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class AWOBUSUYI extends AppCompatActivity {
    TextView tuy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_awobusuyi);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tuy = (TextView) findViewById(R.id.textawobusuyi);
        tuy.setText(String.format("Name: Awobusuyi Tobi Odunayo\nNickname: Tbuzy \nSex; Male \nD.O.B; 18th December \nHome Town; Ekiti \nL.G.A; Oye \nState Of Origin; Ekiti \nHome Address; 12 Abolaji Street Off Devo Road Otta Ogun State \nFaculty;  Social Sciences \nDepartment;  Sociology \nWhatsapp/Phone 07030125009 \nNumbers; 07030125009 \nEmail Awobusuyitobi@Gmail.Com \nFacebook Username; Awobusuyi Tobi Levi's Baba \nInstagram Username: Awobusuyitobi \nBb Pin \nFavourite Food; Bread \uD83C\uDF5E And Beans \nFavourite Colour; Blue \nFavourite Quote;  Beauty Will Fade, Knowledge Will Pass Away, But The Last Quality In Man Is Manner. \nFavourite Bible Verse; Philippians  4:4 Rejoice In The Lord Alway: And Again I Say, Rejoice.\nTurn On (Likes); Music Especially Live Band \nTurn Off (Dislikes):  Unfaithfulness And Belittling Others \nMarital Status; Single \nPost Held; Post In  Church Nile In Sch Gen Sec Of Nsasa\n"));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
