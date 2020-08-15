package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

 String takeExtra;
    private Button add,substract,multiply,divide;
    private EditText et1,et2,et3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent myIntent = new Intent();
        takeExtra =myIntent.getStringExtra("MAIN_EXTRA");



        add =(Button)findViewById(R.id.btnadd);
        substract =(Button)findViewById(R.id.btnsubstract);
        multiply =(Button)findViewById(R.id.btnmultiply);
        divide =(Button)findViewById(R.id.btndivide);
        et1 = (EditText)findViewById(R.id.et1);
        et2 = (EditText)findViewById(R.id.et2);
        et3 = (EditText)findViewById(R.id.et3);

        String editnum1= getIntent().getStringExtra("MAIN_EXTRA1");
        String editnum2= getIntent().getStringExtra("MAIN_EXTRA2");

        et1.setText(editnum1);
        et2.setText(editnum2);

        add.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       if (et1.getText().toString().equals("") || et2.getText().toString().equals("")) {

                                           Toast.makeText(SecondActivity.this, "Sending Message...", Toast.LENGTH_SHORT).show();
                                       } else {
                                           et1.getText().toString();
                                           et2.getText().toString();
                                           double a1 = Double.valueOf(et1.getText().toString());
                                           double a2 = Double.valueOf(et2.getText().toString());
                                           double a3;
                                           a3 = a1 + a2;
                                           et3.setText(String.valueOf(a3));
                                       }
                                   }
                               });
                substract.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (et1.getText().toString().equals("") || et2.getText().toString().equals("")) {

                            Toast.makeText(SecondActivity.this, "Sending Message...", Toast.LENGTH_SHORT).show();
                        } else {
                            et1.getText().toString();
                            et2.getText().toString();
                            int a1 = Integer.valueOf(et1.getText().toString());
                            int a2 = Integer.valueOf(et2.getText().toString());
                            int a3;
                            a3 = a1 - a2;
                            et3.setText(String.valueOf(a3));
                        }
                    }
                });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (et1.getText().toString().equals("") || et2.getText().toString().equals("")) {

                    Toast.makeText(SecondActivity.this, "Sending Message...", Toast.LENGTH_SHORT).show();
                } else {
                    et1.getText().toString();
                    et2.getText().toString();
                    double a1 = Double.valueOf(et1.getText().toString());
                    double a2 = Double.valueOf(et2.getText().toString());
                    double a3;
                    a3 = a1 * a2;
                    et3.setText(String.valueOf(a3));
                }
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (et1.getText().toString().equals("") || et2.getText().toString().equals("")) {

                    Toast.makeText(SecondActivity.this, "Sending Message...", Toast.LENGTH_SHORT).show();
                } else {
                    et1.getText().toString();
                    et2.getText().toString();
                    double a1 = Double.valueOf(et1.getText().toString());
                    double a2 = Double.valueOf(et2.getText().toString());
                    double a3;
                    a3 = a1 / a2;
                    et3.setText(String.valueOf(a3));
                }
            }
        });
            }
        }
