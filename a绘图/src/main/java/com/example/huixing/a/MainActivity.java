package com.example.huixing.a;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);

        layout.setOrientation(LinearLayout.HORIZONTAL);

        setContentView(layout);


        Myview myview = new Myview(this);


        layout.addView(myview);

        Button btn = new Button(this);


        layout.addView(btn);



//        myview.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "hahah",
//                        Toast.LENGTH_SHORT).show();
//            }
//        });






    }
}
