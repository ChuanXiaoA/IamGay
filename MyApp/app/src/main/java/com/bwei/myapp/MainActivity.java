package com.bwei.myapp;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    /**
     * Button
     */
    private Button mButton;

    @SuppressLint("CommitPrefEdits")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        SharedPreferences user = getSharedPreferences("user", MODE_PRIVATE);
        SharedPreferences.Editor edit = user.edit();
        edit.putString("", "");

    }

    private void initView() {
        mButton = findViewById(R.id.button);
    }
}