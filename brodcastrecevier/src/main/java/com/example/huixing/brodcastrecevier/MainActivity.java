package com.example.huixing.brodcastrecevier;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    secondrecever secondrecever1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //动态注册广播接收器
        secondrecever1 = new secondrecever();
        IntentFilter filter = new IntentFilter();
        filter.setPriority(1);
        filter.addAction("com.huixing.first");
        registerReceiver(secondrecever1,filter);

    }

    public  void mysend(View view){


        //要启动的广播接收器
//        Intent intent = new Intent(this,FirstReciver.class);

        Intent intent = new Intent();
        intent.setAction("com.huixing.first");
        intent.putExtra("name","lisi");

        sendBroadcast(intent);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //取消接收器
        unregisterReceiver(secondrecever1);

    }
}
