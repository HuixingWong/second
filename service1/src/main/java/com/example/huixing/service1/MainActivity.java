package com.example.huixing.service1;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import static android.content.ContentValues.TAG;

public class MainActivity extends AppCompatActivity {


    private SecondService.Mybinder mybinder;

    private ServiceConnection conn = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {

            Log.i(TAG, "onServiceConnected: ");

            mybinder = (SecondService.Mybinder) service;

        }

        @Override
        public void onServiceDisconnected(ComponentName name) {

            Log.i(TAG, "onServiceDisconnected: ");

        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void start(View view){

        Intent intent = new Intent(MainActivity.this,MyService.class);

        //这种方法启动的服务，服务的生命周期与调用者无任何关联，也不能进行数据传递。
        startService(intent);

    }


    public  void stop(View view){

        Intent intent = new Intent(MainActivity.this,MyService.class);

        stopService(intent);


    }

    public void  bind(View view){

        Intent intent = new Intent(MainActivity.this,SecondService.class);
        //第二个参数，第三个参数
        //绑定服务，2 ServiceConnection 对象 3
        //这种方法启动的service的声明周期就与调用者关联了
        bindService(intent,conn,BIND_AUTO_CREATE);


    }

    public  void unbind(View view){

        Intent intent = new Intent(MainActivity.this,MyService1.class);
        //解除绑定
        unbindService(conn);


    }



    public  void getcount(View view){

        Toast.makeText(this, " "+mybinder.getCount(), Toast.LENGTH_SHORT).show();

    }


    @Override
    protected void onDestroy() {

        unbindService(conn);
        super.onDestroy();
    }
}
