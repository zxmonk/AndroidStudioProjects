package com.zxmonk.broadcasttest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Think on 2015/4/7.
 */
public class MyBroadcastReceiver  extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "received local MyBroadcastReceiver",
                Toast.LENGTH_SHORT).show();

    }
}
