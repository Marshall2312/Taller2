package com.example.taller2;

import android.os.Bundle;
import android .view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class QuadraticEquationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quadratic_equation);

        EditText aInput = findViewById(R.id.aInput);
        EditText bInput = findViewById(R.id.bInput);
        EditText cInput = findViewById(R.id.cInput);
        Button calculateButton = findViewById(R.id.calculateButton);
        TextView resultText2 = findViewById(R.id.resultText2);

        calculateButton.setOnClickListener(v -> {
            double a = Double.parseDouble(aInput.getText().toString());
            double b = Double.parseDouble(bInput.getText().toString());
            double c = Double.parseDouble(cInput.getText().toString());
            double discriminant = b * b - 4 * a * c;

            if (discriminant > 0) {
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                resultText2.setText(String.format("Raíces: %.3f, %.3f", root1, root2));
            } else if (discriminant == 0) {
                double root = -b / (2 * a);
                resultText2.setText(String.format("Raíz: %.3f", root));
            } else {
                double realPart = -b / (2 * a);
                double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
                resultText2.setText(String.format("Raíces complejas: %.3f ± %.3fi", realPart, imaginaryPart));
            }
        });
    }
}