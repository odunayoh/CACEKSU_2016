package com.charis_united.lmd.cac16.Recycler;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.charis_united.lmd.cac16.AnimationUtil;
import com.charis_united.lmd.cac16.R;

import java.util.ArrayList;

/**
 * Created by Baba2nde on 9/28/2016.
 */
public class MyRecyclerAdapter extends RecyclerView.Adapter<MyViewholder> {
    int previousPosition;
    Context c;
   public ArrayList<Movie> movies;
    ArrayList<Movie> filterList;



    public  MyRecyclerAdapter(Context c, ArrayList<Movie> movies) {
        this.c = c;
        this.movies = movies;
        this.filterList=movies;
    }



    @Override
    public MyViewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.model, null);
        MyViewholder holder = new MyViewholder(v);
        return holder;
    }

    //BIND DATA TO VIEW

    @Override
    public void onBindViewHolder(final MyViewholder holder, final int position) {
        holder.nameTxt.setText(movies.get(position).getName());
        holder.img.setImageResource(movies.get(position).getImage());

        if(position > previousPosition){
            AnimationUtil.animate(holder, true);
        }else {
            AnimationUtil.animate(holder, false);
        }
        previousPosition = position;

        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(View v, int pos) {

                switch (getItemViewType(pos))
                {



                    }












            }
        });


    }



    @Override
    public int getItemCount()
    {
        return movies.size();
    }
//returns filter object

    }

