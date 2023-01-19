package com.example.multiscreenapp;

//import static com.example.multiscreenapp.MainActivity.EXTRA_NAME;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = findViewById(R.id.textView2);
        Intent intent = getIntent();
        String msg = intent.getStringExtra(MainActivity.EXTRA_NAME);
        textView.setText(msg);
    }
}