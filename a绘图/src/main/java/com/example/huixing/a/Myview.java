package com.example.huixing.a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by huixing on 2016/9/20.
 */
//自定义view
public class Myview extends View{


    public Myview(Context context) {
        super(context);

    }

    @Override
    //重写ondraw方法
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //将画布的颜色设置为白色
        canvas.drawColor(Color.WHITE);
        //创建画笔
        Paint paint = new Paint();
        //设置画笔颜色
        paint.setColor(Color.CYAN);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(3);

        //绘制圆形
        canvas.drawCircle(40,40,30,paint);





    }
}
