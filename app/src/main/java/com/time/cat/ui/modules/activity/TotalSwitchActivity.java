package com.time.cat.ui.modules.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.time.cat.data.Constants;

public class TotalSwitchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sendBroadcast(new Intent(Constants.TOTAL_SWITCH_BROADCAST));
        finish();
        overridePendingTransition(0, 0);
        return;
    }
}
