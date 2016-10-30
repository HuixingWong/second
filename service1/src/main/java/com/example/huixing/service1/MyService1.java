package com.example.huixing.service1;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import static android.content.ContentValues.TAG;
import static java.lang.Thread.sleep;

/**
 * Created by huixing on 2016/10/10.
 */

public class MyService1 extends IntentService {
    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param name Used to name the worker thread, important only for debugging.
     */
    private int count = 0;
    private boolean flag = true;

//    public  MyService1(){
//
//        this("Myservice");
//    }


    public MyService1(String name) {
        super(name);
    }



    //此方法内部自动开启一个子线程
    @Override
    protected void onHandleIntent(Intent intent) {

        while(flag){

            Log.i(TAG, "count:"+count);

            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            count++;
            if (count>100)flag = false;
        }



    }



}
