package com.example.huixing.notifications;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.RemoteViews;

import static android.content.Context.NOTIFICATION_SERVICE;

public class MainActivity extends AppCompatActivity {

    private NotificationManager nm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //管理器对象一般在setcontentview上面创建
        //获取通知管理器对象
        //获取系统服务
        nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        setContentView(R.layout.activity_main);

    }

    public  void myview (View view){

        RemoteViews rv = new RemoteViews(getPackageName(),R.layout.layout1);

        Notification notification = new Notification.Builder(this).
                setContent(rv).
                build();
        nm.notify(10,notification);

    }


    //大视图
    public void mybig(View view){


        //设置大图票Bitmap图片对象,resource获取res文件下的所有资源。
        Bitmap b = BitmapFactory.
                decodeResource(getResources(),R.mipmap.ic_launcher);
//        builder.setLargeIcon(b);

        /**
         * 用连写的方法创建
         */
        Notification notification = new
                NotificationCompat.Builder(this).setSmallIcon(R.mipmap.ic_launcher).
                setAutoCancel(true).setContentInfo("messsage").setLargeIcon(b).
                setStyle(new NotificationCompat.InboxStyle().addLine("121313123131231232313").
                        addLine("121321313131312313").addLine("132121312321323123").
                        setBigContentTitle("text").setSummaryText("www.baidu.com")).
                setProgress(0,0,true).setLargeIcon(b).
                build();
        nm.notify(10,notification);


    }




    public void  mysend(View view){

        //发送通知，创建通知对象
        //2-1创建内部类对象
        Notification.Builder builder = new Notification.Builder(this);
        //2-2设置通知的属性
        //设置小图标
        builder.setSmallIcon(R.mipmap.ic_launcher);
        //设置标题
        builder.setContentTitle(" 新通知");
        //设置内容
        builder.setContentText("啦啦啦啦啦啦啦");
        //设置大图票Bitmap图片对象,resource获取res文件下的所有资源。
        Bitmap b = BitmapFactory.
                decodeResource(getResources(),R.mipmap.ic_launcher);
        builder.setLargeIcon(b);

        //设置通知消息
        builder.setContentInfo("短信");
        //设置时间毫秒
        builder.setWhen(System.currentTimeMillis());

        //设置点击通知以后启动的程序
        //pendingintent（延迟意图） 不是立刻执行的intent，需要满足某些条件之后才会执行
        //四个参数
        Intent intent = new Intent(this,Main2Activity.class);

        PendingIntent pi=PendingIntent.getActivity
                (this,0,intent,PendingIntent.FLAG_UPDATE_CURRENT);
        builder.setContentIntent(pi);
        //设置自动取消
        builder.setAutoCancel(true);

        //设置默认的响应
//        builder.setDefaults(Notification.DEFAULT_ALL);

        //设置自定义音效
        builder.setSound(Uri.parse("/storage/emulaed/0/Download/轨迹.mp3"));

        //设置进度条,最后一个参数，进度条是否不明确
        builder.setProgress(100,50,true);


        //2-3创建通知对象
        Notification notify = builder.build();
        //第三部：发送通知第一个参数，设置通知的id号
        //第二个参数，通知对象
        nm.notify(10,notify);



    }

    public void cancle(View view){

        //通过id号取消通知
        nm.cancel(10);

    }


    public void noti1(View view){

//        PendingIntent intent = new PendingIntent();

        Intent intent = new Intent(this,Main2Activity.class);

        //
        PendingIntent pi=PendingIntent.getActivity
                (this,1,intent,PendingIntent.FLAG_UPDATE_CURRENT);


        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.mipmap.ic_launcher);

        Notification.Builder builder = new Notification.Builder(this);
        builder.setSmallIcon(R.mipmap.ic_launcher);
        builder.setContentTitle("fism2018");
        builder.setContentText("the internationnal federation of magic sociaty");
        builder.setLargeIcon(bitmap);
        builder.setDefaults(Notification.DEFAULT_SOUND);
        builder.setContentIntent(pi);
        builder.setAutoCancel(true);
        Notification notification = builder.build();
        nm.notify(10,notification);


    }

    public void noti2(View view){

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);

        builder.setSmallIcon(R.mipmap.ic_launcher).setContentTitle("ContentTitle");

        NotificationCompat.InboxStyle inboxStyle = new
                NotificationCompat.InboxStyle();

        inboxStyle.setBigContentTitle("BigContentTitle").addLine("11111").
                addLine("2222222").addLine("3333333");

        builder.setStyle(inboxStyle);

        Notification notification = builder.build();

        nm.notify(10,notification);


    }





}







