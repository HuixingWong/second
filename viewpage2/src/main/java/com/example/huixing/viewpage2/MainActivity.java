package com.example.huixing.viewpage2;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager vp2;
    private View view1,view2,view3;

    private List<View> viewList;

    private int[] images  = {R.drawable.a1,R.drawable.a2,R.drawable.a3};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vp2 = (ViewPager) findViewById(R.id.vp2);

        view1 = View.inflate(this,R.layout.layout1,null);
        view2 = View.inflate(this,R.layout.layout2,null);
        view3 = View.inflate(this,R.layout.layout3,null);

        viewList = new ArrayList<>();
        viewList.add(view1);
        viewList.add(view2);
        viewList.add(view3);


        vp2.setAdapter(new Myadapter());




    }

    class  Myadapter extends PagerAdapter{

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {


            return view == object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {

            container.addView(viewList.get(position));

            return position;

        }


        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {


            container.removeView(viewList.get(position));
        }
    }

}
