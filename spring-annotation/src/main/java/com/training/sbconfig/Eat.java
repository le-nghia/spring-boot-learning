package com.training.sbconfig;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Eat implements Today {

	@Override
	public void eat() {
		System.out.println("Hôm nay tôi không ăn gì!!");
		
	}

}
