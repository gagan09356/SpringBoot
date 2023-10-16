package com.gagan.sum;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestSumController {
	
 
	@Autowired
	SumService sumController;
	

	@Test
	public void test() {
		assertEquals(2, sumController.sum(1, 1));
	}

}  
