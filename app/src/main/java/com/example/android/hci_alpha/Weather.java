package com.example.android.hci_alpha;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Weather extends AppCompatActivity {

    EditText edittext;
    Button search;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        edittext= (EditText)findViewById(R.id.editText);
        search = (Button)findViewById(R.id.search);

        final String text = edittext.getText().toString();

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.google.co.in/search?dcr=0&source=hp&ei=EVW8WtLxLIzTvgSPi6aYDg&q="+text+"+weather&oq="+text+"+weather&gs_l=psy-ab.3..35i39k1j0l9.942.4900.0.5003.23.17.1.0.0.0.251.2010.0j10j3.13.0....0...1c.1.64.psy-ab..9.14.2017.0..0i67k1j0i131k1j0i10k1j0i46i67k1j46i67k1j0i20i263k1.0.NKvyE5kwQfI");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

    }
}
