package com.epicode.u2w1d1;

import com.epicode.u2w1d1.entities.Drink;
import com.epicode.u2w1d1.entities.Pizza;
import com.epicode.u2w1d1.entities.PizzaHawaiian;
import com.epicode.u2w1d1.entities.toppings.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
    Topping tomato() {
        return new Topping("Tomato", 22, 0.20);
    }

    @Bean
    Pizza pizzaMargerita() {
        List<Topping> ingrediants = Arrays.asList(tomato(), cheese());
        return new Pizza(ingrediants);
    }

    @Bean
    PizzaHawaiian getPizzaHawaiian() {
        List<String> menuItems = Arrays.asList("tomato", "cheese", "ham", "pineapple");
        return new PizzaHawaiian("Hawaiian Pizza", menuItems, 1024, 6.49);
    }

//    ************************ Drinks
    @Bean
    Drink lemonade() {
        return new Drink("Lemonade", 128, 1.29, "0.33l");
    }

    @Bean
    Drink water() {
        return new Drink("Water", 0, 1.29, "0.5l");
    }

    @Bean
    Drink wine() {
        return new Drink("Wine", 609, 7.49, "0.75l", "13%");
    }
}
