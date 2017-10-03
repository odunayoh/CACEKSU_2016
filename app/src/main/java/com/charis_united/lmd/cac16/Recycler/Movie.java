package com.charis_united.lmd.cac16.Recycler;

/**
 * Created by Baba2nde on 9/28/2016.
 */
public class Movie {

    private String name;
    private int image;


    public Movie(String name, int image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
