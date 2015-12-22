package com.example.test4.ipl;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by bridgelabz4 on 16/12/15.
 */
public class customAdapter
{
    private int movie_resources;
    private String movie_title;

    public String getMovie_title() {
        return movie_title;
    }
    public customAdapter(int movie_resources, String movie_title)
    {
        this.setMovie_resources(movie_resources);
        this.setMovie_title(movie_title);
    }

    public void setMovie_title(String movie_title) {
        this.movie_title = movie_title;
    }

    public int getMovie_resources() {
        return movie_resources;
    }

    public void setMovie_resources(int movie_resources) {
        this.movie_resources = movie_resources;
    }
}
