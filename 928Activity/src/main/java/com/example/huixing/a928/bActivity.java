package com.example.huixing.a928;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;

import static android.content.ContentValues.TAG;

public class bActivity extends Activity {

    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        Log.i(TAG, "onCreate: b");
        mediaPlayer = MediaPlayer.create(this,R.raw.lucky);

    }
    @Override
    protected void onStart() {

        Log.i(TAG, "onStart: b");

        super.onStart();
    }

    @Override
    protected void onResume() {

        Log.i(TAG, "onResume: b");

        mediaPlayer.start();

        super.onResume();
    }

    @Override
    protected void onPause() {

        Log.i(TAG, "onPause: b");
        super.onPause();
        if (mediaPlayer!=null){
            mediaPlayer.pause();
        }
    }

    @Override
    protected void onStop() {
        Log.i(TAG, "onStop: b");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.i(TAG, "onDestroy: b");
        super.onDestroy();
        if (mediaPlayer!=null){
            mediaPlayer.release();
            mediaPlayer=null;
        }
    }
}
