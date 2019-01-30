package com.example.android.capitals2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
         * Find Europe TextView and set click listener on that view
         */
        TextView europe = findViewById(R.id.europe_text_view);
        europe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent europeIntent = new Intent(MainActivity.this, EuropeActivity.class);
                startActivity(europeIntent);
            }
        });

        /*
         * Find Asia TextView and set click listener on that view
         */
        TextView asia = findViewById(R.id.asia_text_view);
        asia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent asiaIntent = new Intent(MainActivity.this, AsiaActivity.class);
                startActivity(asiaIntent);
            }
        });

        /*
         * Find Africa TextView and set click listener on that view
         */
        TextView africa = findViewById(R.id.africa_text_view);
        africa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent africaIntent = new Intent(MainActivity.this, AfricaActivity.class);
                startActivity(africaIntent);
            }
        });

        /*
         * Find AustraliaActivity TextView and set click listener on that view
         */
        TextView australia = findViewById(R.id.australia_text_view);
        australia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent australiaIntent = new Intent(MainActivity.this, AustraliaActivity.class);
                startActivity(australiaIntent);
            }
        });

        /*
         * Find North America TextView and set click listener on that view
         */
        TextView northAmerica = findViewById(R.id.north_america_text_view);
        northAmerica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent northAmericaIntent = new Intent(MainActivity.this, NorthAmericaActivity.class);
                startActivity(northAmericaIntent);
            }
        });

        /*
         * Find South America TextView and set click listener on that view
         */
        TextView southAmerica = findViewById(R.id.south_america_text_view);
        southAmerica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent southAmericaIntent = new Intent(MainActivity.this, SouthAmericaActivity.class);
                startActivity(southAmericaIntent);
            }
        });

        /*
         * Find Antarctic TextView and set click listener on that view
         */
        TextView antarctic = findViewById(R.id.antarctic_text_view);
        antarctic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent antarcticIntent = new Intent(MainActivity.this, AntarcticActivity.class);
                startActivity(antarcticIntent);
            }
        });
    }
}
