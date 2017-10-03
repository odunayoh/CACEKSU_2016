package com.charis_united.lmd.cac16;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class Chairman_Speech extends AppCompatActivity {
    TextView tyu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chairman__speech);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tyu = (TextView) findViewById(R.id.textspeech);
        tyu.setText(String.format("I give God the glory for every bit of success he has given us. It was him who promised us a safe landing; and glory to his name, he made us fly on eagle's wings, showing us the true definition of 'rest' and 'peace'. \n\nThe journey began 6th of December 2015 and like a speed of light; as if fast-forwarded, here we are thanking him for his mercy, officially ended 14th August 2016; 9months \n\nThe family name \"Weapons of Love, builders of Nations\" is an attempt to paint a picture of God's agenda for his people. He has helped the tenure accomplish this purpose to a large extent\n\nThe goal is to build a generation of people who will be instrumental in God's agenda of nations building and of course, through his person, LOVE\n\nDoing this, we were privileged to have some men and woman of God impart us into this goal with the blessings of God \n\nMy sincere appreciation goes to my committee members; the central executives and zonal representatives. These guys are wonderful individuals. I pray that God multiply and increase you on every side. \n\nAlso, it would be unfair if I do not appreciate the 'Soaring Eagles Executives, headed by Pastor Kayode Odeyinka. God bless you. \n\nThis speech will not be complete if I fail to appreciate all Weapons of love. Thanks for believing in us and your constant push to see things done right. The lord bless you abundantly. Soar in God's grace and rest. \n\nAkeju Miracle Olu'aseun \nCAC EKSU Fyb chairman 2015/16.\n"));


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
