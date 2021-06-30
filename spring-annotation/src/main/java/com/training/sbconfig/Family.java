package com.training.sbconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Family {

	// Đánh dấu để Spring inject một đối tượng Outfit vào đây
	@Autowired
	Today today;

	// Spring sẽ inject outfit thông qua Constructor trước
	
	/**
	 * Trong thực tế, sẽ có trường hợp chúng ta sử dụng @Autowired khi Spring Boot có chứa 2 Bean 
	 * cùng loại trong Context.Lúc này thì Spring sẽ bối rối và không biết sử dụng Bean nào để inject vào đối tượng.
	 * Giải quyết: Dùng @Primary or @Qualifier
	 * 		@Primary đặt trước class or method
	 * 		@Qualifier("") đặt trong method 
	 * Class nào or method nào có 2 cách trên thì được ưu tiên.
	 * @param today
	 */

	
	// Nếu không tìm thấy Constructor thoả mãn, nó sẽ thông qua setter
	
	// Đánh dấu để Spring inject một đối tượng Outfit vào đây
	public Family(Today today) {
		
		// Spring sẽ inject outfit thông qua Constructor đầu tiên
        // Ngoài ra, nó sẽ tìm Bean có @Qualifier("naked") trong context để ịnject
		
		this.today = today;
	}

	/**
	 * Setter Getter
	 */

}
