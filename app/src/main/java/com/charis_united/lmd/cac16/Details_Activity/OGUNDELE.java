package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class OGUNDELE extends AppCompatActivity {
    TextView tuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ogundele);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tuy = (TextView) findViewById(R.id.textogundele);
        tuy.setText(String.format("Name:Ogundele ifedayo olawumi, \nNickname: loveth,\nSex: female,\nDOB 9th march,\nHometown: ipetu-ijesa,\nLGA: oriade,\nState of origin: osun state,\nHomeaddress: 37,aloba layout Ondo road Akure.Ondo state\nFaculty: education, \nDepartment: educational management, \nWhatsApp/phone noba,:08161750519\nE-mail: ayomide_ife@yahoo.com,\nFacebook username:Ogundele ifedayo,\nBBpin:58D33947,\nFavorite food:poundedyam and efo-riro,\nFavorite color:pupple\nFavorite quote:maintain in order to sustain, \nFavourite bible verse:let the brotherly love continues, \nTurn on: honesty,\nTurn off: dishonesty, \nMarital status: single,\nPostheld:nill\n"));


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
