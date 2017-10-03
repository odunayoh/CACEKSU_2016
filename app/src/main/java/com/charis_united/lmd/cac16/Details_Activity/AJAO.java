package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class AJAO extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajao);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
textView = (TextView) findViewById(R.id.textajao);
        textView.setText("Name;Babalola Maryann\n" +
                "Nickname;Mary & Ann\n" +
                "Sex;Female\n" +
                "D.O.B;12th November\n" +
                "Home Town;Ajaokuta\n" +
                "L.G.A;Ajaokuta Local Government\n" +
                "State Of Origin;Ekiti\n" +
                "Home Address;84,B+B Workers Camp\n" +
                "Faculty;Arts\n" +
                "Department;French\n" +
                "Whatsapp/Phone Number(S);07035511490\n" +
                "E-Mail;Maryannabcd@Gmail.Com\n" +
                "Facebook Username;Babalola Maryann\n" +
                "Instagram Username;Maryann\n" +
                "Bb Pin;\n" +
                "Favourite Food;\n" +
                "Favourite Colour;\n" +
                "Favourite Quote;\n" +
                "Favourite Bible Verse;Ephesians 5 Vs 18\n" +
                "Turn On;Humility,Respect,Responsibility\n" +
                "Turn Off;Lousiness,Show Off,\n" +
                "Marital Status;Single\n" +
                "Post Held;Assistant Fyb Welfare\n");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
