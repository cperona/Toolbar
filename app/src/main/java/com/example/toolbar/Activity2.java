package com.example.toolbar;

import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        String text = getIntent().getStringExtra("text");

        TextView textView = findViewById(R.id.textView);
        textView.setText(text);
    }
}