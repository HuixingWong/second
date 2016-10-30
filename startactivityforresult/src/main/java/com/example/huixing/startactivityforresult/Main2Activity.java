package com.example.huixing.startactivityforresult;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private EditText edt2;
    private TextView txt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        edt2 = (EditText) findViewById(R.id.edt2);
        txt2 = (TextView) findViewById(R.id.txt2);



        Intent intent = new Intent();
        if (getIntent()!=null){


             intent = getIntent();

            String data = intent.getStringExtra("key");

            txt2.setText(data);


        }


    }


    public  void back(View view){

        String data1 = edt2.getText().toString();

        Intent intent = new Intent();

        intent.putExtra("key2",data1);

        setResult(2,intent);

        finish();



    }
}
