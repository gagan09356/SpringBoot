package com.gagan.springdatajpa.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gagan.springdatajpa.Entity.Student;

public interface StudentRepos extends JpaRepository<Student, Long> {

}
