package com.divya.jobschedulerdemo;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private int jobId = 0;
    private ComponentName myJobComponent;
    private JobScheduler scheduler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myJobComponent = new ComponentName(this, MyJobService.class);
    }

    public void scheduleJob(View view) {

        JobInfo.Builder builder = new JobInfo.Builder(jobId, myJobComponent);
        builder.setRequiredNetworkType(JobInfo.NETWORK_TYPE_ANY);
        builder.setPeriodic(60000);
        builder.setPersisted(true);

        scheduler = (JobScheduler) getSystemService(Context.JOB_SCHEDULER_SERVICE);
        scheduler.schedule(builder.build());


    }

    public void cancelJob(View view) {

        scheduler.cancel(jobId);
    }
}
