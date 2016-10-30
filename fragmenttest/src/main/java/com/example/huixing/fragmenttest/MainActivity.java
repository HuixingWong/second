package com.example.huixing.fragmenttest;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnLoadFrag1 = (Button)findViewById(R.id.btn_show_fragment1);
        btnLoadFrag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                fragment1 fragment123 = new fragment1();
//                transaction.add(fragment_container, fragment1);

                transaction.add(R.id.fragment_container,fragment123);
//                transaction.add();
                transaction.commit();
            }
        });

        Button btnLoagFrag2 = (Button)findViewById(R.id.btn_show_fragment2);
        btnLoagFrag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                fragment2 fragment234 = new fragment2();
                transaction.add(R.id.fragment_container, fragment234);
                transaction.commit();
            }
        });
    }
}
