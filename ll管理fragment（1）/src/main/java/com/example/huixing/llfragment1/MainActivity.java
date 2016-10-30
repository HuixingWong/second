package com.example.huixing.llfragment1;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    private void addFragment(Fragment fragment,String tag){

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transation = manager.beginTransaction();
        transation.add(R.id.fragment_container, fragment, tag);
        transation.addToBackStack(tag);
        transation.commit();


    }

    public void addfragment1(View view){

        fragment11 fragment11 = new fragment11();
        addFragment(fragment11,"fragment11");


    }
    public void addfragment2(View view){

        fragment22 fragment22 = new fragment22();
        addFragment(fragment22,"fragment22");


    }
    public void addfragment3(View view){
        fragment33 fragment33 = new fragment33();
        addFragment(fragment33,"fragment33");


    }
    public void addfragment4(View view){
        fragment44 fragment44 = new fragment44();
        addFragment(fragment44,"fragment44");


    }

    public  void popback(View view){

        FragmentManager manager = getSupportFragmentManager();
        manager.popBackStack();


    }

    public void back2(View view){

        FragmentManager manager = getSupportFragmentManager();
        manager.popBackStack("fragment22",0);


    }

    public  void back2sive(View view){


        FragmentManager manager = getSupportFragmentManager();
        manager.popBackStack("fragment22",FragmentManager.POP_BACK_STACK_INCLUSIVE);

    }

    public void hide3(View view){

        FragmentManager manager = getSupportFragmentManager();
        Fragment fragment33 = manager.findFragmentByTag("fragment33");
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.hide(fragment33);
//        transaction.addToBackStack("fragment33");
        transaction.commit();


    }
    public void show3(View view){

        FragmentManager manager = getSupportFragmentManager();
        Fragment fragment33 = manager.findFragmentByTag("fragment33");
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.show(fragment33);
//        transaction.addToBackStack("fragment33");
        transaction.commit();


    }


    public void detach3(View view){

        FragmentManager manager = getSupportFragmentManager();
        Fragment fragment = manager.findFragmentByTag("fragment33");

        FragmentTransaction transaction = manager.beginTransaction();
        transaction.detach(fragment);
        transaction.addToBackStack("detachfragment33");
        transaction.commit();
        if (fragment.isAdded()) {
            Toast.makeText(this, "fragment3 is added", Toast.LENGTH_SHORT).show();
        }


    }

    public void attach3(View view){


        FragmentManager manager = getSupportFragmentManager();
        Fragment fragment33 = manager.findFragmentByTag("fragment33");
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.attach(fragment33);
        transaction.addToBackStack("attachfragment33");
        transaction.commit();
        if (fragment33.isAdded()) {
            Toast.makeText(this, "fragment3 is added", Toast.LENGTH_SHORT).show();
        }


    }

    public  void call(View view){

        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_DIAL);

        intent.setData(Uri.parse("tel:10086"));
        startActivity(intent);



    }










    /**
     * Created by huixing on 2016/10/6.
     */

    public static class fragment22 extends Fragment{

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

            return inflater.inflate(R.layout.fragment2,container,false);

        }
    }

    /**
     * Created by huixing on 2016/10/6.
     */

    public static class fragment11 extends Fragment{

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

            return inflater.inflate(R.layout.fragment1,container,false);

        }
    }

    /**
     * Created by huixing on 2016/10/6.
     */

    public static class fragment33 extends Fragment{

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

            return inflater.inflate(R.layout.fragment3,container,false);

        }
    }

    /**
     * Created by huixing on 2016/10/6.
     */

    public static class fragment44 extends Fragment{

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

            return inflater.inflate(R.layout.fragment4,container,false);

        }
    }
}
