package com.training.sbconfig;

import org.springframework.stereotype.Component;

@Component("word")
public class Work implements Today {

	@Override
	public void eat() {
		
		System.out.println("Hôm nay tôi không làm gì !!");
	}
}
