package com.example.android.capitals2;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CapitalAdapter extends ArrayAdapter<Capital> {

    public CapitalAdapter(Activity context, ArrayList<Capital> capitals) {
        super(context, 0, capitals);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Capital currentCapital = getItem(position);

        TextView cityTextView = (TextView) listItemView.findViewById(R.id.city_text_view);
        cityTextView.setText(currentCapital.getCityName());

        TextView countryTextView = (TextView) listItemView.findViewById(R.id.country_text_view);
        countryTextView.setText(currentCapital.getCountryName());

        return listItemView;
    }
}
