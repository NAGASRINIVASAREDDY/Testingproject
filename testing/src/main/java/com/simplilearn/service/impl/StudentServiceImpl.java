package com.simplilearn.service.impl;

import com.simplilearn.entity.Student;

import com.simplilearn.repository.StudentRepository;
import com.simplilearn.service.StudentService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentRepository studentRepository;
	@Override
	public Student createStudent(Student student) {
		// TODO Auto-generated method stub
		return  studentRepository.save(student);
	}

	@Override
	public List<Student> getstudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public Student findbyid(Long id) {
		// TODO Auto-generated method stub
		Optional<Student> optionalstudent = studentRepository.findById(id);

		if (optionalstudent.isPresent()) {
			return optionalstudent.get();
		}
	
		return null;
	}
	@Override
	public void updateStudent(Long id, Student student) {
		// TODO Auto-generated method stub
		Optional<Student> optionalstudent = studentRepository.findById(id);

		if (optionalstudent.isPresent()) {
			studentRepository.save(student);
		}
	}

	@Override
	public void deleteStudent(Long id) {
		// TODO Auto-generated method stub
		Optional<Student> optionalstudent = studentRepository.findById(id);

		if (optionalstudent.isPresent()) {
			studentRepository.delete(optionalstudent.get());
			
	}

	}

	@Override
	public List<Student> findall1() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findall() {
		// TODO Auto-generated method stub
		return null;
	}
}