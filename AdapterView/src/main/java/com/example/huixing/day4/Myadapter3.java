package com.example.huixing.day4;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by huixing on 2016/9/22.
 */

public class Myadapter3 extends BaseAdapter{

    private Context context;
    private List<bean> list;


    public Myadapter3(Context context, List<bean> list) {

        this.context = context;
        this.list = list;

    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        //创建一个bean对象来接收listview所在位置的内容
        bean bean1 = (bean) getItem(position);

        //创建一个viewholder类
        ViewHolder viewHolder;


        //如果convertview为空的话，就将一个布局文件转换成convertview
        //然后将viewholder存储在convertview里
        //settag中传入的object对象
        if (convertView == null){

            convertView = View.inflate(context,R.layout.base_item,null);

            viewHolder = new ViewHolder();

            viewHolder.icon_iv = (ImageView) convertView.findViewById(R.id.iv_head);
            viewHolder.name_tv = (TextView) convertView.findViewById(R.id.tv_3);
            viewHolder.desc_tv = (TextView) convertView.findViewById(R.id.tv_desc);

            convertView.setTag(viewHolder);

        }else {


            //convertview不为空的话，就直接从，convertview中取出viewholder
            viewHolder = (ViewHolder)convertView.getTag();

        }

        //设置viewholder的三个属性

        viewHolder.icon_iv.setImageResource(bean1.getIcon());
        viewHolder.name_tv.setText(bean1.getName());
        viewHolder.desc_tv.setText(bean1.getDesc());

        return convertView;
    }

    class ViewHolder{

        ImageView icon_iv;
        TextView name_tv;
        TextView desc_tv;

    }



}
