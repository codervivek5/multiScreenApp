package com.example.multiscreenapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText name;
    public  static final String EXTRA_NAME = "check.name.codervivek";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public  void openActivity(View v){
        Toast.makeText(this, "opening 2nd activity", Toast.LENGTH_SHORT).show();

        Intent intent =  new Intent(this, MainActivity2.class);

        name  = findViewById(R.id.editTextTextPersonName);
        String strName =  name.getText().toString();
        intent.putExtra(EXTRA_NAME,strName);

        startActivity(intent);
    }


}