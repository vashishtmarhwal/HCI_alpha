package com.example.android.hci_alpha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class BuyActivity extends AppCompatActivity {

    ImageButton crop, tools, pesti, insecti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);

        crop = (ImageButton)findViewById(R.id.cropImgbt);
        tools = (ImageButton)findViewById(R.id.toolsImgbt);
        pesti = (ImageButton)findViewById(R.id.pestiImgbt);

        crop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BuyActivity.this, crop.class));
            }
        });

        tools.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BuyActivity.this, tools.class));
            }
        });

        pesti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BuyActivity.this, pesti.class));
            }
        });



    }
}
