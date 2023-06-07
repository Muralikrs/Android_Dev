package com.example.multipageapp;

import static com.example.multipageapp.MainActivity.EXTRA_NAME;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        view =findViewById(R.id.textView);
        Intent i=getIntent();

        view.setText("your text is : " + i.getStringExtra(EXTRA_NAME));
    }
}