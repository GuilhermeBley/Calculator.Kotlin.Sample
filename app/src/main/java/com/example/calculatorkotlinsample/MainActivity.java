package com.example.calculatorkotlinsample;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private String Display = "0";
    private double Number = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button[] buttonsNumbers = new Button[]{
          findViewById(R.id.btn0), findViewById(R.id.btn1), findViewById(R.id.btn2),
                findViewById(R.id.btn3),findViewById(R.id.btn4),findViewById(R.id.btn5),
                findViewById(R.id.btn6),findViewById(R.id.btn7),findViewById(R.id.btn8),
                findViewById(R.id.btn9),findViewById(R.id.btn0),
        };

        for (Button buttonNumber : buttonsNumbers) {
            buttonNumber.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    addToDisplayAndShow(buttonNumber.getText().toString());
                }
            });
        }

        findViewById(R.id.btnClear).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearAndView();
            }
        });

        Button[] operatorsButtons = new Button[] {
                findViewById(R.id.btnAdd),findViewById(R.id.btnDivide),
                findViewById(R.id.btnMultiply),findViewById(R.id.btnSubtract),
        };

        for (Button operatorButton : operatorsButtons) {
            operatorButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    addToDisplayAndShow(" " + operatorButton.getText() + " ");
                }
            });
        }
    }

    private void clearAndView(){
        Display = "";
        addToDisplayAndShow("0");
        Number = 0;
    }

    private void addToDisplayAndShow(String other){
        if (Display.equals("0")) {
            Display = other;
        }
        else {
            Display = Display + other;
        }

        TextView txtView = findViewById(R.id.display);
        txtView.setText(Display);
    }

    private void makeCalculationAndShow(){

    }

    private double getCalculationByText(String text){
        String[] operations = text.split( " ");
        double builder = 0;
        String nextOperator = "";

        for (String operation : operations) {
            switch (operation){
                case "+":
                    nextOperator = operation;
                    continue;
                case "-":
                    nextOperator = operation;
                    continue;
                case "/":
                    nextOperator = operation;
                    continue;
                case "*":
                    nextOperator = operation;
                    continue;
                default:
                    break;
            }
            double parsedNumber = ;
            switch (nextOperator){
                case "+":
                    builder +=
                    continue;
                case "-":
                    nextOperator = operation;
                    continue;
                case "/":
                    nextOperator = operation;
                    continue;
                case "*":
                    nextOperator = operation;
                    continue;
                default:
                    break;
            }
        }

        return builder;
    }
}
