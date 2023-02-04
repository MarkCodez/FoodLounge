package com.marke.FoodLounge;

public class Dish {

    String title;
    String describe;
    int price;


    Dish(String title, String describe, int price){
        this.title = title;
        this.describe = describe;
        this.price = price;
    }

    @Override
    public String toString() {
        return title;
    }
}
