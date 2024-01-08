package com.epicode.u2w1d1;

import com.epicode.u2w1d1.entities.PizzaHawaiian;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class BeansConfiguration {

    @Bean
    PizzaHawaiian getPizzaHawaiian() {
        List<String> menuItems = Arrays.asList("tomato", "cheese", "ham", "pineapple");
        return new PizzaHawaiian("Hawaiian Pizza", menuItems, 1024, 6.49);
    }
}
