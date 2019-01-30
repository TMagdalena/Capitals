package com.example.android.capitals2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class AfricaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.capital_list);

        ArrayList<Capital> capitals = new ArrayList<Capital>();

        capitals.add(new Capital("Cairo", "Egypt"));
        capitals.add(new Capital("Luanda", "Angola"));
        capitals.add(new Capital("Antananarivo", "Madagascar"));
        capitals.add(new Capital("Bamako", "Mali"));
        capitals.add(new Capital("Abuja", "Nigeria"));
        capitals.add(new Capital("Juba", "South sudan"));
        capitals.add(new Capital("Kampala", "Uganda"));
        capitals.add(new Capital("Harare", "Zimbabwe"));
        capitals.add(new Capital("Nairobi", "Kenya"));
        capitals.add(new Capital("Tripoli", "Libya"));


        CapitalAdapter cAdapter = new CapitalAdapter(this,capitals);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(cAdapter);

    }
}
