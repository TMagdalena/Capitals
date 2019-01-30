package com.example.android.capitals2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class AustraliaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.capital_list);

        ArrayList<Capital> capitals = new ArrayList<Capital>();

        capitals.add(new Capital("Canberra", "Australia"));
        capitals.add(new Capital("Suva", "Fiji"));
        capitals.add(new Capital("Tarawa", "Kiribati"));
        capitals.add(new Capital("Apia", "Samoa"));
        capitals.add(new Capital("Honiara", "Solomon Islands"));


        CapitalAdapter cAdapter = new CapitalAdapter(this,capitals);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(cAdapter);

    }
}
