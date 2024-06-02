package com.linex;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonCtrl {

	@GetMapping
	public String getMethodName() {
		return new String("Welcome java 17.");
	}

}
