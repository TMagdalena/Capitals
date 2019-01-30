package com.example.android.capitals2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class AntarcticActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.capital_list);

        ArrayList<Capital> capitals = new ArrayList<Capital>();

        capitals.add(new Capital("None", "Antarctic"));


        CapitalAdapter cAdapter = new CapitalAdapter(this,capitals);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(cAdapter);

    }
}
