package com.septiningrum_202102248.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private ImageView _imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _imageView1 = (ImageView) findViewById(R.id.imageView1);

        String imageUrl = "https://i.pinimg.com/originals/36/9c/e1/369ce1f499f960162dd165eabc1bcce8.jpg";
        Picasso.with(this).load(imageUrl).into(_imageView1);
    }
}