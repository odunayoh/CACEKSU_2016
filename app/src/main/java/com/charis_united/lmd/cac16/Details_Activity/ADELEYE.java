package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class ADELEYE extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adeleye);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
            textView = (TextView) findViewById(R.id.textadeleye);
        textView.setText(
                "Name; Adeleye Tunde Jeremiah\n" +
                "Nickname; Tundey Jerry\n" +
                "Sex;Male\n" +
                "D.O.B;3rd December\n" +
                "Home Town; Ijero\n" +
                "L.G.A;\n" +
                "State Of Origin;Ekiti\n" +
                "Home Address; \n" +
                "Faculty; Management Sciences\n" +
                "Department; Accounting\n" +
                "Whatsapp/Phone Number(S); 08102482569\n" +
                "E-Mail;\n" +
                "Facebook Username; \n" +
                " Instagram Username;\n" +
                "Bb Pin;\n" +
                "Favourite Iyan And Egusi\n" +
                "Favourite Colour;\n" +
                "Favourite Quote; \n" +
                "Favourite Bible Verse;\n" +
                "Turn On;\n" +
                "Turn Off; \n" +
                "Marital Status;Single\n" +
                "Post Held; \n");






        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
