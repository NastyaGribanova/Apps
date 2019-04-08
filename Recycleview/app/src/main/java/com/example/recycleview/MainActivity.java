package com.example.recycleview;

import android.os.Bundle;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.RecyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerView.Adapter adapter = new BooksAdapter(getMyList());
        recyclerView.setAdapter(adapter);
    }


    public ArrayList<String> getMyList() {
        ArrayList<String> a = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            a.add("Nasya");
        }

        return a;
    }
}
