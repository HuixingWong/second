package com.example.huixing.a928;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import static android.content.ContentValues.TAG;

public class MainActivity extends Activity {


    //音乐播放器
    private MediaPlayer midiaplayer;

    private int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "onCreate: MainActivity");
        if (savedInstanceState != null){

            Object data = savedInstanceState.get("data");
            Toast.makeText(this, data+
                    "", Toast.LENGTH_SHORT).show();


        }

        midiaplayer = MediaPlayer.create(this,R.raw.lucky);



    }

    @Override
    protected void onStart() {

        Log.i(TAG, "onStart: MainActivity");

        super.onStart();

    }

    @Override
    protected void onResume() {

        Log.i(TAG, "onResume: MainActivity");

        super.onResume();

        if (position != 0){
            midiaplayer.seekTo(position);
            midiaplayer.start();
        }else {
            midiaplayer.start();
        }
    }

    @Override
    protected void onPause() {

        Log.i(TAG, "onPause: MainActivity");
        super.onPause();
        if (midiaplayer.isPlaying()) {
            midiaplayer.pause();
            position = midiaplayer.getCurrentPosition();
        }
    }

    @Override
    protected void onStop() {
        Log.i(TAG, "onStop: MainActivity");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.i(TAG, "onDestroy: MainActivity");
        super.onDestroy();

        //销毁mediaplayer
        if (midiaplayer!=null){
            midiaplayer.release();
            midiaplayer = null;
        }

    }

    @Override
    //用来传递数据的方法
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG, "onSaveInstanceState: ");
        outState.putString("data","之前保存的数据");
    }


//    @Override
//    protected void onRestoreInstanceState(Bundle savedInstanceState) {
//
//        super.onRestoreInstanceState(savedInstanceState);
//    }


    public  void jump(View view){

        Intent intent = new Intent(MainActivity.this,bActivity.class);
        startActivity(intent);

    }
}
