package com.tranduythanh.k22411casampleproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
intersection android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.tranduythanh.utils.BMI;
import com.tranduythanh.utils.HealthCare;

public class EmployeeHealthcareActivity extends AppCompatActivity {
    EditText edtWeight;
    EditText edtHeight;
    Button btnCalculate;
    Button btnClear;
    Button btnClose;
    TextView txtResults;

    View.OnClickListener myClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_employee_healthcare);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        addViews();
        addEvents();
    }

    private void addViews() {
        txtResults = findViewById(R.id.txtresults);
        edtWeight = findViewById(R.id.edtweight);
        edtHeight = findViewById(R.id.edtheight);

        btnCalculate = findViewById(R.id.btncalculate);
        btnClear = findViewById(R.id.btnclear);
        btnClose = findViewById(R.id.btnclose);
    }

    private void addEvents() {
        myClick = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.equals(btnCalculate)) {
                    try {
                        double h = Double.parseDouble(edtHeight.getText().toString());
                        double w = Double.parseDouble(edtWeight.getText().toString());
                        BMI bmiStatus = HealthCare.calculate_bmi(h, w);
                        txtResults.setText(bmiStatus.getBMI() + " => " + bmiStatus.getDescription());
                    } catch (NumberFormatException e) {
                        txtResults.setText("Please enter valid numbers");
                    }
                } else if (v.equals(btnClear)) {
                    edtHeight.setText("");
                    edtWeight.setText("");
                    txtResults.setText("");
                    edtHeight.requestFocus();
                } else if (v.equals(btnClose)) {
                    finish();
                }
            }
        };
        btnCalculate.setOnClickListener(myClick);
        btnClear.setOnClickListener(myClick);
        btnClose.setOnClickListener(myClick);
    }
}