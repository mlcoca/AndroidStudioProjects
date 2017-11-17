package com.example.broadcasttest2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Marius on 2017/11/2.
 */

public class AnotherBroadcastRecevier extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"receviered in AnotherBroadcastRacevier",Toast.LENGTH_SHORT).show();
    }
}
