package com.example.huixing.ll;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView lv ;

    private String[] colors = {"红色","蓝色","黄色"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv= (ListView) findViewById(R.id.lv);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:



                        AlertDialog.Builder ab = new AlertDialog.Builder(MainActivity.this);
                        ab.setTitle("跳转");
                        ab.setMessage("确定要跳转吗？");
                        ab.setIcon(R.mipmap.ic_launcher);
                        //设置按钮
                        ab.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new
                                        Intent(MainActivity.this,AlertDialogActivity.class);
                                startActivity(intent);


                            }
                        });
                        ab.setNegativeButton("取消", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(MainActivity.this, "木有跳转", Toast.LENGTH_SHORT).show();
                            }
                        });

                        ab.setNeutralButton("么用",null);



                        AlertDialog dialog = ab.create();
                        dialog.show();


                        break;

                    case 1:

                        AlertDialog.Builder ab1 = new AlertDialog.Builder(MainActivity.this);
                        ab1.setTitle("颜色设置");
                        ab1.setMessage("请选择背景颜色");
                        ab1.setIcon(R.mipmap.ic_launcher);
                        ab1.setItems(new String[]{"红","黄","蓝","绿"}, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                        ab1.create();
                        ab1.show();
                        break;

                    case 2:
                        new AlertDialog.Builder(MainActivity.this).
                                setTitle("单选").setMessage("请选择颜色").
                                setSingleChoiceItems(colors, -1,
                                        new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {

                                    }
                                }).create().show();


//                        new AlertDialog.Builder(MainActivity.this).
//                                setTitle("设置颜色").setIcon(R.mipmap.ic_launcher).
//                                setMessage("请选择背景颜色").setItems(new
//                                String[]  {"红色","黄色","蓝色","绿色"},
//                                new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialog, int which) {
//
//                                switch (which){
//                                    case 0:
//
//                                        lv.setBackgroundColor(000000);
//                                        break;
//                                    case 1:
//
//                                        lv.setBackgroundColor(0xff0000);
//                                        break;
//                                    case 2:
//
//                                        lv.setBackgroundColor(0x00ff00);
//                                        break;
//                                    case 3:
//
//                                        lv.setBackgroundColor(0x0000ff);
//                                        break;
//
//                                }
//
//                            }
//                        }).setPositiveButton("确定",null).create().show();



                }
            }
        });



    }
}
