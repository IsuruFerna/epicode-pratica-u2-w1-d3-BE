package com.epicode.u2w1d1.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@NoArgsConstructor
@Setter
@ToString
public class Drink implements ItemOrder {
    private String name;
    private int calories;
    private double price;
    private String volume;
    private String amtAlcohol;

    public Drink(String name, int calories, double price, String volume, String amtAlcohol) {
        this.name = name;
        this.calories = calories;
        this.price = price;
        this.volume = volume;
        this.amtAlcohol = amtAlcohol;
    }

    public Drink(String name, int calories, double price, String volume) {
        this.name = name;
        this.calories = calories;
        this.price = price;
        this.volume = volume;
        this.amtAlcohol = null;
    }

    @Override
    public void details() {
        System.out.println(this);
    }
}
