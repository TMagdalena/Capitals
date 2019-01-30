package com.example.android.capitals2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class AsiaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.capital_list);

        ArrayList<Capital> capitals = new ArrayList<Capital>();

        capitals.add(new Capital("Doha", "Qatar"));
        capitals.add(new Capital("Moscow", "Russia"));
        capitals.add(new Capital("Taipei", "Taiwan"));
        capitals.add(new Capital("Ankara", "Turkey"));
        capitals.add(new Capital("Tokyo", "Japan"));
        capitals.add(new Capital("Male", "Maldives"));
        capitals.add(new Capital("Ulaanbaatar", "Mongolia"));
        capitals.add(new Capital("Sana'a", "Yemen"));
        capitals.add(new Capital("Hanoi", "Vietnam"));
        capitals.add(new Capital("Dili", "Timor-Leste"));


        CapitalAdapter cAdapter = new CapitalAdapter(this,capitals);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(cAdapter);

    }
}
