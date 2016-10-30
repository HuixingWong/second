package com.example.huixing.day4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class AutoActivity extends AppCompatActivity {

    private AutoCompleteTextView auto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto);

        auto = (AutoCompleteTextView) findViewById(R.id.auto);
        //设置自动提示框的提示内容
        //一般通过arrayadaptrer来提供

        //arrayadapter的四个参数的意义
        //1.上下文对象
        //2.布局文件，此处使用安卓自带的你布局文件

        String data[] = {"alice","arome","dani","daivernon","Alice"};

        ArrayAdapter<String> adapter = new
                ArrayAdapter<String>
                (this,android.R.layout.simple_dropdown_item_1line,
                        data);
        auto.setAdapter(adapter);
    }
}
