package com.charis_united.lmd.cac16;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

/**
 * Created by Baba2nde on 11/26/2016.
 */



public class SlidingImage_Adapter extends PagerAdapter
{

    private int image_resources [] = {R.drawable.aone,
        R.drawable.atwo,
        R.drawable.athree,
        R.drawable.afour,
        R.drawable.afive,
        R.drawable.asix,
        R.drawable.bone,
        R.drawable.bnine,
        R.drawable.bthree,
        R.drawable.bfour,
        R.drawable.bfive,
        R.drawable.bsix,
        R.drawable.bseven,
        R.drawable.beight,
        R.drawable.bten,
        R.drawable.beleven,
        R.drawable.bthirtheen,
        R.drawable.bfortheen,
        R.drawable.bfifteen,
        R.drawable.bsixteen};

    private Context ctx;
    private LayoutInflater layoutInflater;

    public SlidingImage_Adapter (Context ctx)
    {

        this.ctx = ctx;

    }




    @Override
    public int getCount()
    {
        return image_resources.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object)
    {
        return view == ((FrameLayout)object);
    }


    @Override
    public Object instantiateItem(ViewGroup container, int position)
    {
        layoutInflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view = layoutInflater.inflate(R.layout.slidingimage,container,false);
        ImageView imageView = (ImageView) item_view.findViewById(R.id.image);
        imageView.setImageResource(image_resources[position]);
        container.addView(item_view);
        return item_view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object)
    {
     container.removeView((FrameLayout)object);
    }
}