package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class AGBOOLA extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agbool);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        textView = (TextView) findViewById(R.id.textagbool);
        textView.setText("Name; Agboola Emmanuel Olawale\n" +
                "Nickname;Agboola\n" +
                "Sex;Male\n" +
                "D.O.B;17th June\n" +
                "Home Town;Ikoro Ekiti\n" +
                "L.G.A;Ijero\n" +
                "State Of Origin;Ekiti State\n" +
                "Home Address;Agboola Avenue,Sabo, Abeokuta.\n" +
                "Faculty;Agricultural Sciences\n" +
                "Department;Fisheries And Aquaculture Management\n" +
                "Whatsapp/Phone Number(S);08139177862, 08161742771\n" +
                "E-Mail;Agboolaemmanuelolawale277@Gmail.Com\n" +
                "Facebook Username;Agboola Emmanuel\n" +
                "Instagram Username;\n" +
                "Bb Pin;2b3c8a2f\n" +
                "Favourite Food;Pounded Yam And Egusi\n" +
                "Favourite Colour;White\n" +
                "Favourite Quote;A Poor Man Is Better Than A Liar\n" +
                "Favourite Bible Verse;Jeremiah 1 Vs 19\n" +
                "Turn On;Honesty\n" +
                "Turn Off;Dishonesty\n" +
                "Marital Status;Single\n" +
                "Post Held;Nil\n");


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
