 package com.example.huixing.day4;

 import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
 import android.widget.AdapterView;
 import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

 public class GallryActivity extends AppCompatActivity {

    private ImageView image;
     private Gallery gallery;
     private int images[] = {R.drawable.e1,R.drawable.e2,
     R.drawable.e3,R.drawable.e4,R.drawable.e5,R.drawable.e6,R.drawable.e7,
             R.drawable.e8,R.drawable.e9};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallry);

        image = (ImageView) findViewById(R.id.image);
        gallery = (Gallery) findViewById(R.id.gallay);

        List<Map<String,Integer>> list = new ArrayList<>();

        for (int i=0;i<images.length;i++){
            Map map = new HashMap();
            map.put("image",images[i]);
            list.add(map);

        }


        SimpleAdapter adapter =  new SimpleAdapter(this,list,R.layout.gallary_item,
                new String[] {"image"},new int[] {R.id.gallary_iv});

        gallery.setAdapter(adapter);

        gallery.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                image.setImageResource(images[position]);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }








     //第二种方法

     class  Myadapter extends BaseAdapter{
         @Override
         public int getCount() {

             return images.length;

         }

         @Override
         public Object getItem(int position) {
             return null;
         }

         @Override
         public long getItemId(int position) {
             return 0;
         }




         @Override
         public View getView(int position, View convertView, ViewGroup parent) {


             ImageView image = new ImageView(GallryActivity.this);

             if (convertView == null){


             }else {


             }
             return convertView;
         }


         class ViewHolder{



         }

     }

}
