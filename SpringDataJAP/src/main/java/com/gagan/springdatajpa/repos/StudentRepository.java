package com.gagan.springdatajpa.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gagan.springdatajpa.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
