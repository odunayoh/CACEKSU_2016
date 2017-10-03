package com.charis_united.lmd.cac16.Fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by Baba2nde on 9/28/2016.
 */
public class MyFragPagerAdapter extends FragmentPagerAdapter {
ArrayList<Fragment> pages= new ArrayList();
    private Fragment  fragment;

    public MyFragPagerAdapter(FragmentManager fm)
    {
        super(fm);
    }



    @Override


    public Fragment getItem(int position) {

        return pages.get(position);
    }

    @Override
    public int getCount()
    {
        return pages.size();
    }




    public void addPage (Fragment fragment)

    {
        //this.f = f;
        pages.add(fragment);
    }


    @Override
    public CharSequence getPageTitle(int position)
    {
        return pages.get(position).toString();
    }



}
