package com.example.huixing.brodcastrecevier;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by huixing on 2016/10/4.
 */



public class FirstReciver extends BroadcastReceiver {



    @Override
    //第一部，定义广播
    //接收到广播与接收器相关的广播的时候被回调
    public void onReceive(Context context, Intent intent) {

        //处理业务代码,必须在十秒钟之内完成的代码，广播接收器的生命周期很短，主线程不能阻塞时间过长
        //如果十秒钟没有完成 anr异常
       //启动activity，service
        //发送通知，弹出对话框（电量低）等等

        String  msg = intent.getStringExtra("name");

        Toast.makeText(context, "第一个接收器"+msg, Toast.LENGTH_SHORT).show();


    }
}
