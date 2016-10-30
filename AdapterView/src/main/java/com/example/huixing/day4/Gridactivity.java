package com.example.huixing.day4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Gridactivity extends AppCompatActivity {



    private GridView grid;

    private int icon [] = {R.drawable.e1,R.drawable.e2,R.drawable.e3,
            R.drawable.e4};

    private String [] names = {"小新","小白","风间","正男"};

    private List<Map<String,Object>> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridactivity);


        list = new ArrayList<>();
        grid = (GridView) findViewById(R.id.grid);

        for (int i= 0;i<icon.length;i++){

            Map map = new HashMap();
            map.put("icon",icon[i]);
            map.put("names",names[i]);

            list.add(map);
        }

        SimpleAdapter adapter = new SimpleAdapter(this,list,R.layout.grid_item,
                new String[] {"icon","names"},new int[]{R.id.head_image,R.id.tv_name});


        grid.setAdapter(adapter);

        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick
                    (AdapterView<?> parent, View view, int position, long id) {

                switch (position){

                    case 0:

                        break;

                    case 1:
                        break;

                    case  2:
                        break;

                    case  3:
                        break;


                }

            }
        });



    }
}
