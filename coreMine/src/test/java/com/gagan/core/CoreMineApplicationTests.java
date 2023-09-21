package com.gagan.core;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.gagan.core.services.PaymentService;
import com.gagan.core.services.PaymentServiceImpl;

@SpringBootTest
class CoreMineApplicationTests {

	@Autowired
	PaymentService service;
	
	@Autowired
	PaymentServiceImpl serviceImpl;
	
	@Test
	void testDependencyInjection() {
		assertNotNull(service);
	}
	
	@Test
	void testDependencyInjectionDao() {
		assertNotNull(serviceImpl.getDao());
	}

}
