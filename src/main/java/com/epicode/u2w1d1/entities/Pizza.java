package com.epicode.u2w1d1.entities;

import com.epicode.u2w1d1.entities.toppings.Topping;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pizza {
    private String name;
    private List<Topping> ingredients;
    private int calories;
    private double price;

    public Pizza(List<Topping> ingredients) {
        this.ingredients = ingredients;

        boolean hasTomato = false;
        boolean hasCheese = false;

        // WHAT ARE DECORATORS? AND HOW TO USE THEM?
        // pizza margherita checker
        if (ingredients.size() == 2) {
            for (Topping topping : ingredients) {
                if(topping.getName().equalsIgnoreCase("tomato")) {
                    hasTomato = true;
                }
                if(topping.getName().equalsIgnoreCase("cheese")) {
                    hasCheese = true;
                }
            }

        }

        if (hasCheese && hasTomato) {
            this.name = "Pizza Margherita";
            this.price = 4.99;
            this.calories = 1104;
        }
    }
}
