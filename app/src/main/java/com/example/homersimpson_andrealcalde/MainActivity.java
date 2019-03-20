package com.example.homersimpson_andrealcalde;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView animacio, homer, blau, verd, vermell, donut, ull;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        animacio = findViewById(R.id.imageTitol);
        AnimationDrawable anim = (AnimationDrawable) animacio.getDrawable();
        anim.start();
        homer = findViewById(R.id.imageHomer);
        blau = findViewById(R.id.imageBlau);
        blau.setVisibility(View.INVISIBLE);

        verd = findViewById(R.id.imageVerd);
        verd.setVisibility(View.INVISIBLE);

        vermell = findViewById(R.id.imageVermell);
        vermell.setVisibility(View.INVISIBLE);

        donut = findViewById(R.id.imageDonut);
        donut.setVisibility(View.INVISIBLE);

        ull = findViewById(R.id.imageUll);
        ull.setVisibility(View.INVISIBLE);

        animacio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animrotate = AnimationUtils.loadAnimation(getBaseContext(), R.anim.animacion1);
                Animation animull = AnimationUtils.loadAnimation(getBaseContext(), R.anim.animacion2);
                Animation animdonut = AnimationUtils.loadAnimation(getBaseContext(), R.anim.animacion3);
                if (blau.getVisibility() == View.INVISIBLE) {
                    blau.setVisibility(View.VISIBLE);
                    blau.startAnimation(animrotate);
                    verd.setVisibility(View.VISIBLE);
                    verd.startAnimation(animrotate);
                    vermell.setVisibility(View.VISIBLE);
                    vermell.startAnimation(animrotate);
                    donut.setVisibility(View.VISIBLE);
                    donut.startAnimation(animdonut);
                    ull.setVisibility(View.VISIBLE);
                    ull.startAnimation(animull);

                } else {
                    blau.clearAnimation();
                    blau.setVisibility(View.INVISIBLE);
                    verd.clearAnimation();
                    verd.setVisibility(View.INVISIBLE);
                    vermell.clearAnimation();
                    vermell.setVisibility(View.INVISIBLE);
                    donut.clearAnimation();
                    donut.setVisibility(View.INVISIBLE);
                    ull.clearAnimation();
                    ull.setVisibility(View.INVISIBLE);

                }
            }
        });
    }


}