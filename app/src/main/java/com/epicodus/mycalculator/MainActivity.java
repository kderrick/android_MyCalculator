package com.epicodus.mycalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText operand1;
    private EditText operand2;

    private Button buttonAddition;
    private Button buttonSubtraction;
    private Button buttonMultiplication;
    private Button buttonDivision;
    private Button buttonClear;

    private TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        operand1 = (EditText) findViewById(R.id.editOperand1);
        operand2 = (EditText) findViewById(R.id.editOperand2);
        buttonAddition = (Button) findViewById(R.id.buttonAddition);
        buttonSubtraction = (Button) findViewById(R.id.buttonSubtraction);
        buttonMultiplication = (Button) findViewById(R.id.buttonMultiplication);
        buttonDivision = (Button) findViewById(R.id.buttonDivision);
        textResult = (TextView) findViewById(R.id.textResult);
        buttonClear = (Button) findViewById(R.id.buttonClear);

        buttonAddition.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if((operand1.length() > 0) && (operand2.length()) > 0) {
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());
                    double theResult = oper1 + oper2;
                    textResult.setText(Double.toString(theResult));
                } else {
                    Toast.makeText(MainActivity.this, "Please enter numbers in both fields", Toast.LENGTH_LONG).show();
                }
            }
        });

        buttonSubtraction.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if ((operand1.length() > 0) && (operand2.length()) > 0) {
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());
                    double theResult = oper1 - oper2;
                    textResult.setText(Double.toString(theResult));
                } else {
                    Toast.makeText(MainActivity.this, "Please enter numbers in both fields", Toast.LENGTH_LONG).show();
                }
            }
        });

        buttonMultiplication.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if ((operand1.length() > 0) && (operand2.length()) > 0) {
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());
                    double theResult = oper1 * oper2;
                    textResult.setText(Double.toString(theResult));
                } else {
                    Toast.makeText(MainActivity.this, "Please enter numbers in both fields", Toast.LENGTH_LONG).show();
                }
            }

        });

        buttonDivision.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if ((operand1.length() > 0) && (operand2.length()) > 0) {
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());
                    double theResult = oper1 / oper2;
                    textResult.setText(Double.toString(theResult));
                } else {
                    Toast.makeText(MainActivity.this, "Please enter numbers in both fields", Toast.LENGTH_LONG).show();
                }
            }

        });

        buttonClear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                operand1.setText("");
                operand2.setText("");
                textResult.setText("0.00");
                operand1.requestFocus();
            }
        });


    }
}
