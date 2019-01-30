package com.example.android.capitals2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NorthAmericaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.capital_list);

        ArrayList<Capital> capitals = new ArrayList<Capital>();

        capitals.add(new Capital("Kingston", "Jamaica"));
        capitals.add(new Capital("Mexico City", "Mexico"));
        capitals.add(new Capital("Managua", "Nicaragua"));
        capitals.add(new Capital("Panama City", "Panama"));
        capitals.add(new Capital("Castries", "Saint Lucia"));
        capitals.add(new Capital("San Salvador", "El Salvador"));


        CapitalAdapter cAdapter = new CapitalAdapter(this,capitals);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(cAdapter);

    }
}
