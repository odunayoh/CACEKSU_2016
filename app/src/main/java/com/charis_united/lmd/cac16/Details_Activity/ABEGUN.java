package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class ABEGUN extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abegun);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        textView = (TextView) findViewById(R.id.textabe);
        textView.setText(
                "Name: Abegunde Samuel Ayodeji Oluwafemi\n" +
                "Nick Name: Asadoy\n" +
                "Sex:  Male\n" +
                "D.O.B:  6th Oct \n" +
                "Home Town: Osan Ekiti\n" +
                "L.G.A: Moba \n" +
                "State Of Origin: Ekiti\n" +
                "Home Address: Temitope Strt Ore Odo Akure\n" +
                "Faculty: Social Science\n" +
                "Department: Sociology\n" +
                "Whatsapp/Phone Number(S): 07034740753\n" +
                "E-Mail: Samuelabegunde65@Yahoo.Com\n" +
                "Facebook Username: Abegunde Samuel Asadoy\n" +
                "Instagram Username: Nil\n" +
                "Bb Pin: Nil\n" +
                "Favourite  Food: African Delicacies\n" +
                "Favourite Colour: Green \n" +
                "Favourite Quote: If You Cant Be The Sun Be The Brightest Moon \n" +
                "Favourite Bible Verse:  Prob 4v18\n" +
                "Turn On : Righteousness\n" +
                "Turn Off: Unrighteousness\n" +
                "Marital Status: Single\n" +
                "Post Held: Beautification Unit Cord\n");


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
