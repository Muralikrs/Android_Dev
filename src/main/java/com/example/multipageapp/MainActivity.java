package com.example.multipageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private  EditText name;
    public static final String EXTRA_NAME="com.example.multipageapp.extra.NAME";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click(View v)
    {
        Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show();
        Intent i=new Intent(this,MainActivity2.class);

        name=findViewById(R.id.editTextText);
        i.putExtra(EXTRA_NAME,name.getText().toString());
        startActivity(i);

    }
}