package com.example.huixing.day4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ViewSwitcherActivity extends AppCompatActivity {



    private int[] images = {R.drawable.e1,R.drawable.e1,R.drawable.e1,
            R.drawable.e1,R.drawable.e1,R.drawable.e1,
            R.drawable.e1,R.drawable.e1,R.drawable.e1,
            R.drawable.e1,R.drawable.e1,R.drawable.e1,
            R.drawable.e1,R.drawable.e1,R.drawable.e1};


    private List<Map<String,Object>> list = new ArrayList<>();

    private  ImageSwitcher switcher;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallary2);

        for (int i=0;i<images.length;i++){

            Map map = new HashMap();
            map.put("image",images[i]);
            list.add(map);

        }
        //获取显示图片的swicher

        switcher = (ImageSwitcher) findViewById(R.id.swicher);
        //设置图片更换的效果

        switcher.setInAnimation(AnimationUtils.loadAnimation
                (this,android.R.anim.fade_in));

        switcher.setOutAnimation(AnimationUtils.loadAnimation
                (this,android.R.anim.fade_out));

        //为imageswicher设置图片切换的动画效果
        switcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {

                ImageView imageView = new ImageView(ViewSwitcherActivity.this);
                imageView.setBackgroundColor(0xff0000);
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                return imageView;
            }
        });



    }
}
