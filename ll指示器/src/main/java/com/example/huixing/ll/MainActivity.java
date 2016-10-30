package com.example.huixing.ll;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager main_vp;
    private TextView tv_1,tv_2,tv_3;
    private ImageView iv_indiator;

    //初始位置的偏移量
    private int offset;

    //图片的宽度
    private int imagewidth;

    private List<View> views;//viewpage中的界面

    private  View view_1,view_2,view_3;


    //当前显示界面的编号
    private int current;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();



    }

    private void init() {

        tv_1 = (TextView) findViewById(R.id.main_title_music);
        tv_1.setOnClickListener(new MyOnclickListener(0));

        tv_2 = (TextView) findViewById(R.id.main_title_movie);
        tv_2.setOnClickListener(new MyOnclickListener(1));


        tv_3 = (TextView) findViewById(R.id.main_title_game);
        tv_3.setOnClickListener(new MyOnclickListener(2));






        iv_indiator = (ImageView) findViewById(R.id.main_iv_indiator);

        imagewidth = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher).getWidth();

        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        int screenWidth = metrics.widthPixels;
        offset = (screenWidth/3 - imagewidth)/2;

        Matrix matrix = new Matrix();
        matrix.postTranslate(offset,0);
        iv_indiator.setImageMatrix(matrix);









        main_vp = (ViewPager) findViewById(R.id.main_vp);

        view_1 = View.inflate(this,R.layout.layout1,null);
        view_2 = View.inflate(this,R.layout.layout2,null);
        view_3 = View.inflate(this,R.layout.layout3,null);
        views = new ArrayList<>();
        views.add(view_1);
        views.add(view_2);
        views.add(view_3);



        main_vp.setAdapter(new MyPagerAdapter(views) {

        });

        main_vp.addOnPageChangeListener(new MypageChangeListener());


    }

    //三个textview的事件监听方法。自己重写的
    private class MyOnclickListener implements View.OnClickListener {


        private  int index;
        public MyOnclickListener(int index){
            this.index = index;
        }

        @Override
        public void onClick(View v) {

            main_vp.setCurrentItem(index);





//            Toast.makeText(MainActivity.this, "222", Toast.LENGTH_SHORT).show();

        }



    }


    //viewPager的适配器，pageAdapter
    private class MyPagerAdapter extends PagerAdapter {

        //创建一个view类型的数组
        private  List<View> views;


        //在构造器中初始化
        public MyPagerAdapter(List<View> views) {

            this.views = views;
        }

        @Override

        public int getCount() {
            return views.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {

            return view == object;

        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {

            container.removeView(views.get(position));

        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {

            container.addView(views.get(position));

            return views.get(position);


//            return position;


        }
    }

    private class MypageChangeListener implements ViewPager.OnPageChangeListener {

        int one = offset * 2 + imagewidth;// 页卡1 -> 页卡2 偏移量
        int two = one * 2;// 页卡1 -> 页卡3 偏移量

        @Override
        public void onPageScrolled
                (int position, float positionOffset, int positionOffsetPixels) {

//            Toast.makeText(MainActivity.this, "onPageScrolled", Toast.LENGTH_SHORT).show();

            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setIcon(R.mipmap.ic_launcher);
            builder.setTitle("onPageScrolled");
            builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
//            builder.create().show();

        }

        @Override
        public void onPageSelected(int position) {


//            Animation animation = new TranslateAnimation();
            Animation animation = new TranslateAnimation(one*current, one*position, 0, 0);
            current= position;
            animation.setFillAfter(true);// True:图片停在动画结束位置
            animation.setDuration(300);
            iv_indiator.startAnimation(animation);
//            Toast.makeText(MainActivity.this, "您选择了"+
//                    main_vp.getCurrentItem()+"页卡", Toast.LENGTH_SHORT).show();

        }

        @Override
       public void onPageScrollStateChanged(int state) {

//            Toast.makeText(MainActivity.this, "onPageScrollStateChanged", Toast.LENGTH_SHORT).show();
        }
    }
}




