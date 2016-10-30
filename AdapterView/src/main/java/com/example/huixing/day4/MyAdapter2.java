package com.example.huixing.day4;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by huixing on 2016/9/21.
 */

public class MyAdapter2 extends BaseAdapter{


    private List<Object> list;
    private Context context;

    public  MyAdapter2(Context context,List<Object> list){

        this.list = list;
        this.context = context;

    }


    @Override
    //返回有几个列表项
    public int getCount() {
        return list.size();
    }


    @Override
    //返回每一行要显示的数据,可以不管
    public Object getItem(int position) {

        return list.get(position);
    }


    @Override
    //返回当前的条目数， 可以不管
    public long getItemId(int position) {
        return position;
    }


    @Override
    //返回每一个item的布局，整个条目的所有信息，也就是一个view对像
    public View getView(int position, View convertView, ViewGroup parent) {


//        Log.i("MYADAPTER", "getView: ");

        //1.
        //2.生成一个view对象，作为每个item的视图使用
        //3.
//        View view = View.inflate(context,R.layout.base_item,null);
//
//        TextView textView = (TextView) view.findViewById(R.id.tv_3);
//
//        textView.setText(list.get(position)+"");


        User user = (User) getItem(position);

////        return view;
//        ViewHolder2 vh;
//        //listview中item的复用,类似于iOS 开发中的 tableviewcell
//        if (convertView == null)
//        {
//            Log.i("TAG","getview方法被调用"+position);
//            convertView = View.inflate(context,R.layout.base_item,null);
//            vh = new ViewHolder2();
//            vh.iv_head = (ImageView) convertView.findViewById(R.id.iv_head);
//            vh.tv = (TextView)convertView.findViewById(R.id.tv_3);
//            vh.tv_desc = (TextView) convertView.findViewById(R.id.tv_desc);
//
//
//            convertView.setTag(vh);
//        }else {
//
//            vh = (ViewHolder2) convertView.getTag();
//            Log.i("TAG","getview复用"+position);
//
//        }
//
//        vh.iv_head.setImageResource(user.getHead());
//        vh.tv.setText(user.getName());
//        vh.tv_desc.setText(user.getDesc());
        View view;

        if (convertView == null){

            view = View.inflate(context,R.layout.base_item,null);
            View head = convertView.findViewById(R.id.iv_head);

        }else{
            view = convertView;
            View head = convertView.findViewById(R.id.iv_head);

        }







        return  convertView;
    }
    class ViewHolder2{


        ImageView iv_head;
        TextView tv;
        TextView tv_desc;


    }


}




