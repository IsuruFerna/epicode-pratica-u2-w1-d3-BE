package com.epicode.u2w1d1.entities;

import com.epicode.u2w1d1.entities.toppings.Topping;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Menu {
    private List<Pizza> pizzaList;
    private List<Topping> toppingList;
    private List<Drink> drinkList;
}

