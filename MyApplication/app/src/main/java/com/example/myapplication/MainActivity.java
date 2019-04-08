package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button click = findViewById(R.id.btn_click);
        text = findViewById(R.id.textView);
    }

    public void onClickClicked(View view){
        String loginText = text.getText().toString();
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("Login", loginText);
        startActivity(intent);
    }
}
