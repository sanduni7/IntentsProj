package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     public String myExtra = "text";
    Button button1;
    EditText num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 =findViewById(R.id.num1);
        num2 =findViewById(R.id.num2);
        button1 = (Button)findViewById(R.id.btnok);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void  onClick (View view) {
                String editnum1 = num1.getText().toString();
                String editnum2 = num2.getText().toString();

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("MAIN_EXTRA", myExtra);
                intent.putExtra("MAIN_EXTRA1", editnum1);
                intent.putExtra("MAIN_EXTRA2", editnum2);
                startActivity(intent);

                Toast.makeText(MainActivity.this,"Sending Message...",Toast.LENGTH_LONG).show();
            }
        });
    }
}


