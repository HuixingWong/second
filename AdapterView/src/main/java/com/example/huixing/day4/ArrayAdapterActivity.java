package com.example.huixing.day4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ArrayAdapterActivity extends AppCompatActivity {

    private ListView lv2;

    private  String[] books = {"java","android","js","javaee"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_adapter);

        lv2 = (ListView) findViewById(R.id.lv2);

        //1.
        //2.每一个列表项（item）的布局方式
        //3.指定数据
        ArrayAdapter<String> adapter = new
                ArrayAdapter<String>
                (this,android.R.layout.simple_list_item_1,books);

        lv2.setAdapter(adapter);

        lv2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override

            //position当前点击了第几项，从0开始
            public void onItemClick
                    (AdapterView<?> parent, View view, int position, long id) {
                switch (position){

                    case 0:

                }

            }
        });


    }
}
