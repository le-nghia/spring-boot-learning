package com.training.sbconfig;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Family {
	
	@PostConstruct
	public void postContructor() {
		System.out.println("========>Đối tượng Familty sau khi khởi chạy thì gọi hàm này. Lê Nghĩa");
	}
	
	@PreDestroy
	public void preDisTroy() {
		System.out.println("=========> Đối tượng Family trước khi hủy thì gọi hàm này. DisTroy");
	}

}
