package com.epicode.u2w1d1.entities;

import java.util.StringJoiner;

public class PizzaSalami implements PizzaDetail {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", PizzaSalami.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .toString();
    }

    @Override
    public void details() {
        System.out.println("Name: Salami Pizza (tomato, cheese, salami)");
        System.out.println("Calories: 1160");
        System.out.println("Price: 5.99");
    }
}
