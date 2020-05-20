package com.btpns.myreceiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
        Button btn_broadcast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_broadcast = findViewById(R.id.btn_broadcast);

        btn_broadcast.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent intent= new Intent();
        Bundle bundle =  new Bundle();
        bundle.putString("activityId", getString(R.string.activity_id));
        bundle.putString("prsId", getString(R.string.prs_id));
        bundle.putBoolean("isDataReady", true);
        intent.setAction("fin.prs.data.readiness");
        intent.putExtras(bundle);
        sendBroadcast(intent);
    }
}
