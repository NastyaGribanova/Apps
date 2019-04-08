package com.example.firsthomework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button.setOnClickListener(x -> onClick());
        textview = findViewById(R.id.textView1);
        textview.setOnClickListener(x -> onClick2());
    }

    public void onClick() {
        Intent intent = new Intent(this, ThirdScreen.class);
        startActivity(intent);
    }

    public void onClick2() {
        Intent intent = new Intent(this, SecondScreen.class);
        startActivity(intent);
    }
}
