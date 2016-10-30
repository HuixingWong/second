package com.example.huixing.day4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener{

    private Button btn_taobao;
    private Button btn_auto;
    private Button btn_list;
    private Button btn_arrayadapter;
    private Button btn_simpleadapter;
    private Button btn_baseadapter;
    private Button btn_base2;
    private Button btn_gallary;
    private  Button btn_base3;
    private Button btn_grid;
    private Button btn_expand;
    private Button btn_spiner;
    private Button btn_itemDetail;
    private Button btn_gallary2;
    private Button btn_fliper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_taobao = (Button) findViewById(R.id.btn_taobao);
        btn_taobao.setOnClickListener(this);
        btn_auto = (Button) findViewById(R.id.btn_auto);
        btn_auto.setOnClickListener(this);
        btn_list = (Button) findViewById(R.id.btn_list);
        btn_list.setOnClickListener(this);
        btn_arrayadapter = (Button) findViewById(R.id.btn_arrayadapter);
        btn_arrayadapter.setOnClickListener(this);
        btn_simpleadapter = (Button) findViewById(R.id.btn_simpleadapter);
        btn_simpleadapter.setOnClickListener(this);

        btn_baseadapter = (Button) findViewById(R.id.btn_baseadapter);
        btn_baseadapter.setOnClickListener(this);

        btn_base2 = (Button) findViewById(R.id.btn_base2);
        btn_base2.setOnClickListener(this);

        btn_gallary = (Button) findViewById(R.id.btn_gallary);
        btn_gallary.setOnClickListener(this);

        btn_base3 = (Button) findViewById(R.id.btn_base3);
        btn_base3.setOnClickListener(this);

        btn_grid = (Button) findViewById(R.id.btn_grid);
        btn_grid.setOnClickListener(this);

        btn_expand = (Button) findViewById(R.id.btn_expand);
        btn_expand.setOnClickListener(this);

        btn_spiner = (Button) findViewById(R.id.btn_spiner);
        btn_spiner.setOnClickListener(this);

        btn_itemDetail = (Button) findViewById(R.id.btn_itemdetail);
        btn_itemDetail.setOnClickListener(this);

        btn_gallary2 = (Button) findViewById(R.id.btn_gallary2);
        btn_gallary2.setOnClickListener(this);

        btn_fliper = (Button) findViewById(R.id.btn_fliper);
        btn_fliper.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_taobao:
                Intent intent = new Intent
                        (MainActivity.this,Main2Activity.class);
                startActivity(intent);
                break;
            case R.id.btn_auto:
                Intent intent1 = new Intent
                        (MainActivity.this,AutoActivity.class);
                startActivity(intent1);
                break;
            case R.id.btn_list:
                Intent intent2 = new Intent
                        (MainActivity.this,ListViewActivity.class);
                startActivity(intent2);
                break;
            case R.id.btn_arrayadapter:
                Intent intent3 = new Intent
                        (MainActivity.this,ArrayAdapterActivity.class);
                startActivity(intent3);
                break;
            case R.id.btn_simpleadapter:
                Intent intent4 = new Intent
                        (MainActivity.this,SimpleAdapterActivity.class);
                startActivity(intent4);
                break;

            case R.id.btn_baseadapter:
                Intent intent5 = new Intent
                        (MainActivity.this,BaseAdapterActivity.class);
                startActivity(intent5);
                break;

            case R.id.btn_base2:
                Intent intent6 = new Intent
                        (MainActivity.this,baseAdapterActivity2.class);
                startActivity(intent6);
                break;

            case R.id.btn_gallary:
                Intent intent7 = new Intent
                        (MainActivity.this,GallryActivity.class);
                startActivity(intent7);
                break;

            case R.id.btn_base3:
                Intent intent8 = new Intent
                        (MainActivity.this,BaseAdapterActivity3.class);
                startActivity(intent8);
                break;

            case R.id.btn_grid:
                Intent intent9 = new Intent
                        (MainActivity.this,Gridactivity.class);
                startActivity(intent9);
                break;

            case R.id.btn_expand:
                Intent intent10 = new Intent
                        (MainActivity.this,ExpandListviewActivity.class);
                startActivity(intent10);
                break;

            case R.id.btn_spiner:
                Intent intent11 = new Intent
                        (MainActivity.this,SpinerActivity.class);
                startActivity(intent11);
                break;
            case R.id.btn_itemdetail:
                Intent intent12 = new Intent
                        (MainActivity.this,ItemListActivity.class);
                startActivity(intent12);
                break;

            case R.id.btn_gallary2:
                Intent intent13 = new Intent
                        (MainActivity.this,ViewSwitcherActivity.class);
                startActivity(intent13);
                break;

            case R.id.btn_fliper:
                Intent intent14 = new Intent
                        (MainActivity.this,AdapterViewFliperActivity.class);
                startActivity(intent14);
                break;








        }
    }
}
