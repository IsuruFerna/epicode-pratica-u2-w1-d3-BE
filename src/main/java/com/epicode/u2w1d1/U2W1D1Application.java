package com.epicode.u2w1d1;

import com.epicode.u2w1d1.entities.PizzaDetail;
import com.epicode.u2w1d1.entities.PizzaHawaiian;
import com.epicode.u2w1d1.entities.toppings.Topping;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class U2W1D1Application {

	public static void main(String[] args) {
		SpringApplication.run(U2W1D1Application.class, args);

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U2W1D1Application.class);
//		PizzaDetail pizza = (PizzaDetail) ctx.getBean("pizza_detail");
//		pizza.details();

		PizzaHawaiian ph = (PizzaHawaiian) ctx.getBean("getPizzaHawaiian");
		System.out.println(ph);

		// toppings
		List<Topping> toppings = Arrays.asList(
				(Topping) ctx.getBean("cheese"),
				(Topping) ctx.getBean("ham"),
				(Topping) ctx.getBean("onions"),
				(Topping) ctx.getBean("pineapple"),
				(Topping) ctx.getBean("salami")
		);

		System.out.println(toppings);

	}

}
