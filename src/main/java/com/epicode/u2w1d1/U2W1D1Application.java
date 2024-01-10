package com.epicode.u2w1d1;

import com.epicode.u2w1d1.entities.*;
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

		Menu menu = (Menu) ctx.getBean("menu");
		System.out.println(menu);
	}

}
