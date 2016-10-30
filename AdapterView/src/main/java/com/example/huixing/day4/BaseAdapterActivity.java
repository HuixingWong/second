package com.example.huixing.day4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class BaseAdapterActivity extends AppCompatActivity {

    private ListView lv_base;
    private List<Object> arrayList;
    private int[] head = {R.drawable.e1,R.drawable.e2,R.drawable.e3,
                        R.drawable.e4,R.drawable.e5,R.drawable.e6,
                        R.drawable.e7,R.drawable.e8,R.drawable.e9};
    private  String[] names = {"小新","阿呆","正男","小白","妮妮","风间","野原","美呀",
                                "广治"};

    private String [] desc = {"大家好，我叫野原新之助","石头","饭团头",
            "汪汪汪","过家家","补习班","理会你好啊","打屁股老妖怪","臭脚广治"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_adapter);

        lv_base = (ListView) findViewById(R.id.lv_base);


        arrayList= new ArrayList<>();

        for(int i=0;i<head.length;i++){
            User user = new User(head[i],names[i],desc[i]);
            arrayList.add(user);

        }


        MyAdapter adapter = new
                MyAdapter(this,arrayList);

        lv_base.setAdapter(adapter);


        //listview的点击事件

        lv_base.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent,
                                    View view, int position, long id) {

                switch (position){ //跟据item的position作出响应



                }
            }
        });





        //添加listview的长按事件
        lv_base.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick
                    (AdapterView<?> parent, View view, int position, long id) {


                switch (position){
                    case 0:

                        break;



                }




                return false;
            }
        });


    }
}
