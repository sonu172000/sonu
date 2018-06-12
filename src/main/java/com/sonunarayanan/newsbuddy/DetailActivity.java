package com.sonunarayanan.newsbuddy;


import android.os.Bundle;
import android.support.v4.widget.ImageViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.google.android.gms.common.images.ImageRequest;


public class DetailActivity extends AppCompatActivity {

    private static final String TAG = "DetailActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getIncomingIntent();
    }
    private void getIncomingIntent(){

        if (getIntent().hasExtra("image")){

            String image = getIntent().getStringExtra("image");

            setImage(image);


        }


    }


    private void setImage (String image){
         findViewById(R.id.postImage);

        ImageView img = null;
        Glide.with(this)
                .asBitmap()
                .load(image)
                .into(img);


    }


}

