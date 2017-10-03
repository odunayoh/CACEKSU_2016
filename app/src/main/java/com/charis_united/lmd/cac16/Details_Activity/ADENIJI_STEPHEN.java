package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class ADENIJI_STEPHEN extends AppCompatActivity {
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adeniji__stephen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        textView = (TextView) findViewById(R.id.textstephen);
        textView.setText(
                "Name:  Adeniji Stephen Adebisi\n" +
                "Nickname: Bisteve, Steve\n" +
                "Sex:  Male\n" +
                "Dob: 8th June\n" +
                "Home Town: Elegun- =Mefa \n" +
                "Lga:  Odeda\n" +
                "State Of Origin: Ogun \n" +
                "Home Address: 13, Upper Room Avenue Gasline, Songo-Ota, Ogun State\n" +
                "Faculty:  Engineering\n" +
                "Department: Mechanical Engineering\n" +
                "Numbeer/Whatsapp: 07062704181, 08100895142\n" +
                "Email: Bisteve8674@Gmail.Com\n" +
                "Facebook: Adeniji Stephen\n" +
                "Favourite Food:  Pounded Yam+Vegetable (Seasoned)\n" +
                "Favourite Colour: Pink\n" +
                "Favourite Qoute: Follow Excellence And Success Will Chase After You\n" +
                "Favourite Bible Verse:  1cor. 1: 5; Eph. 3::20\n" +
                "Turn On: Honesty, Generosity\n" +
                "Turn Off: Dishonesty, Pride, Envy, Cheating, Gloominks\n" +
                "Marital Status: Single\n" +
                "Post Held: Fyb Iworoko Zone Rep.\n");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
