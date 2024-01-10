package com.epicode.u2w1d1.entities;

import com.epicode.u2w1d1.entities.toppings.Topping;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Menu {
    private List<Pizza> pizzaList;
    private List<Topping> toppingList;
    private List<Drink> drinkList;

    @Override
    public String toString() {
        System.out.println("---------- PIZZA ------------");
        System.out.println("Pizzas | Calories | Price");
        pizzaList.stream().forEach(pizza -> {
            String ingredients = pizza.getIngredients().stream().map(Topping::getName).collect(Collectors.joining(", "));
            System.out.println(pizza.getName() + "(" + ingredients + ") | " + "calories: " + pizza.getCalories() + " | price: " + pizza.getPrice());
        });

        System.out.println("---------- TOPPING ------------");
        System.out.println("Toppings | Calories | Price");
        toppingList.forEach(topping -> {
            System.out.println(topping.getName() + " | " + topping.getCalories() + " | " + topping.getPrice());
        });
        System.out.println("---------- DRINK ------------");
        System.out.println("Drinks | Calories | Price");
        drinkList.forEach(drink -> System.out.println(drink.getName() + "(" + drink.getVolume() + ", " + drink.getAmtAlcohol() + ")" + " | " + drink.getCalories() + " | " + drink.getPrice()));

        return "";
    }
}

