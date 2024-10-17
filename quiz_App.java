package com.example.registration_form;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class quiz_App extends AppCompatActivity {
    RadioGroup rg1, rg2, rg3;
    RadioButton opt1_q1, opt2_q1, opt3_q1, opt4_q1, opt1_q2, opt2_q2, opt3_q2, opt4_q2, opt1_q3, opt2_q3, opt3_q3, opt4_q3;
    TextView q1, q2, q3;
    Button submit;
    TextView resultTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_quiz_app);


        rg1 = findViewById(R.id.rg1);
        rg2 = findViewById(R.id.rg2);
        rg3 = findViewById(R.id.rg3);


        opt1_q1 = findViewById(R.id.opt1_q1);
        opt2_q1 = findViewById(R.id.opt2_q1);
        opt3_q1 = findViewById(R.id.opt3_q1);
        opt4_q1 = findViewById(R.id.opt4_q1);


        opt1_q2 = findViewById(R.id.opt1_q2);
        opt2_q2 = findViewById(R.id.opt2_q2);
        opt3_q2 = findViewById(R.id.opt3_q2);
        opt4_q2 = findViewById(R.id.opt4_q2);


        opt1_q3 = findViewById(R.id.opt1_q3);
        opt2_q3 = findViewById(R.id.opt2_q3);
        opt3_q3 = findViewById(R.id.opt3_q3);
        opt4_q3 = findViewById(R.id.opt4_q3);


        q1 = findViewById(R.id.q1);
        q2 = findViewById(R.id.q2);
        q3 = findViewById(R.id.q3);
        resultTextView = findViewById(R.id.resultTextView);


        submit = findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get selected RadioButton IDs
                int selectedId1 = rg1.getCheckedRadioButtonId();
                int selectedId2 = rg2.getCheckedRadioButtonId();
                int selectedId3 = rg3.getCheckedRadioButtonId();


                RadioButton selectedRadioButton1 = findViewById(selectedId1);
                RadioButton selectedRadioButton2 = findViewById(selectedId2);
                RadioButton selectedRadioButton3 = findViewById(selectedId3);


                if (selectedRadioButton1 != null && selectedRadioButton2 != null && selectedRadioButton3 != null) {
                    String result = "Q1 Answer: " + selectedRadioButton1.getText().toString() + "\n" +
                            "Q2 Answer: " + selectedRadioButton2.getText().toString() + "\n" +
                            "Q3 Answer: " + selectedRadioButton3.getText().toString();
                    resultTextView.setText(result);
                    resultTextView.setVisibility(View.VISIBLE);


                    Intent intent = new Intent(quiz_App.this, ColorPicker.class);
                    startActivity(intent);
                } else {

                    resultTextView.setText("Please select answers for all questions.");
                    resultTextView.setVisibility(View.VISIBLE);
                }
            }
        });

    }

}
