package com.divyajain.fcmsampleapp;

import android.util.Log;

import com.google.firebase.*;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by Divya Jain on 2/5/2017.
 */

public class FCMTokenService extends FirebaseInstanceIdService {

    @Override
    public void onTokenRefresh() {
        // Get updated InstanceID token.
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.w("notification", refreshedToken);

    }
}
