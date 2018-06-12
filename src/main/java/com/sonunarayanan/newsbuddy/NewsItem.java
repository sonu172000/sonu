package com.sonunarayanan.newsbuddy;

import java.io.Serializable;

public class NewsItem implements Serializable {


    String title;
    String link;
    String image;
    String description;
    String date;
    private boolean name;


    @Override
    public String toString() {
        return title;
    }

    public boolean getName() {
        return name;
    }
}