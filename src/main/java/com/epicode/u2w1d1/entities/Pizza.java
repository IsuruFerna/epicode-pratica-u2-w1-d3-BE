package com.epicode.u2w1d1.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Pizza {
    private String name;
    private List<String> menuItems;
    private int calories;
    private double price;



}
