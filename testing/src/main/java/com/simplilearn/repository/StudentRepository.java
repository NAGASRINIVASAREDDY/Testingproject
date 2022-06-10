package com.simplilearn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.entity.Student;

@Repository

public interface StudentRepository extends JpaRepository<Student, Long> {


	

}
