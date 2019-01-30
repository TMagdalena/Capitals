package com.example.android.capitals2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class EuropeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.capital_list);

        ArrayList<Capital> capitals = new ArrayList<Capital>();

        capitals.add(new Capital("Zagreb", "Croatia"));
        capitals.add(new Capital("Budapest", "Hungary"));
        capitals.add(new Capital("Paris", "France"));
        capitals.add(new Capital("Helsinki", "Finland"));
        capitals.add(new Capital("Riga", "Latvia"));
        capitals.add(new Capital("Bratislava", "Slovakia"));
        capitals.add(new Capital("Podgorica", "Montenegro"));
        capitals.add(new Capital("Valletta", "Malta"));
        capitals.add(new Capital("Pristina", "Kosovo"));
        capitals.add(new Capital("Bern", "Switzerland"));


        CapitalAdapter cAdapter = new CapitalAdapter(this,capitals);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(cAdapter);

    }
}
