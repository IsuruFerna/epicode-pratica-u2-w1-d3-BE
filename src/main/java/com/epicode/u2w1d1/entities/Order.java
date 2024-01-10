package com.epicode.u2w1d1.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private long id;
    private Menu order;
    private State state;
    private int numberOfSeats;
    private LocalDate orderedTime;
    private double totalPrice;

    public void addItem(ItemOrder item) {

    }
}
