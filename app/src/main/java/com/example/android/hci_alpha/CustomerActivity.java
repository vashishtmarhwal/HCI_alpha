package com.example.android.hci_alpha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class CustomerActivity extends AppCompatActivity {

    ImageButton nabardImgbtn, otherHelpImgbtn, kccImngbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);

        nabardImgbtn = (ImageButton)findViewById(R.id.nabardImgbt);
        otherHelpImgbtn = (ImageButton)findViewById(R.id.otherHelpImgbt);
        kccImngbtn = (ImageButton)findViewById(R.id.kccImgbt);

        nabardImgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CustomerActivity.this, nabardHelpLine.class));
            }
        });

        otherHelpImgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CustomerActivity.this, otherHelpNumber.class));
            }
        });

        kccImngbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CustomerActivity.this, kccHelpLine.class));
            }
        });

    }
}
