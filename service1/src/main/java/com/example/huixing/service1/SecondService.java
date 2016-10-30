package com.example.huixing.service1;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

import static android.content.ContentValues.TAG;

public class SecondService extends Service {

    private int count = 0;
    private boolean flag = true;



    public  class Mybinder extends Binder{

        public int getCount(){


            return  count;
        }




    }




    @Override
    public void onCreate() {
        Log.i(TAG, "onCreate: ");
        super.onCreate();
    }


    @Override
    public IBinder onBind(Intent intent) {

        Log.i(TAG, "onBind: ");

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


        return new Mybinder();

    }

    @Override
    public boolean onUnbind(Intent intent) {

        Log.i(TAG, "onUnbind: ");

        flag = false;

        return super.onUnbind(intent);
    }

    @Override
    public void onDestroy() {



        Log.i(TAG, "onDestroy: ");

    }


}
