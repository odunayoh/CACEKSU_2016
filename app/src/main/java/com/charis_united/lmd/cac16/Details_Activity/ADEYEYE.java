package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class ADEYEYE extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adeyeye);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        textView = (TextView) findViewById(R.id.textadeyeye);
        textView.setText("Name;Adeyeye Adetunji A\n" +
                "Nickname;Irawo\n" +
                "Sex;Male\n" +
                "D.O.B;30th March\n" +
                "Home Town;Idanre\n" +
                "L.G.A;Idanre Local Government\n" +
                "State Of Origin;Ondo State\n" +
                "Home Address;23,Moferere Street,Idanre\n" +
                "Faculty;Engineering\n" +
                "Department;Mechanical Engineering\n" +
                "Whatsapp/Phone Number(S);07065268076\n" +
                "E-Mail;Agbolajobiadetunjia1@Gmail.Com\n" +
                "Facebook Username;Adetunji A Adeyeye\n" +
                "Instagram Username;Nil\n" +
                "Bb Pin;Nil\n" +
                "Favourite Food;Pounded Yam And Egusi Soup\n");


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
