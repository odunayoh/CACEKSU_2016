package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class AKINYELE extends AppCompatActivity {
    TextView qa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akinyele);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        qa = (TextView) findViewById(R.id.textakinyele);
       // qa.setText(String.format("Name: Ogunronbi Oluwatoyin Judith\nNickname: Apoti Eri\nSex;Female\nD.O.B;6th December\nHome Town;Ibadan\nL.G.A;Akinyele\nState Of Origin;Oyo\nHome Address;Awka Anambra State\nFaculty; Science\nDepartment; Biochemistry\nWhatsapp/Phone Numbers;08160858829\nE-Mail Judith. Toyin36@Gmail.Com\nFacebook Username;Toyin Judith\nInstagram Username:\nBb Pin;\nFavourite Food; Rice And Dodo\nFavourite Colour; Pink\nFavourite Quote; An Anthill Will Ever Be ,No Matter How The Elephant Tramples It.\nFavourite Bible Verse; God Is Able To Do Exceedingly Abundantly More Than We Can Ask Or Think.\nTurn On (Likes);Honesty And Love\nTurn Off (Dislikes):Hatred And Lies\nMarital Status; Single\nPost Held; Welfare Directress\n"));

qa.setText(String.format("NAME; AKINYELE DARE DAMILOLA\nNICKNAME;JUSTIFIED\nSEX;MALE\nD.O.B;1ST MAY\nHOME TOWN;ILESHA\nL.G.A; ODO ORO\nSTATE OF ORIGIN;OSUN\nHOME ADDRESS;7 ALHAJI ADEMOLA STREET, AFOBAJE OTTA.\nFACULTY;SCIENCE\nDEPARTMENT;BIOCHEMISTRY\nWHATSAPP/PHONE NUMBER(S);08165304555\nE-MAIL;GRACEFULLSAM@GMAIL.COM\nFACEBOOK USERNAME;AKINYELE DARE\nINSTAGRAM USERNAME;\nBB PIN;\nFAVOURITE FOOD;BEANS AND FRIED PLANTAIN\nFAVOURITE COLOUR;PURPLE\nFAVOURITE QUOTE;SLOW AND STEADY WINS THE RACE\nFAVOURITE BIBLE VERSE;ROMANS 8 VS 26\nTURN ON;LOVE\nTURN OFF;DISHONOUR\nMARITAL STATUS;SINGLE\nPOST HELD;FOLLOW UP COORDINATOR\n"));


    }

}
