package com.training.sbconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringAnnotationDisTroyApplication {

	public static void main(String[] args) {
		System.out.println("==> Trước khi IoC Container được khởi tạo: ===== ");
		
		ApplicationContext context = SpringApplication.run(SpringAnnotationDisTroyApplication.class, args);
		
		System.out.println("==> Sau khi IoC Container được khởi tạo: ===== ");
		
		
		Family family = context.getBean(Family.class);
		
		System.out.println("==> Trước khi IoC Container destroy Family: ===== ");
		 ((ConfigurableApplicationContext) context).getBeanFactory().destroyBean(family);
		System.out.println("==> Sau khi IoC Container destroy Family: ===== ");
	}

}
