package com.example.homersimpson_andrealcalde;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

        homer = findViewById(R.id.imageHomer);
        homer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (blau.getVisibility() == View.INVISIBLE) {
                    blau.setVisibility(View.VISIBLE);
                    verd.setVisibility(View.VISIBLE);
                    vermell.setVisibility(View.VISIBLE);
                    donut.setVisibility(View.VISIBLE);
                    ull.setVisibility(View.VISIBLE);
                } else {
                    blau.setVisibility(View.INVISIBLE);
                    verd.setVisibility(View.INVISIBLE);
                    vermell.setVisibility(View.INVISIBLE);
                    donut.setVisibility(View.INVISIBLE);
                    ull.setVisibility(View.INVISIBLE);
                }
            }
        });
    }


}