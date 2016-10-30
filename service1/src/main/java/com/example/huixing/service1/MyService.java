package com.example.huixing.service1;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import static android.content.ContentValues.TAG;

public class MyService extends Service {


    private int count = 0;
    private boolean flag = true;

    public MyService() {



    }

    @Override
    public void onCreate() {

        Log.i(TAG, "onCreate: ");
    }

    @Override
    public int onStartCommand(Intent intent, final int flags, int startId) {

        Log.i(TAG, "onStartCommand: ");

        new Thread(){

            public void  run(){

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

        }.start();


        return super.onStartCommand(intent, flags, startId);

    }

    @Override
    public void onDestroy() {

        flag = false;


        Log.i(TAG, "onDestroy: ");

    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.



            return null;
    }
}
