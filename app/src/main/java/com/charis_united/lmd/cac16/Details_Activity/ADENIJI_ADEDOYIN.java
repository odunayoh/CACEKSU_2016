package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class ADENIJI_ADEDOYIN extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adeniji__adedoyin);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        textView = (TextView) findViewById(R.id.textadedoyin);
        textView.setText(
                "Name: Adeniji Adedoyin Ayodeji \n" +
                "Nickname: Doyex\n" +
                "Sex: Male\n" +
                "Dob: 06-04\n" +
                "Home Town: Lagos \n" +
                "Lga: Ijero\n" +
                "State Of Origin: Ekiti \n" +
                "Home Address: No. 45 Bako Sunmola Rd., Owode-Onirin, Lagos\n" +
                "Faculty: Engineering\n" +
                "Department: Electrical/ Electronics\n" +
                "Numbeer/Whatsapp: 07038866047\n" +
                "Email: Doyex015@Gmail.Com\n" +
                "Facebook: Adedoyin Adeniji\n" +
                "Favourite Food: Pounded Yam With Vegetable Soup\n" +
                "Favourite Colour: Blue\n" +
                "Favourite Bible Verse: The Greatest Tragedy In Life Is Not Death But Life Without Purpose\n" +
                "Turn On: Watching Football And Listening To Music\n" +
                "Turn Off: Pretenders\n" +
                "Marital Status: Single\n");


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
