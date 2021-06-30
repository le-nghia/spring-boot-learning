package com.training.sbconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringAnnotationApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringAnnotationApplication.class, args);
		
		Today tody = context.getBean(Today.class);
		
		System.out.println("Đây là gì: " + tody);
		tody.eat();
		
		Family family = context.getBean(Family.class);
		Family family1 = context.getBean(Family.class);
		
		
		System.out.println("Family : " + family);
		System.out.println("Family 1: " + family1.today);
		
		family.today.eat();
	}

}
