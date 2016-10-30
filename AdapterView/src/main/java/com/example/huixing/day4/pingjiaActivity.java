package com.example.huixing.day4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class pingjiaActivity extends AppCompatActivity {

    private TextView pingjia_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pingjia);
        Intent intent = getIntent();
        String data = intent.getStringExtra("extra_data");
        String data1 = intent.getStringExtra("extra_data1");

        pingjia_text = (TextView) findViewById(R.id.pingjia_txt);
        pingjia_text.setText(data+" "+data1);

    }
}
