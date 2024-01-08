package com.epicode.u2w1d1.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PizzaHawaiian implements PizzaDetail {
    private String name;
    private List<String> menuItems;
    private int calories;
    private double price;

    @Override
    public void details() {
        System.out.println("Name: " + this.getName() + "(" + this.getMenuItems().toString() + ")");
        System.out.println("Calories: " + this.getCalories());
        System.out.println("Price: " + this.getCalories());
    }
}
