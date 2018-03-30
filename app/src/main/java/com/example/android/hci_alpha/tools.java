package com.example.android.hci_alpha;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class tools extends AppCompatActivity {

    ImageButton sickle, irri, tiller, sprayer, cutter, chainsaw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tools2);

        sickle = (ImageButton)findViewById(R.id.sickleImgbt);
        irri = (ImageButton)findViewById(R.id.irriImgbt);
        tiller = (ImageButton)findViewById(R.id.tillerImgbt);
        sprayer = (ImageButton)findViewById(R.id.sprayerImgbt);
        cutter = (ImageButton)findViewById(R.id.cutterImgbt);
        chainsaw = (ImageButton)findViewById(R.id.chainsawImgbt);


        sickle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.flipkart.com/pyramid-double-edge-garden-sickle/p/itmekjy4nzunqmqc");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        irri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.amazon.in/Pepper-Agro-Irrigation-Components-Gardening/dp/B01LZJMEPO");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);            }
        });

        tiller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.amazon.in/Pepper-Agro-Irrigation-Components-Gardening/dp/B01LZJMEPO");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);            }
        });

        sprayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.amazon.in/Kisan-Kraft-Pressure-Sprayer-Compressed/dp/B00LVH0B00");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);            }
        });

        cutter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.indiamart.com/proddetail/kisankraft-grinder-chaff-cutter-14206825788.html");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);            }
        });

        chainsaw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.industrybuying.com/petrol-chain-saw-turner-AG.CH.417401/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);            }
        });
    }
}
