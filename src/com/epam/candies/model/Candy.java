package com.epam.candies.model;

public abstract class Candy {
    private String name;
    private double weight;
    private double price;

    public Candy(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public void setWeight() {

    }
    public void setPrice(){

    }

    public void setName(){

    }


}
