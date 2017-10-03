package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class ADEOTI extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adeoti);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        textView= (TextView) findViewById(R.id.textadeoti);
        textView.setText("NAME: Adeoti Josiah Akinyemi\n" +
                "NICKNAME: Jozeeprosper\n" +
                "SEX; Male\n" +
                "D.O.B;  29th Dec.\n" +
                "HOME TOWN; Ipoti Ekiti\n" +
                "L.G.A; Ijero L.g\n" +
                "STATE OF ORIGIN; Ekiti\n" +
                "HOME ADDRESS; 8,olaosebikan street,Mile 12 lagos state\n" +
                "FACULTY; The Social sciences\n" +
                "DEPARTMENT; Economics\n" +
                "WHATSAPP/PHONE NUMBERS; 07063358049\n" +
                "E-MAIL: jozeeprosper@gmail.com\n" +
                "FACEBOOK USERNAME; Jozeeprosper\n" +
                "INSTAGRAM USERNAME:\n" +
                "BB PIN;\n" +
                "FAVOURITE FOOD; Iyan and Eghusi soup\n" +
                "FAVOURITE COLOUR; Green\n" +
                "FAVOURITE QUOTE; it takes hard work to get to the top but integrity to remain there\n" +
                "FAVOURITE BIBLE VERSE; Psalm 16 : 6\n" +
                "TURN ON (LIKES); Integrity\n" +
                "TURN OFF (DISLIKES): Corruption\n" +
                "MARITAL STATUS; Single\n" +
                "POST HELD; Publicity Secretary (P.R.O)\n");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
