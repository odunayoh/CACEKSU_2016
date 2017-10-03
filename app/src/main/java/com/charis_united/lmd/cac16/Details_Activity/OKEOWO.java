package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class OKEOWO extends AppCompatActivity {
    TextView tuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_okeowo);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tuy = (TextView) findViewById(R.id.textokeowo);
        tuy.setText(String.format("Name:Okeowo Florence Ronke\nNickname: cute rownky, \nSex: female,DOB:July 25th,\nHometown: isanlu-isin, LGA: isin, \nState of origin:kwara state,\nHome address: owode-ile eja academy Ibadan Oyo state,\nFaculty: education,\nDepartment:educational management,\nWhatsApp/phone number:08067156457,\nE-mail:okeowo Florence Ronke,\nFacebook username: okeowo Florence Ronke,\nInstagram username: nill, \nBBpin,\nFavorite food: noodle and egg,\nFavorite colour: red,\nFavourite quote: cut your coat according to your size,\nFavorite bible verse: Ezekiel 18:20,\nTurnon:honesty, turn off: dishonesty,\nMarital status: single,\nPost held: unity zone representative\n"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
