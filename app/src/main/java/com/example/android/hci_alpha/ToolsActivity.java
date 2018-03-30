package com.example.android.hci_alpha;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ToolsActivity extends AppCompatActivity {

    ImageButton autoS, autoT, cropS,  teleF, teleA, smartIrri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tools);

        autoS = (ImageButton)findViewById(R.id.autoSImgbt);
        autoT = (ImageButton)findViewById(R.id.autoTImgbt);
        cropS = (ImageButton)findViewById(R.id.cropSImgbt);
        teleF = (ImageButton)findViewById(R.id.teleFImgbt);
        teleA = (ImageButton)findViewById(R.id.teleAImgbt);
        smartIrri = (ImageButton)findViewById(R.id.smartIrriImgbt);

        autoS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ToolsActivity.this, swath.class));
            }
        });

        autoT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ToolsActivity.this, tractor.class));
            }
        });

        cropS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ToolsActivity.this, sensor.class));
            }
        });

        teleF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ToolsActivity.this, teleFa.class));
            }
        });

        teleA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ToolsActivity.this, teleAn.class));
            }
        });

        smartIrri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ToolsActivity.this, smart.class));
            }
        });


    }
}
