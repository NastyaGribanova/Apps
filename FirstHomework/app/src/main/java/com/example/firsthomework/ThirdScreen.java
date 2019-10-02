package com.example.firsthomework;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;


public class ThirdScreen extends AppCompatActivity {

    private TextView email;
   // private TextView password;
    private TextView name;
    private TextView age;

    @RequiresApi
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        email =  findViewById(R.id.editText2);
      //  password =  findViewById(R.id.editText3);
        name =  findViewById(R.id.editText4);
        age =  findViewById(R.id.editText5);

        if (getIntent().getStringExtra("textLogin") != null) {
            email.setText(getIntent().getStringExtra("textLogin"));
        }
//        if (getIntent().getStringExtra("textPassword") != null) {
//            password.setText(getIntent().getStringExtra("textPassword"));
//        }
        if (getIntent().getStringExtra("textName") != null) {
            name.setText(getIntent().getStringExtra("textName"));
        }
        if (getIntent().getStringExtra("textAge") != null) {
            age.setText(getIntent().getStringExtra("textAge"));
        }
    }


}
