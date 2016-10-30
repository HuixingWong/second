package com.example.huixing.day4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;

public class SpinerActivity extends AppCompatActivity {


    private Spinner sp_shengfen,sp_chengshi,sp_qu;

    private AutoCompleteTextView ac;
//    private Spinner spinner;


    private String[] name  = {"abc","asx","wss","awd","asa"};

//
    private String[] shengfen  = new String[]{"山西","河南","江苏"};

    private String[][] city = {{"太原","大同"},{"郑州","平顶山"},{"南京","苏州"}};

    private  String[][][] qu = {
            {{"迎泽区","晋中"},{"城区","矿区"}},
            {{"高新区","金水区"},{"新华区","山区"}},
            {{"玄武区","中山区"},{"昆山","花桥"}}
    };

    private int shengfen_position;

    private ArrayAdapter<String> shengfen_adapter;
    private ArrayAdapter<String> chengshi_adapter;
    private ArrayAdapter<String> qu_adapter;
    private  ArrayAdapter<String > adapter_auto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spiner);

        sp_shengfen = (Spinner) findViewById(R.id.sp_shengfen);
        sp_chengshi = (Spinner) findViewById(R.id.sp_chengshi);
        sp_qu = (Spinner) findViewById(R.id.sp_qu);



        shengfen_adapter = new ArrayAdapter<String>
                (this,android.R.layout.simple_list_item_1,shengfen);


        chengshi_adapter = new ArrayAdapter<String>
                (this,android.R.layout.simple_list_item_1,city[0]);

        qu_adapter = new ArrayAdapter<String>
                (this,android.R.layout.simple_list_item_1,qu[0][0]);


        sp_shengfen.setAdapter(shengfen_adapter);
        sp_chengshi.setAdapter(chengshi_adapter);
        sp_qu.setAdapter(qu_adapter);


        sp_shengfen.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent,
                                       View view, int position, long id) {

                chengshi_adapter = new ArrayAdapter<String>
                        (SpinerActivity.this,
                                android.R.layout.simple_list_item_1,city[position]);

                shengfen_position = position;
                sp_chengshi.setAdapter(chengshi_adapter);


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {


            }
        });

        sp_chengshi.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
               qu_adapter = new ArrayAdapter<String>
                        (SpinerActivity.this,android.R.layout.simple_list_item_1,
                                qu[shengfen_position][position]);

                sp_qu.setAdapter(qu_adapter);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });




//        spinner = (Spinner) findViewById(R.id.spiner);
//
//
//        ArrayAdapter<String > arrayAdapter =
//                new ArrayAdapter<String>
//                        (this,android.R.layout.simple_list_item_1,shengfen);
//        spinner.setAdapter(arrayAdapter);
//
//        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//
//                Toast.makeText(SpinerActivity.this, shengfen[position], Toast.LENGTH_SHORT).show();
//
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//
//                Toast.makeText(SpinerActivity.this, "未选中", Toast.LENGTH_SHORT).show();
//
//            }
//        });








        ac = (AutoCompleteTextView) findViewById(R.id.ac);


        adapter_auto = new ArrayAdapter<String>
                (this,android.R.layout.simple_list_item_1,name);

        ac.setAdapter(adapter_auto);

    }
}
