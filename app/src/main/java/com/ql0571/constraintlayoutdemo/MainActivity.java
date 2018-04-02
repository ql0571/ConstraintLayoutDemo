package com.ql0571.constraintlayoutdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onDemoClick(View v) {
        startActivity(new Intent(this, DemoActivity.class));
    }

    public void onConstraintClick(View v) {
        startActivity(new Intent(this, ConstraintActivity.class));
    }
}
