package com.example.recycleview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BooksHolder extends RecyclerView.ViewHolder {

    private TextView text;

    public BooksHolder(@NonNull View itemView) {
        super(itemView);
        text = itemView.findViewById(R.id.textView);
    }
    public void bind(String name) {
        text.setText(name);
    }
}
