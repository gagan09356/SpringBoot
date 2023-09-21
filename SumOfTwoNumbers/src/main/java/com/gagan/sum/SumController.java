package com.gagan.sum;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class SumController {
	
	@RequestMapping("/sum")
	public int sum(int a,int b) {
		return a+b;
	}

}
