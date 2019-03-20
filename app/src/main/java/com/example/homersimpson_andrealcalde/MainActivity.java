package com.example.homersimpson_andrealcalde;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView animacio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        animacio = findViewById(R.id.imageTitol);
        AnimationDrawable anim = (AnimationDrawable) animacio.getDrawable();
        anim.start();

    }


}