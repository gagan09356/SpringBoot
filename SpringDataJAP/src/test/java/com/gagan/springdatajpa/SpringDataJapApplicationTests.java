package com.gagan.springdatajpa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.gagan.springdatajpa.entity.Student;
import com.gagan.springdatajpa.repos.StudentRepository;
import static org.junit.Assert.*;

@SpringBootTest
class SpringDataJapApplicationTests {
	
	@Autowired
	StudentRepository repository;

	@Test
	void testSaveStudent() {
		Student st=new Student();
		st.setId((long) 100);
		st.setName("Ayushi");
		st.setScore(100);
		repository.save(st);
		
		Student student=repository.findById((long) 100).get();
		assertNotNull(student);
		assertEquals(100, student.getScore());
	}

}
