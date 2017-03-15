package com.codeclan.winelist;

import java.util.ArrayList;

/**
 * Created by user on 15/03/2017.
 */

public class WineList {

    ArrayList<Wine> wineList;

    public WineList(){
        wineList = new ArrayList<Wine>();

        Wine wine1 = new Wine("Merlot", "red", 4.00);
        Wine wine2 = new Wine("Pinot Noir", "red", 5.50);
        Wine wine3 = new Wine("Malbec", "red", 5.75);
        Wine wine4 = new Wine("Sauvignon Blanc", "white", 4.50);
        Wine wine5 = new Wine("Chardonnay", "white", 4.00);

        wineList.add(wine1);
        wineList.add(wine2);
        wineList.add(wine3);
        wineList.add(wine4);
        wineList.add(wine5);

    }

    public ArrayList<Wine> getWineList(){
        return this.wineList;
    }
}
