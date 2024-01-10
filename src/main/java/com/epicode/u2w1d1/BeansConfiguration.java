package com.epicode.u2w1d1;

import com.epicode.u2w1d1.entities.Drink;
import com.epicode.u2w1d1.entities.Menu;
import com.epicode.u2w1d1.entities.Pizza;
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
    Topping tomato() {
        return new Topping("Tomato", 22, 0.20);
    }


//    *********************** Pizza
    @Bean
    Pizza pizzaMargherita() {
        List<Topping> ing = Arrays.asList(cheese(), tomato());
        return new Pizza("Pizza Margherita", ing, 1104, 4.99);
    }

    @Bean
    Pizza pizzaHawaiian() {
        List<Topping> ing = Arrays.asList(cheese(), tomato(), ham(), pineapple());
        return new Pizza("Hawaiin Pizza", ing, 1024, 6.49);
    }

    @Bean
    Pizza pizzaSalamin() {
        List<Topping> ing = Arrays.asList(cheese(), tomato(), salami());
        return new Pizza("Pizza Salami", ing, 1160, 5.99);
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


//    ******************************** Menu
    @Bean
    Menu menu() {
        List<Drink> drinks = Arrays.asList(lemonade(), water(), wine());
        List<Pizza> pizza = Arrays.asList(pizzaMargherita(), pizzaHawaiian(), pizzaSalamin());
        List<Topping> toppings = Arrays.asList(cheese(), ham(), onions(), pineapple(), salami());
        System.out.println("************* This is menu **************");
        return new Menu(pizza, toppings, drinks);
    }
}
