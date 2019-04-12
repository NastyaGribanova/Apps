package com.example.firsthomework;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SecondScreen extends AppCompatActivity{

    Button button2;
    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(x -> onClick());
        textView1 = findViewById(R.id.editText2);
        textView2 = findViewById(R.id.editText4);
        textView3 = findViewById(R.id.editText3);
        textView4 = findViewById(R.id.editText5);
    }

    public void onClick() {
        Intent intent = new Intent(this, ThirdScreen.class);
        intent.putExtra("email", textView1.getText().toString());
        intent.putExtra("login", textView2.getText().toString());
        intent.putExtra("password", textView3.getText().toString());
        intent.putExtra("age", textView4.getText().toString());
        startActivity(intent);
    }
}
