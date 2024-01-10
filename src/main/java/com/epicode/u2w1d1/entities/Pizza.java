package com.epicode.u2w1d1.entities;

import com.epicode.u2w1d1.entities.toppings.Topping;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pizza implements Order {
    private String name;
    private List<Topping> ingredients;
    private int calories;
    private double price;

    private List<Topping> basicIngredients() {
         List<Topping> ing = Arrays.asList(
                new Topping("Tomato", 22, 0.20),
                new Topping("Cheese", 92, 0.69)
        );
         return ing;
    }



    public void addIngredient(Topping topping) {
        this.ingredients.add(topping);
    }

    public void addIngredients(List<Topping> ingredients) {
        this.ingredients.addAll(ingredients);
    }

//    public Pizza() {
//        this.name = "Pizza Margherita";
//        this.ingredients = basicIngredients;
//    }

    //    this class has to be modify
//    public Pizza(String name, List<Topping> ingredients) {
//        this.name = name;
//        this.ingredients = basicIngredients;
//        this.ingredients.addAll(ingredients);
//
//
//        boolean hasTomato = false;
//        boolean hasCheese = false;
//
//        // WHAT ARE DECORATORS? AND HOW TO USE THEM?
//        // pizza margherita checker
//        if (ingredients.size() == 2) {
//            for (Topping topping : ingredients) {
//                if(topping.getName().equalsIgnoreCase("tomato")) {
//                    hasTomato = true;
//                }
//                if(topping.getName().equalsIgnoreCase("cheese")) {
//                    hasCheese = true;
//                }
//            }
//
//        }
//
//        if (hasCheese && hasTomato) {
//            this.name = "Pizza Margherita";
//            this.price = 4.99;
//            this.calories = 1104;
//        }
//
//
//    }

    @Override
    public void details() {
        System.out.println(this);
    }

}
