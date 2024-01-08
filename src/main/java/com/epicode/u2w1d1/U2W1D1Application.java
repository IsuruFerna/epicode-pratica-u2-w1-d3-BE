package com.epicode.u2w1d1;

import com.epicode.u2w1d1.entities.PizzaDetail;
import com.epicode.u2w1d1.entities.PizzaHawaiian;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U2W1D1Application {

	public static void main(String[] args) {
		SpringApplication.run(U2W1D1Application.class, args);

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U2W1D1Application.class);
//		PizzaDetail pizza = (PizzaDetail) ctx.getBean("pizza_detail");
//		pizza.details();

		PizzaHawaiian ph = (PizzaHawaiian) ctx.getBean("getPizzaHawaiian");
		System.out.println(ph);

	}

}
