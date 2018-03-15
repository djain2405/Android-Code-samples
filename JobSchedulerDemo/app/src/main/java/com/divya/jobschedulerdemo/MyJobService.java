package com.divya.jobschedulerdemo;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.widget.Toast;

/**
 * Created by divya on 3/12/2018.
 */

public class MyJobService extends JobService {
    @Override
    public boolean onStartJob(JobParameters jobParameters) {

        System.out.println("OnStartJob called");
        Toast.makeText(getApplicationContext(), "Testing Job Scheduler", Toast.LENGTH_SHORT).show();
        return false;
    }

    @Override
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }
}
