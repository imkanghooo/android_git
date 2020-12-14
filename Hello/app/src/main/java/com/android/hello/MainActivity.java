package com.android.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { //메인 시작.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}