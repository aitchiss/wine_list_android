package com.codeclan.winelist;

/**
 * Created by user on 15/03/2017.
 */

public class Wine {

    String name;
    String colour;
    Double price;

    public Wine(String name, String colour, Double price){
        this.name = name;
        this.colour = colour;
        this.price = price;
    }

    public String getName(){

        return this.name;
    }

    public String getColour(){
        return this.colour;
    }

    public String getPrice(){

        String price = this.price.toString();
        String formattedPrice = "£" + price;
        return formattedPrice;
    }

}
