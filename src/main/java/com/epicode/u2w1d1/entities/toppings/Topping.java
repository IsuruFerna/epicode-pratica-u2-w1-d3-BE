package com.epicode.u2w1d1.entities.toppings;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Topping {
    private String name;
    private int calories;
    private double price;
}
