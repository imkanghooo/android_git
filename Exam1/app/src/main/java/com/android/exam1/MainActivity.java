package com.android.exam1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button add = findViewById(R.id.add);
        Button sub = findViewById(R.id.sub);
        Button mul = findViewById(R.id.mul);
        Button div = findViewById(R.id.div);

        EditText first = findViewById(R.id.first);
        EditText second = findViewById(R.id.second);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int First = Integer.parseInt(first.getText().toString());
                int Second = Integer.parseInt(second.getText().toString());
                String tot = Integer.toString((First+Second));

                Toast.makeText(MainActivity.this,tot,Toast.LENGTH_SHORT).show();
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int First = Integer.parseInt(first.getText().toString());
                int Second = Integer.parseInt(second.getText().toString());
                String tot = Integer.toString((First-Second));

                Toast.makeText(MainActivity.this,tot,Toast.LENGTH_SHORT).show();
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int First = Integer.parseInt(first.getText().toString());
                int Second = Integer.parseInt(second.getText().toString());
                String tot = Integer.toString((First*Second));

                Toast.makeText(MainActivity.this,tot,Toast.LENGTH_SHORT).show();
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double First = Double.parseDouble(first.getText().toString());
                double Second = Double.parseDouble(second.getText().toString());
                String tot = Double.toString((First/Second));

                Toast.makeText(MainActivity.this,tot,Toast.LENGTH_SHORT).show();
            }
        });

    }
}