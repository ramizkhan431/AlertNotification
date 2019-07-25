package com.example.alertnotification;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.tapadoo.alerter.Alerter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view) {
        Alerter.create(MainActivity.this)
       .setTitle("Alert Title")
                .setText("Alert text...")
                .setIcon(R.drawable.ic_warning_black_24dp)
                .setBackgroundColorRes(R.color.colorAccent)
                .enableSwipeToDismiss()
                .setDuration(3000)
                .show();
    }
}
