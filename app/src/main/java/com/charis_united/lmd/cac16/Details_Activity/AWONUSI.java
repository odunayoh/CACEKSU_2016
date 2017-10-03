package com.charis_united.lmd.cac16.Details_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.charis_united.lmd.cac16.R;

public class AWONUSI extends AppCompatActivity {
    TextView tuy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_awonusi);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tuy = (TextView) findViewById(R.id.textawonusi);
       // tuy.setText(String.format("Name;Awodele Oluwaseun\nNickname; \nSex; Female\nD.O.B;22 Dec\nHome Town; Iwo \nL.G.A; Olaoluwa \nState Of Origin; Osun\nHome Address; Otaefun Osogbo\nFaculty; Arts\nDepartment;English\nWhatsapp/Phone Number(S); 08063046023\nE-Mail; Odunawodele@Gmail.Com\nFacebook Username; Awodele Oluwaseun\nInstagram Usernam; \nBb Pin;\nFavourite Food; Yam And Fried Egg\nFavourite Colour; Purple\nFavourite Quote; \nFavourite Bible Verse; Proverb 1 Vs 8\nTurn On; Godliness\nTurn Off; Ungodliness\nMarital Status; Not Engaged\nPost Held; Child Of God\n"));
tuy.setText(String.format("NAME;Awonusi Michael Kolawole\nNICKNAME; BUY BOOKS\nSEX;MALE\nD.O.B;3RD JUNE\nHOME TOWN; OWO\nL.G.A;OWO LOCAL GOVERNMENT\nSTATE OF ORIGIN;ONDO\nHOME ADDRESS;UGELE ESTATE ADO ROAD AKURE\nFACULTY;SCIENCE\nDEPARTMENT;STATISTICS\nWHATSAPP/PHONE NUMBER(S); 07034876983\nE-MAIL;AWONUSIMKO@YAHOO.COM\nFACEBOOK USERNAME;AWONUSI KOLAWOLE MICAEL\n INSTAGRAM USERNAME;\nBB PIN;\nFAVOURITE IYAN AND EGUYSI\nFAVOURITE COLOUR;WHITE\nFAVOURITE QUOTE; \nFAVOURITE BIBLE VERSE;\nTURN ON;HONESTY\nTURN OFF; DISHONESTY\nMARITAL STATUS;SINGLE\nPOST HELD;ASS LIBRARY CORDINATOR\n\n"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
