package com.example.huixing.day4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleAdapterActivity extends AppCompatActivity {

    private ListView lv_simple;

    private int icon [] = {R.drawable.e1,R.drawable.e2,R.drawable.e3,
                R.drawable.e4};

    private String [] names = {"小新","小白","风间","正男"};

    private String [] desc = {"lalala","lalalla","lallala","lalalal"};


    private List<Map<String,Object>> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_adapter);



        list = new ArrayList<>();

        for (int i = 0;i<names.length;i++){

            Map<String,Object> map = new HashMap();
            map.put("head",icon[i]);
            map.put("name",names[i]);
            map.put("desc",desc[i]);

            list.add(map);
        }


        //1 上下文对象
        //2 数据源
        //3 布局文件
        //4 map里的key值
        //5 需要显示的控件的id

        SimpleAdapter adapter = new
                SimpleAdapter(this,list,R.layout.simpleadapter_layout,
                new String[] {"head","name","desc"},
                new int[]{R.id.icon_iv,R.id.txt1,R.id.txt2});

        lv_simple= (ListView) findViewById(R.id.lv_simple);


        lv_simple.setAdapter(adapter);

    }
}
