package com.example.huixing.brodcastrecevier;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by huixing on 2016/10/4.
 */




public class secondrecever extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {


        String  msg = intent.getStringExtra("name");

        Toast.makeText(context, "第2个接收器"+msg, Toast.LENGTH_SHORT).show();

    }
}
