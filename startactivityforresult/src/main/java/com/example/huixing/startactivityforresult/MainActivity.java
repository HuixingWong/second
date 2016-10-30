package com.example.huixing.startactivityforresult;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText edt1;
    private TextView txt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1 = (EditText) findViewById(R.id.edt1);
        txt1 = (TextView) findViewById(R.id.txt1);



    }

    public  void start(View view){

        String data = edt1.getText().toString();

        Intent intent = new Intent();

        intent.setAction("tt");

        intent.putExtra("key",data);

        startActivityForResult(intent,1);


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode==1&&resultCode==2){

            String value = data.getStringExtra("key2");

            txt1.setText(value);

        }

    }
}
