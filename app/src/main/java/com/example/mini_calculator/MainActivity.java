package com.example.mini_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

//    variable
    private char operator;
    private double operan1;
    private double operan2;
    private double hasilHitung;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //    masing-masing komponen
        EditText input1 = findViewById(R.id.input1);
        EditText input2 = findViewById(R.id.input2);
        EditText textHasil = findViewById(R.id.hasil);

        Button btKali = findViewById(R.id.btKali);
        btKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator = 'x';
                operan1 = Double.parseDouble(input1.getText().toString());
                operan2 = Double.parseDouble(input2.getText().toString());
            }
        });

        Button btBagi = findViewById(R.id.btBagi);
        btBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator = '/';
                operan1 = Double.parseDouble(input1.getText().toString());
                operan2 = Double.parseDouble(input2.getText().toString());
            }
        });

        Button btTambah = findViewById(R.id.btTambah);
        btTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator = '+';
                operan1 = Double.parseDouble(input1.getText().toString());
                operan2 = Double.parseDouble(input2.getText().toString());
            }
        });

        Button btKurang = findViewById(R.id.btKurang);
        btKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator = '-';
                operan1 = Double.parseDouble(input1.getText().toString());
                operan2 = Double.parseDouble(input2.getText().toString());
            }
        });

        Button btHitung = findViewById(R.id.btHitung);
        btHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hasilHitung = prosesHitung(operator, operan1, operan2);
                textHasil.setText("" + hasilHitung);
            }
        });
    }

    private double prosesHitung(char operator, double operan1, double operan2) {
        switch (operator) {
            case 'x':
                return operan1 * operan2;
            case '/':
                return operan1 / operan2;
            case '+':
                return operan1 + operan2;
            case '-':
                return operan1 - operan2;
            default:
                return 0;
        }
    }
}