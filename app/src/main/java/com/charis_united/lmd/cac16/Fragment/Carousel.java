package com.charis_united.lmd.cac16.Fragment;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.charis_united.lmd.cac16.R;
import com.charis_united.lmd.cac16.SlidingImage_Adapter;

/**
 * Created by Baba2nde on 11/22/2016.
 */


public class Carousel extends  android.support.v4.app.Fragment
{
    ViewPager mPager;

SlidingImage_Adapter adapter;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.fragment_three, null);
        mPager = (ViewPager) v.findViewById(R.id.pager);
        adapter = new SlidingImage_Adapter(getContext());
        mPager.setAdapter(adapter);


        return v;

    }





    @Override
    public String toString ()
    {
        return "Memories";

    }


}
