package com.example.huixing.day4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterViewFlipper;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;

public class AdapterViewFliperActivity extends AppCompatActivity {

    private int[] images = {R.drawable.e1,R.drawable.e2,R.drawable.e3,
            R.drawable.e4,R.drawable.e5,R.drawable.e6,
            R.drawable.e7,R.drawable.e8,R.drawable.e9};
    private AdapterViewFlipper avf;
    private Button pre,next,auto,stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter_view_fliper);

        avf = (AdapterViewFlipper) findViewById(R.id.avf);
        pre = (Button) findViewById(R.id.fore);
        next = (Button) findViewById(R.id.next);
        auto = (Button) findViewById(R.id.auto);
        stop = (Button) findViewById(R.id.stop);


        avf.setAdapter(new BaseAdapter() {
            @Override
            public int getCount() {
                return images.length;
            }

            @Override
            public Object getItem(int position) {
                return images[position];
            }

            @Override
            public long getItemId(int position) {
                return position;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {

                ImageView imgv = new ImageView(AdapterViewFliperActivity.this);

                imgv.setImageResource(images[position]);

                return imgv;
            }
        });

          auto.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {

                   avf.startFlipping();

              }
          });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                avf.stopFlipping();
            }
        });

        pre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                avf.showPrevious();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                avf.showNext();
            }
        });



    }
}
