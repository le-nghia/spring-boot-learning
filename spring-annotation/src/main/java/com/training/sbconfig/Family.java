package com.training.sbconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Family {
	
	@Autowired
	Today today;

	public Family(Today today) {
		this.today = today;
	}
	
	/**
	 * Setter
	 * Getter
	 */
	

}
