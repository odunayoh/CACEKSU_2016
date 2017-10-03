package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class ABIOYE extends AppCompatActivity {
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abioye);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        textView = (TextView) findViewById(R.id.textt);
        textView.setText("Name;Abioye Akinkunmi Samuel\n" +
                "Nickname;Akin Emperor\n" +
                "Sex;Male\n" +
                "D.O.B;22nd April\n" +
                "Home Town;Ibadan\n" +
                "L.G.A;Ona Ara Local Government\n" +
                "State Of Origin;Oyo State\n" +
                "Home Address;\n" +
                "Faculty;Agricultural Science\n" +
                "Department;Animal Production And Health Science\n" +
                "Whatsapp/Phone Number(S);08038646340\n" +
                "E-Mail;Abioyeakinkunmi@Yahoo.Com\n" +
                "Facebook Username;Abioye Akinkunmi\n" +
                "Instagram Username;\n" +
                "Bb Pin;\n" +
                "Favourite Food;Amala,Ewedu And Gbegiri With Fish\n" +
                "Favourite Colour;Any Nice And Cool Colour\n" +
                "Favourite Quote;Psalm 23\n" +
                "Favourite Bible Verse;2kings 3 Vs 17\n" +
                "Turn On;Sincere Heart\n" +
                "Turn Off;Insincerity\n" +
                "Marital Status;Single\n" +
                "Post Held;Honourable In School\n");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
