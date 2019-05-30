package com.example.microproyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class lista extends AppCompatActivity {
    private String[] list = {"argentina","brasil"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        ListView Lista;
        ArrayAdapter<String> adapter;
        Lista = (ListView) findViewById(R.id.listview);

        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,list);
        Lista.setAdapter(adapter);

    }
}
