package com.example.huixing.day4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    private Button pingjia_btn;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        pingjia_btn = (Button) findViewById(R.id.pingjia);
        editText = (EditText) findViewById(R.id.edittext);



        pingjia_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str= editText.getText().toString();
                String str1 = "啦啦啦";

                Intent intent = new Intent
                        (Main2Activity.this,pingjiaActivity.class);
                intent.putExtra("extra_data",str);
                intent.putExtra("extra_data1",str1);

                startActivity(intent);
            }
        });
    }
}
