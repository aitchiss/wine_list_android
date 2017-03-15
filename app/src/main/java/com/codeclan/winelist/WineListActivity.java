package com.codeclan.winelist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class WineListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wine_list);

        WineList wineList = new WineList();
        ArrayList<Wine> wines = wineList.getWineList();

        WineListAdapter wineListAdapter = new WineListAdapter(this, wines);

        ListView listView = (ListView) findViewById(R.id.wine_list);
        listView.setAdapter(wineListAdapter);


    }
}
