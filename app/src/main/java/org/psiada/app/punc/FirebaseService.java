package org.psiada.app.punc;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;

public class FirebaseService extends FirebaseMessagingService {
    public FirebaseService() {
    }

    private static final String TAG = "Firebase";


    @Override
    public void onNewToken(String token) {
        Log.d(TAG, "Refreshed token: " + token);

    }

}
