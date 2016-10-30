package com.example.huixing.a928activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void  jump(View view){

        Intent intent = new Intent(MainActivity.this,Main2Activity.class);

//        intent.putExtra("name","周杰伦");
//        intent.putExtra("age",37);

        Bundle bundle = new Bundle();
//        bundle.putString("1","qqq");


        startActivity(intent);

    }


}
