package com.gagan.springdatajpa;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.gagan.springdatajpa.Entity.Student;
import com.gagan.springdatajpa.Repos.StudentRepos;

@SpringBootTest
class JpAassignmentApplicationTests {

	@Autowired
	StudentRepos st;
	
	@Test
	void saveStudent() {
		Student saveSt=new Student();
		saveSt.setId((long) 101);
		saveSt.setName("Gagan");
		saveSt.setTestScore(101);
		st.save(saveSt);
		assertNotNull(saveSt);
	}
	
	@Test
	void readStudent() {
		Student readStudent= st.findById((long)101).get();
		assertEquals(101, readStudent.getId());
		assertEquals("Ayushi",readStudent.getName());
		assertEquals(101, readStudent.getTestScore());
	}
	
	@Test
	void updateStudent() {
		Student readStudent= st.findById((long)101).get();
		readStudent.setName("Ayushi");
		st.save(readStudent);
		//assertNotNull(readStudent);
		assertEquals("Ayushi",readStudent.getName());
	}
	
	@Test
	void deleteStudent() {
		Student readStudent= st.findById((long)101).get();
		assertNotNull(readStudent);
		//st.delete(readStudent1);
	}
	



	

}
