package com.codeclan.winelist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 15/03/2017.
 */

public class WineListAdapter extends ArrayAdapter<Wine> {

    public WineListAdapter(Context context, ArrayList<Wine> wines){
        super(context, 0, wines);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){

        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.wine_item, parent, false);
        }

        Wine currentWine = getItem(position);

        TextView wineName = (TextView) listItemView.findViewById(R.id.wine_name);
        wineName.setText(currentWine.getName());

        TextView wineColour = (TextView) listItemView.findViewById(R.id.wine_colour);
        wineColour.setText(currentWine.getColour());

        TextView winePrice = (TextView) listItemView.findViewById(R.id.wine_price);
        winePrice.setText(currentWine.getPrice().toString());

        return listItemView;
    }
}
