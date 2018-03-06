package com.divya.notificationdemo;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.graphics.Color;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private String channelId = "Test Channel";
    private CharSequence channelName = "My Channel";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            createNotificationChannel();
    }

    void createNotificationChannel()
    {
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {

            NotificationChannel channel = new NotificationChannel(channelId, channelName, NotificationManager.IMPORTANCE_LOW);
            channel.setLightColor(Color.RED);
            NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
            manager.createNotificationChannel(channel);
        }

    }
    public void sendNotification(View v)
    {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, channelId);
        builder.setSmallIcon(R.drawable.notificicon);
        builder.setContentTitle("You have a notification");
        builder.setContentText("This is just for testing a basic notification");
        builder.setStyle(new NotificationCompat.BigTextStyle().bigText("This is just for testing a basic notification , also testing if it can be expanded to a big text area." +
                "Some of my achievements are:" +
                "* Google certified Associate Android Developer\n" +
                "* Ring-Message : Android App on Google play store, solved problem of remembering stuff when someone calls/you call someone.\n" +
                "* Let's Read Them All : Android app on Google play store, solved problem of creating a book playlist and keep a track of unread books, encourages to read more.\n" +
                "* Humane Eating Project : Android App to encourage and increase awareness about humane eating\n" +
                "* Roomathon : Android app , won second prize in DamondHacks women hackathon, solved problem of finding roommates when moving to a new city\n" +
                "* Written an android blog https://androidwithdivya.wordpress.com/ to help others with small android problems which I encountered and learnt while learning everyday.\n" +
                "* Mozilla Open Source project : Refactored GLES2 implementation for Linux platforms, used by Servo web browser to render graphics, solved Servo's web browser implementation to render graphics on Linux systems\n" +
                "* ATC Certified Android Application Developer"));

        NotificationManagerCompat manager = NotificationManagerCompat.from(this);
        manager.notify(1, builder.build());
    }
}
