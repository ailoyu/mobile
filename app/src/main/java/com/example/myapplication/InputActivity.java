package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InputActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        EditText et_code = (EditText) findViewById(R.id.code);
        EditText et_name = (EditText) findViewById(R.id.name);
        EditText et_price = (EditText) findViewById(R.id.price);
        Button bt_save = (Button) findViewById(R.id.bt_save);
        Button bt_close = (Button) findViewById(R.id.bt_close);

        bt_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            
            }
        });

        bt_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }
}