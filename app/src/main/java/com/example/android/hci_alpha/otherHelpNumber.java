package com.example.android.hci_alpha;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class otherHelpNumber extends AppCompatActivity {

    ImageButton agroforest, agronomy, agrieng, animalh, animalp, animaln;
    private static final int MAKE_CALL_PERMISSION_REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_help_number);

        agroforest = (ImageButton) findViewById(R.id.agroforestryImgbt);
        agrieng = (ImageButton) findViewById(R.id.agriengImgbt);
        agronomy = (ImageButton) findViewById(R.id.agronomyImgbt);
        animalh = (ImageButton) findViewById(R.id.animalHealthImgbt);
        animaln = (ImageButton) findViewById(R.id.animalNutriImgbt);
        animalp = (ImageButton) findViewById(R.id.animalProdImgbt);

        agroforest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:2570257"));
                if (checkPermission(Manifest.permission.CALL_PHONE)) {
                    startActivity(callIntent);
                }
            }
        });

        agrieng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:2570635"));
                if (checkPermission(Manifest.permission.CALL_PHONE)) {
                    startActivity(callIntent);
                }
            }
        });

        agronomy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:2570306"));
                if (checkPermission(Manifest.permission.CALL_PHONE)) {
                    startActivity(callIntent);
                }
            }
        });

        animalp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:2570362"));
                if (checkPermission(Manifest.permission.CALL_PHONE)) {
                    startActivity(callIntent);
                }
            }
        });

        animaln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:2570231"));
                if (checkPermission(Manifest.permission.CALL_PHONE)) {
                    startActivity(callIntent);
                }
            }
        });

        animalh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:2570071"));
                if (checkPermission(Manifest.permission.CALL_PHONE)) {
                    startActivity(callIntent);
                }
            }
        });

    }

    private boolean checkPermission(String permission) {
        return ContextCompat.checkSelfPermission(this, permission) == PackageManager.PERMISSION_GRANTED;
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch(requestCode) {
            case MAKE_CALL_PERMISSION_REQUEST_CODE :
                if (grantResults.length > 0 && (grantResults[0] == PackageManager.PERMISSION_GRANTED)) {
                    agroforest.setEnabled(true);
                    agrieng.setEnabled(true);
                    agronomy.setEnabled(true);
                    animaln.setEnabled(true);
                    animalh.setEnabled(true);
                    animalp.setEnabled(true);
                }
                return;
        }
    }

}
