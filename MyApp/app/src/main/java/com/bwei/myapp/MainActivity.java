package com.bwei.myapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * Button
     */
    private Button mButton;
    /**  */
    private TextView mTextView;

    @SuppressLint("CommitPrefEdits")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        //我不是
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTextView.setText("我是同性恋");
            }
        });

    }

    private void initView() {
        mButton = findViewById(R.id.button);
        mTextView = (TextView) findViewById(R.id.textView);
    }
}