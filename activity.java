package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;
import android.app.Activity;
import android.widget.Toast;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Button b1, b2;
    EditText tv1, tv2;
    int attempt = 3;
    TextView e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.b1);
        tv1 = (EditText) findViewById(R.id.et1);
        tv2 = (EditText) findViewById(R.id.et2);
        e1 = (TextView) findViewById(R.id.e1);
        b2 = (Button) findViewById(R.id.b2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (tv1.getText().toString().equals("hello") && tv2.getText().equals("hello")) {
                    Toast.makeText(MainActivity.this, "RIGHT CREDENTIALS", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                } else {
                    Toast.makeText(MainActivity.this, "WRONG CREDENTIALS", Toast.LENGTH_SHORT).show();
                    e1.setVisibility(View.VISIBLE);
                    e1.setBackgroundColor(Color.YELLOW);
                    attempt--;
                    if (attempt == 0) {
                        b1.setEnabled(false);
                    }
                }
            }

            ;

        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
