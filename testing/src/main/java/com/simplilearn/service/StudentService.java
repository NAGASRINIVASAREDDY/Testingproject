package com.simplilearn.service;

import java.util.List;

import com.simplilearn.entity.Student;

public interface StudentService {
	//CREATE
	Student createStudent(Student student);
	//READ
	List<Student> getstudents();
	Student findbyid(Long id);
	//UPDATE
	void updateStudent(Long id, Student student);
	//DELETE
	void deleteStudent(Long id);
	
	List<Student> findall1();
	List<Student> findall();
	


}