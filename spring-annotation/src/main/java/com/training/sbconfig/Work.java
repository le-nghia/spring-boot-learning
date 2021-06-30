package com.training.sbconfig;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Work implements Today {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Hôm nay Gia đình tôi ăn cơm");
	}
}
