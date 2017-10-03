package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class ADULOJU extends AppCompatActivity {
    TextView tvv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aduloju);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tvv= (TextView) findViewById(R.id.textaduloju);
        tvv.setText("Name;Aduloju Sunday Joseph\n" +
                "Nickname;Resource\n" +
                "Sex;Male\n" +
                "D.O.B;20th March\n" +
                "Home Town;Ire- Ekiti\n" +
                "L.G.A;Oye Local Government\n" +
                "State Of Origin;Ekiti State\n" +
                "Home Address; 38 Soetan Crescent Modupetemi Estate Off Ibusi Road Iyanal Ilogbo Ogun State\n" +
                "Faculty;Engineering\n" +
                "Department;Mechanical Engineering\n" +
                "Whatsapp/Phone Number(S);07062068525\n" +
                "E-Mail;Adulojusunday3@Gmail.Com\n" +
                "Facebook Username;Sunday Aduloju\n" +
                "Instagram Username;\n" +
                "Bb Pin;58fba5fb\n" +
                "Favourite Food;Rice And Beans\n" +
                "Favourite Colour;Purple\n" +
                "Favourite Quote;Anything Worth Lieing For,Is Not Worth Having(Aduloju)\n" +
                "Favourite Bible Verse;Romans 12 Vs 11\n" +
                "Turn On;Honesty.\n" +
                "Turn Off;Dishonesty\n" +
                "Marital Status;Single\n" +
                "Post Held;General Secretary(2015/2016 Session)\n");


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
