package com.example.huixing.ll;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class AlertDialogActivity extends AppCompatActivity {

    private Button btn_alert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog);


        btn_alert = (Button) findViewById(R.id.btn_alert);
        btn_alert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder ab1 = new AlertDialog.Builder(AlertDialogActivity.this);
                ab1.setTitle("颜色设置");
                ab1.setMessage("请选择背景颜色");
                ab1.setIcon(R.mipmap.ic_launcher);
                ab1.setItems(new String[]{"红","黄","蓝","绿"},null);

                ab1.show();
            }
        });


    }
}
