package com.example.taller2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button fibonacciButton = findViewById(R.id.fibonacciButton);
        Button quadraticButton = findViewById(R.id.quadraticButton);
        Button sortButton = findViewById(R.id.sortButton);

        fibonacciButton.setOnClickListener(v -> {
            Intent intent = new Intent(SecondActivity.this, FibonacciActivity.class);
            startActivity(intent);
        });

        quadraticButton.setOnClickListener(v -> {
            Intent intent = new Intent(SecondActivity.this, QuadraticEquationActivity.class);
            startActivity(intent);
        });

        sortButton.setOnClickListener(v -> {
            Intent intent = new Intent(SecondActivity.this, SortDataActivity.class);
            startActivity(intent);
        });
    }
}