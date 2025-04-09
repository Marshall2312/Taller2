package com.example.taller2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class FibonacciActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fibonacci);

        EditText numberInput = findViewById(R.id.numberInput);
        Button executeButton = findViewById(R.id.executeButton);
        TextView resultText = findViewById(R.id.resultText);

        executeButton.setOnClickListener(v -> {
            int n = Integer.parseInt(numberInput.getText().toString());
            StringBuilder result = new StringBuilder();
            int a = 0, b = 1;
            for (int i = 0; i < n; i++) {
                result.append(a).append(" ");
                int next = a + b;
                a = b;
                b = next;
            }
            resultText.setText(result.toString());
        });
    }
}