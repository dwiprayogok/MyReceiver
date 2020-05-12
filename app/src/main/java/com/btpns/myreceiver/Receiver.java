package com.btpns.myreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class Receiver extends BroadcastReceiver {
    String action ="";
    @Override
    public void onReceive(Context context, Intent intent) {
        action = intent.getAction();
        if (action.equals("com.btpns.android.dam.manual_sync")){
            Toast.makeText(context,"broadcast berhasil",Toast.LENGTH_LONG).show();
        }
    }
}
