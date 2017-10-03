package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class FALODUN extends AppCompatActivity {
    TextView tuy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_falodun);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tuy = (TextView) findViewById(R.id.textfaLodun);
        tuy.setText(String.format("Name:Falodun Abel Odunayo\nNick Name:Amicable\nSex:Male\nD.O.B:23rd March\nHome Town:Emure;Ekiti\nL.G.A: Emure\nState Of Origin:Ekiti\nHome Address:No18, Ariyasi Street Emure Ekiti, Ekiti State\nFaculty:Science\nDepartment:Chemistry\nWhatsapp/Phone Number(S):07067929334\nE-Mail:Convernanabel@Yahoo.Com\nFacebook Username:Falodun Abel\nInstagram Username:\nBb Pin:\nFavourite Food:Beans And Bread\nFavourite Colour:Lailac\nFavourite Quote:Never Be Worried When You Face Challenge Its Just A Bus Stop In Ibadan\nFavourite Bible Verse:Heb 1;3\nTurn On :Beliveing In Myself\nTurn Off:Disturbance\nMarital Status:Single\nPost Held:Member\n"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
