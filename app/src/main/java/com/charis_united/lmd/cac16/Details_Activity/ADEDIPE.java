package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class ADEDIPE extends AppCompatActivity {
    TextView textView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adedipe);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        textView = (TextView) findViewById(R.id.textadedipe);
        textView.setText(
                "Name;Adedipe Felicia Oluwatosin\n" +
                "Nickname;Phellytee\n" +
                "Sex;Female\n" +
                "D.O.B; May 10 \n" +
                "Home Town; Akure \n" +
                "L.G.A; Akure South \n" +
                "State Of Origin; Ondo State\n" +
                "Home Address; 14 Igbehinadun Street Akure\n" +
                "Faculty; Management Science\n" +
                "Department; Banking And Finance\n" +
                "Whatsapp/Phone Number(S); 08060231578\n" +
                "E-Mail; Phellytee1486@Gmail.Com\n" +
                "Facebook Username; Oluwatosin Adedipe\n" +
                "Instagram Username;\n" +
                "Bb Pin;\n" +
                "Favourite Food; Rice And Beans\n" +
                "Favourite Colour; Blue\n" +
                "Favourite Quote; Experience Is Not The Best Teacher But A Good Teacher\n" +
                "Favourite Bible Verse; Phil 4: 13\n" +
                "Turn On; Honesty\n" +
                "Turn Off; Lying\n" +
                "Marital Status; Single\n" +
                "Post Held; Member\n");


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
