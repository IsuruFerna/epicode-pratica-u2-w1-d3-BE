package com.epicode.u2w1d1.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Table {
    private long id;
    private int seats;
    private Availablility availablility;
    private List<Order> orders;

}
