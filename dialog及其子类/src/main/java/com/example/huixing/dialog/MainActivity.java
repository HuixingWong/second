package com.example.huixing.dialog;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if (keyCode == event.KEYCODE_BACK){

            AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);

            alert.setIcon(R.mipmap.ic_launcher);
            alert.setTitle("对话框");
            alert.setMessage("这是个对话框,是否确认退出");

            alert.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    MainActivity.this.finish();
                }
            });

            alert.setCancelable(false);

            alert.setNegativeButton("取消", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    dialog.dismiss();

                }
            });

            alert.create().show();


        }

        return super.onKeyDown(keyCode, event);
    }

    public void btn1(View view){

        AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);

        alert.setIcon(R.mipmap.ic_launcher);
        alert.setTitle("对话框");
        alert.setMessage("这是个对话框,是否确认退出");

        alert.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                MainActivity.this.finish();
            }
        });

        alert.setCancelable(false);

        alert.setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                dialog.dismiss();

            }
        });

        alert.create().show();



    }

    public  void btn2(View view){

        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setIcon(R.mipmap.ic_launcher);
        builder.setTitle("选择性别");

        builder.setSingleChoiceItems(new String[]{"male", "female"}, 0,
                new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                switch (which){

                    case 0:
                        Toast.makeText(MainActivity.this, which+"", Toast.LENGTH_SHORT).show();
//                        dialog.dismiss();

                        break;
                    case 1:
                        Toast.makeText(MainActivity.this, which+"", Toast.LENGTH_SHORT).show();
//                        dialog.dismiss();
                        break;
                }

            }
        });

        builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.create().show();


    }


    /**
     * 自定义
     * @param view
     */
    public void btn3(View view){

        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

        //拿到布局文件
        View v = View.inflate(this,R.layout.myview,null);

        //将dialog做成自定义视图
        builder.setView(v);

        builder.create().show();


    }


    /**
     * 日期
     * @param view
     */


    public  void  btn4(View view){


    }

//    Calendar c = Calendar.getInstance();


    /**
     * 时间选择
     * @param view
     */
    public  void  btn5(View view){

        TimePickerDialog dialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {


            }
        },12,23,false);

        dialog.show();

    }

    /**
     * 进度条对话框
     * @param view
     */
    public void btn6(View view){

        ProgressDialog dialog = new ProgressDialog(this);
        dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        dialog.setMessage("正在加载");
        dialog.show();


    }



}
