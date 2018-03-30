package com.example.android.hci_alpha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class crop extends AppCompatActivity {

    ImageButton wheat, rice, barley, maize, sugarcane, potato;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crop);

        wheat = (ImageButton)findViewById(R.id.wheatImgbt);
        rice = (ImageButton)findViewById(R.id.riceImgbt);
        barley = (ImageButton)findViewById(R.id.barleyImgbt);
        maize = (ImageButton)findViewById(R.id.maizeImgbt);
        sugarcane = (ImageButton)findViewById(R.id.sugarcaneImgbt);
        potato = (ImageButton)findViewById(R.id.potatoImgbt);


        wheat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(crop.this, wheat.class));
            }
        });

        rice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(crop.this, rice.class));
            }
        });

        barley.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(crop.this, barley.class));
            }
        });

        maize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(crop.this, maize.class));
            }
        });

        sugarcane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(crop.this, sugarcane.class));
            }
        });

        potato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(crop.this, potato.class));
            }
        });

    }
}
