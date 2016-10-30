package com.example.huixing.popwindow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;

public class MainActivity extends AppCompatActivity {

    private PopupWindow pop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public  void showPop(View view){

        getPopwindow();

        pop.showAtLocation(view, Gravity.CENTER,
                WindowManager.LayoutParams.MATCH_PARENT,200);

    }


    private void getPopwindow() {

        if (pop != null){
            pop.dismiss();
            return;
        }else {
            initPopwindow();
        }
    }

    //初始化一个popwindow
    private void initPopwindow() {

        final View contentView = View.inflate(this, R.layout.pop_contentview, null);

        pop = new PopupWindow(contentView,200,200,true);

        contentView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (pop != null && pop.isShowing()){

                    pop.dismiss();
                    pop = null;
                }

                return false;
            }
        });

    }


}
