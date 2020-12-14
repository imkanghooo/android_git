package com.android.addition;

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

        Button btn = findViewById(R.id.btn);
        EditText first = findViewById(R.id.first);
        EditText second = findViewById(R.id.second);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first1 = Integer.parseInt(first.getText().toString());
                int second2 = Integer.parseInt(second.getText().toString());
                int tot = first1 + second2;
                String tot1 = Integer.toString(tot);


                Toast.makeText(MainActivity.this,tot1,Toast.LENGTH_SHORT).show();

            }
        });

    }
}