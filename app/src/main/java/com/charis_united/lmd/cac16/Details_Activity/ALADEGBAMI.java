package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class ALADEGBAMI extends AppCompatActivity {
    TextView bn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aladegbami);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        bn = (TextView) findViewById(R.id.textaladegbami);
        bn.setText(String.format("Name: Aladegbami Ademola Victor \nNickname: Princedemmy\nSex: Male\nDob: 21th December\nHome Town: Ifaki\nLga: Ido Osi\nState Of Origin: Ekiti  \nHome Address:  36, Adekola Adetoyoese Street, Ikotun Lagos\nFaculty: Management Science\nDepartment: Business Administration\nNumbeer/Whatsapp:  08140552023\nEmail:  Aladegbamiademola@Gmail.Com\nFacebook: Aladegbami Ademola\nFavourite Food: Beans And Fried Plaintain\nFavourite Colour: White And Blue\nFavourite Quote: Life Is Not Meant To Be Measured By Duration You Spent, But By The Donation You Made To Live\nFavourite Bible Verse: Psalms 91\nTurn On:  Music\nTurn Off:  Lies\nMarital Status: Single\n\n"));
    }

}
