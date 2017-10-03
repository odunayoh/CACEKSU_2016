package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class ADEOBA_OPEYEMI extends AppCompatActivity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adeoba__opeyemi);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        text  = (TextView) findViewById(R.id.textadeoba);
        text.setText(
                "Name; Adeoba Opeyemi Daniel\n" +
                "Nickname; Opydan\n" +
                "Sex;Male\n" +
                "D.O.B;25th March\n" +
                "Home Town;Iloro Ekiti\n" +
                "L.G.A;Ijero Local Government\n" +
                "State Of Origin;Ekiti State\n" +
                "Home Address;Block G1,Behind Immigration Ado Ekiti\n" +
                "Faculty;Science\n" +
                "Department;Plant Science\n" +
                "Whatsapp/Phone Number(S);08102381763\n" +
                "E-Mail;Opydan44@Yahoo.Com\n" +
                "Facebook Username;Opy Daniel\n" +
                "Instagram Username;\n" +
                "Bb Pin;\n" +
                "Favourite Food;Any Nice Food\n" +
                "Favourite Colour;White And Gold\n" +
                "Favourite Quote;There Is A Spirit In Man And The Inspiration Of The Almighty Giveth Understanding\n" +
                "Favourite Bible Verse;2 Corinthians 5;17\n" +
                "Turn On;Teaching And Football\n" +
                "Turn Off;\n" +
                "Marital Status;Single And Settled\n" +
                "Post Held;Zion Zone Representative\n");


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
