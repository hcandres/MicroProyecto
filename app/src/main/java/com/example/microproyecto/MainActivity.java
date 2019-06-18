package com.example.microproyecto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categories);

        listCategories();
    }

    public void listCategories() {
        final ListView Lista = (ListView) findViewById(R.id.listViewCategories);
        String[] list = {"Calculo", "Fisica", "Trigonometria", "Fisica", "Trigonometria", "Fisica", "Trigonometria", "Fisica", "Trigonometria", "Fisica", "Trigonometria"};


        ArrayAdapter<String> adapter;

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, list);
        Lista.setAdapter(adapter);

        Lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int item = position;

                String itemVal = (String)Lista.getItemAtPosition(position);
                switch (itemVal){
                    case "Calculo":
                        Toast.makeText(MainActivity.this, "INGRESÓ A CALCULO", Toast.LENGTH_SHORT).show();
                        Intent myIntent = new Intent(view.getContext(),Calculation.class);
                        startActivity(myIntent);
                        break;

                }
            }
        });

    }

}

