package com.gagan.springdatajpa.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	private Long id;
	private String name;
	private int testScore;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTestScore() {
		return testScore;
	}
	public void setTestScore(int testScore) {
		this.testScore = testScore;
	}
	
	

}
