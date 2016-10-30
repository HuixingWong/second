package com.example.huixing.ll;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by huixing on 2016/9/23.
 */

public class MyView extends RelativeLayout{


    TextView tv;
    ImageView icon_iv;

    public MyView(Context context, AttributeSet attrs) {

        super(context, attrs);

        initView(context);



        TypedArray ta = context.obtainStyledAttributes
                (attrs,R.styleable.MyView_style);

        Drawable drawable = ta.getDrawable(R.styleable.MyView_style_src);

        String text = ta.getString(R.styleable.MyView_style_text);

        icon_iv.setImageDrawable(drawable);
        tv.setText(text);
        //回收资源
        ta.recycle();



    }

    public  void initView(Context context){


        View view = View.inflate(context, R.layout.myview_item, this);

        tv = (TextView) view.findViewById(R.id.tv);

        icon_iv = (ImageView) view.findViewById(R.id.icon_iv);





    }





}
