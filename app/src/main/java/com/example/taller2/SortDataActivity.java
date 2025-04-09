package com.example.taller2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;

public class SortDataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sort_data);

        EditText dataInput = findViewById(R.id.dataInput);
        Button sortAscButton = findViewById(R.id.sortAscButton);
        Button sortDescButton = findViewById(R.id.sortDescButton);
        TextView resultText = findViewById(R.id.resultText);

        sortAscButton.setOnClickListener(v -> {
            String[] input = dataInput.getText().toString().split(",");
            int[] numbers = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
            Arrays.sort(numbers);
            resultText.setText(Arrays.toString(numbers));
        });

        sortDescButton.setOnClickListener(v -> {
            String[] input = dataInput.getText().toString().split(",");
            int[] numbers = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
            Arrays.sort(numbers);
            StringBuilder result = new StringBuilder();
            for (int i = numbers.length - 1; i >= 0; i--) {
                result.append(numbers[i]).append(" ");
            }
            resultText.setText(result.toString());
        });
    }
}