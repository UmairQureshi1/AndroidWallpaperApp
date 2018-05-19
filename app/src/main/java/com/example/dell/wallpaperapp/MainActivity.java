package com.example.dell.wallpaperapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    ImageView wall11, wall22, wall33, wall44;
    Glide GlideApp1, GlideApp2, GlideApp3, GlideApp4;
    ImageButton a, b;
    Boolean s = false;

    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wall11 = (ImageView) findViewById(R.id.wall1);
        wall22 = (ImageView) findViewById(R.id.wall2);
        wall33 = (ImageView) findViewById(R.id.wall3);
        wall44 = (ImageView) findViewById(R.id.wall4);
        a = (ImageButton) findViewById(R.id.test);
        GlideApp1.with(this)
                .load("https://i.pinimg.com/736x/93/53/8e/93538e3107ae3383a17eb32727cf35fa--wallpaper-iphone-disney-nature-wallpaper.jpg")
                .centerCrop()
                .into(wall11);


        GlideApp2.with(this)
                .load("https://i.pinimg.com/originals/24/79/9d/24799dadde037ff7ba616880c2cc0eea.jpg")
                .centerCrop()
                .into(wall22);

        GlideApp3.with(this)
                .load("https://i.imgur.com/psU3jQQ.jpg")
                .centerCrop()
                .into(wall33);


        GlideApp4.with(this)
                .load("https://i.imgur.com/MBiS8lZ.jpg")
                .centerCrop()
                .into(wall44);



        a.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


                if (s) {
                    Toast.makeText(getApplicationContext(), "Remove from favorite", Toast.LENGTH_SHORT).show();
                    a.setImageResource(R.mipmap.heart2);
                    s = false;
                } else {
                    Toast.makeText(getApplicationContext(), "Add to favorite", Toast.LENGTH_SHORT).show();
                    a.setImageResource(R.mipmap.heart);
                    s = true;

                }
            }
        });
}
    }

