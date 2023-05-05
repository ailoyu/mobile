package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.mnInput:{
                Intent intent1 = new Intent(MainActivity.this, InputActivity.class);
                startActivity(intent1);
                return true;
            }
            case R.id.mnOutput:{
                Intent intent2 = new Intent(MainActivity.this, OutputActivity.class);
                startActivity(intent2);
                return true;
            }
            default: return super.onOptionsItemSelected(item);
        }
    }
}