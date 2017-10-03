package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class AJAO_IDOWU extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajao__idowu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        textView = (TextView) findViewById(R.id.textajaoidowu);
        textView.setText("•\tName: Ajao Idowu Philip\n" +
                "•\tNickname: Schist\n" +
                "•\tSex; Male\n" +
                "•\tD.O.B; 6th January\n" +
                "•\tHome Town; Ibadan\n" +
                "•\tL.G.A; Egbeda\n" +
                "•\tState Of Origin; Oyo State\n" +
                "•\tHome Address; Iwo-Road, Ibadan.\n" +
                "•\tFaculty; Science\n" +
                "•\tDepartment; Geology\n" +
                "•\tWhatsapp/Phone Numbers; 08109167620\n" +
                "•\tE-Mail: Ajaoidowuphilip@Gmail.Com\n" +
                "•\tFacebook Username; Ajao Idowu Philip\n" +
                "•\tInstagram Username:\n" +
                "•\tBb Pin;\n" +
                "•\tFavourite Food; Dodo+ Ewa Oloyin\n" +
                "•\tFavourite Colour; Cool Colours\n" +
                "•\tFavourite Quote; One Step At A Time\n" +
                "•\tFavourite Bible Verse; Isaiah 40: 31\n" +
                "•\tTurn On (Likes); Godliness\n" +
                "•\tTurn Off (Dislikes): Ungodliness\n" +
                "•\tMarital Status; Single\n" +
                "•\tPost Held; Assistant Public Relation Officer\n" +
                "\n");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
