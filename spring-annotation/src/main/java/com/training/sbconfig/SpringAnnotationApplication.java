package com.training.sbconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringAnnotationApplication {

	public static void main(String[] args) {
		
		/*
		 * ApplicationContext chính là container, chứa toàn bộ các bean.
		 */
		
		ApplicationContext context = SpringApplication.run(SpringAnnotationApplication.class, args);
		
		/**
		 * 	Sau khi chạy xog thì lúc này context sẽ chứa
		 * 	các bean được đánh dấu bằng @Component
		 */

		/* Lấy bean ra bằng cách gọi lớp*/
		Today tody = context.getBean(Today.class);

		/* In ra xem có gì */
		System.out.println("Đây là gì: " + tody);
		tody.eat();

		Family family = context.getBean(Family.class);
		Family family1 = context.getBean(Family.class);

		System.out.println("Family : " + family);
		System.out.println("Family 1: " + family1.today);

		family.today.eat();
	}

}
