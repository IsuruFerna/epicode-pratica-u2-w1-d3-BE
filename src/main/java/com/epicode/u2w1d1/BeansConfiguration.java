package com.epicode.u2w1d1;

import com.epicode.u2w1d1.entities.PizzaHawaiian;
import com.epicode.u2w1d1.entities.toppings.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class BeansConfiguration {

    @Bean
    Topping cheese() {
        return new Topping("Cheese", 92, 0.69);
    }

    @Bean
    Topping ham() {
        return new Topping("Ham", 35, 0.99);
    }

    @Bean
    Topping onions() {
        return new Topping("Onions", 22, 0.69);
    }

    @Bean
    Topping pineapple() {
        return new Topping("Pineapple", 24, 0.79);
    }

    @Bean
    Topping salami() {
        return new Topping("Salami", 86, 0.99);
    }

    @Bean
    PizzaHawaiian getPizzaHawaiian() {
        List<String> menuItems = Arrays.asList("tomato", "cheese", "ham", "pineapple");
        return new PizzaHawaiian("Hawaiian Pizza", menuItems, 1024, 6.49);
    }
}
