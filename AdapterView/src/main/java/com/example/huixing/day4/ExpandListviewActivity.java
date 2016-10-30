package com.example.huixing.day4;

import android.database.DataSetObserver;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ExpandListviewActivity extends AppCompatActivity {

    private String [] armTypes = {"呆族","葵族","风间族"};
    private String[][] arms =  {{"狂战士","龙骑士","黑暗圣堂"},
            {"小狗","飞龙","自爆妃子"},{"步兵","伞兵","护士mm"}};
    private int[] images = new int[] {R.drawable.e1,R.drawable.e2,R.drawable.e3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expand_listview);


        ExpandableListAdapter adapter = new ExpandableListAdapter() {



            @Override
            public void registerDataSetObserver(DataSetObserver observer) {

            }

            @Override
            public void unregisterDataSetObserver(DataSetObserver observer) {

            }

            @Override
            public int getGroupCount() {
                return armTypes.length;
            }

            @Override
            public int getChildrenCount(int groupPosition) {

                return arms[groupPosition].length;
            }

            @Override
            public Object getGroup(int groupPosition) {
                return armTypes[groupPosition];
            }

            @Override
            public Object getChild(int groupPosition, int childPosition) {
                return arms[groupPosition][childPosition];
            }

            @Override
            public long getGroupId(int groupPosition) {
                return groupPosition;
            }

            @Override
            public long getChildId(int groupPosition, int childPosition) {
                return groupPosition;
            }

            @Override
            public boolean hasStableIds() {

                return true;
            }

            @Override
            public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
                TextView textView = getTextView();//调用定义的getTextView()方法
                textView.setText(getGroup(groupPosition).toString());//添加数据
                return textView;
            }

            @Override
            public View getChildView(int groupPosition, int childPosition,
                                     boolean isLastChild, View convertView, ViewGroup parent) {

                LinearLayout ll = new LinearLayout(ExpandListviewActivity.this);
                ll.setOrientation(LinearLayout.VERTICAL);
                ImageView logo = new ImageView(ExpandListviewActivity.this);
                logo.setImageResource(images[groupPosition]);
                ll.addView(logo);

                TextView textView = getTextView();
                textView.setText(getChild(groupPosition,childPosition).toString());//添加数据
                ll.addView(textView);
                return ll;


            }
            private TextView getTextView(){
                AbsListView.LayoutParams lp = new AbsListView.LayoutParams
                        (ViewGroup.LayoutParams.MATCH_PARENT,50);
                TextView textView = new TextView(ExpandListviewActivity.this);
                textView.setLayoutParams(lp);
                textView.setPadding(36, 0, 0, 0);
                textView.setTextSize(20);
                textView.setGravity(1);

                return textView;
            }

            @Override
            public boolean isChildSelectable(int groupPosition, int childPosition) {
                return true;
            }

            @Override
            public boolean areAllItemsEnabled() {
                return false;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public void onGroupExpanded(int groupPosition) {

            }

            @Override
            public void onGroupCollapsed(int groupPosition) {

            }

            @Override
            public long getCombinedChildId(long groupId, long childId) {
                return 0;
            }

            @Override
            public long getCombinedGroupId(long groupId) {
                return 0;
            }
        };

        ExpandableListView listView = (ExpandableListView) findViewById(R.id.lv_expand);
        listView.setAdapter(adapter);

    }
}
