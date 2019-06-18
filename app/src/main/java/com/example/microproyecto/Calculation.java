package com.example.microproyecto;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Calculation extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculation);

        listCategories();
    }

    public void listCategories() {
        final ListView Lista = (ListView) findViewById(R.id.listViewCalculation);
        String[] list = {"Calculo", "Fisica", "Trigonometria", "Fisica", "Trigonometria", "Fisica", "Trigonometria", "Fisica", "Trigonometria", "Fisica", "Trigonometria"};


        ArrayAdapter<String> adapter;

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, list);
        Lista.setAdapter(adapter);
    }
}
