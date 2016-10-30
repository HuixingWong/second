package com.example.huixing.day4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class BaseAdapterActivity3 extends AppCompatActivity {


    private List<bean> list;

    private ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_adapter3);

        list = new ArrayList<bean>();

        bean b1 = new bean(R.drawable.e1,"二逼","我是二逼");
        bean b2 = new bean(R.drawable.e2,"二逼","我是二逼");
        bean b3 = new bean(R.drawable.e3,"二逼","我是二逼");

        list.add(b1);
        list.add(b2);
        list.add(b3);

        lv = (ListView) findViewById(R.id.lv_base3);

        Myadapter3 myadapter3 = new Myadapter3(this,list);

        lv.setAdapter(myadapter3);



    }
}
