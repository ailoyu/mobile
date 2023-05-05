package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.io.FileInputStream;
import java.io.IOException;

public class OutputActivity extends AppCompatActivity {
    String[] bookList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);

        ListView list = (ListView) findViewById(R.id.listview);
        Button bt_view = (Button) findViewById(R.id.bt_view);
        TextView tv_view = (TextView) findViewById(R.id.tv_view);

        bookList = fileList();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, bookList);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String data = "";
                int c;
                try{
                    FileInputStream fin = openFileInput(bookList[i]);
                    while((c = fin.read()) != -1)
                        data += Character.toString((char)c);
                    fin.close();
                    tv_view.setText(data);
                }catch(IOException ex){};
            }
        });
    }
}