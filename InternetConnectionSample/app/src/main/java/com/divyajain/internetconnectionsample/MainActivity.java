package com.divyajain.internetconnectionsample;

import android.app.Activity;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button isConnected;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        isConnected = (Button)findViewById(R.id.isConnected);

        isConnected.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                if(isConnected())
                {
                    isConnected.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                }
                else
                {
                    isConnected.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                }
            }
        });
    }

    private boolean isConnected() {

        ConnectivityManager connMgr = (ConnectivityManager) getSystemService(Activity.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected())
            return true;
        else
            return false;
    }
}
