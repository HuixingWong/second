package com.example.huixing.a928activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        if (intent!=null){

            String name = intent.getStringExtra("name");
            //第二个参数为默认的数字
            int age = intent.getIntExtra("age", 0);
            Toast.makeText(this, name +" "+age, Toast.LENGTH_SHORT).show();
        }

    }
}
