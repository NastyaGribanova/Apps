package com.example.firsthomework;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;


public class ThirdScreen extends AppCompatActivity {

    private View emailView;
    private View passwordView;

    @RequiresApi
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        emailView = (EditText) findViewById(R.id.editText2);
        passwordView = (EditText) findViewById(R.id.editText3);

        Intent intent = getIntent();
        String email = intent.getStringExtra(email);

    }


}
