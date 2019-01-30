package com.example.android.capitals2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class SouthAmericaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.capital_list);

        ArrayList<Capital> capitals = new ArrayList<Capital>();

        capitals.add(new Capital("Lima", "Peru"));
        capitals.add(new Capital("Montevideo", "Uruguay"));
        capitals.add(new Capital("Caracas", "Venezuela"));


        CapitalAdapter cAdapter = new CapitalAdapter(this,capitals);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(cAdapter);

    }
}
