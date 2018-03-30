package com.example.android.hci_alpha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class pesti extends AppCompatActivity {

    ImageButton wheatp, ricep, barleyp, maizep, sugarcanep, potatop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesti);

        wheatp = (ImageButton)findViewById(R.id.wheatpImgbt);
        ricep = (ImageButton)findViewById(R.id.ricepImgbt);
        barleyp = (ImageButton)findViewById(R.id.barleypImgbt);
        maizep = (ImageButton)findViewById(R.id.maizepImgbt);
        sugarcanep = (ImageButton)findViewById(R.id.sugarpImgbt);
        potatop = (ImageButton)findViewById(R.id.potatopImgbt);


        wheatp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(pesti.this, wheatp.class));
            }
        });

        ricep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(pesti.this, ricep.class));
            }
        });

        barleyp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(pesti.this, barleyp.class));
            }
        });

        maizep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(pesti.this, maizep.class));
            }
        });

        sugarcanep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(pesti.this, sugarcanep.class));
            }
        });

        potatop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(pesti.this, potatop.class));
            }
        });

    }
}
