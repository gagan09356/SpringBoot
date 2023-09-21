package com.gagan.sum;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class TestSumController {
	
 @Autowired 
 SumController sumController;

	@Test
	public void test() {
		//SumController sumController=new SumController();
		assertEquals(2, sumController.sum(1, 1));
		//assertEquals(2, sumController.sum(1,1));
	}

}  
