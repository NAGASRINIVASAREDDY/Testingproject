package com.simplilearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simplilearn.entity.Student;
import com.simplilearn.service.StudentService;

@Controller
public class StudentController {
	
@Autowired
StudentService studentService;

@RequestMapping("/index")
public String index() {
	return "index";
}

@RequestMapping("/create")
public String Create() {
	return "create";
}

@RequestMapping("/read")
public String Read(ModelMap model) {
	List<Student> student = studentService.findall();
	model.put("studentmodel", student);
	return "read";
}

@RequestMapping("/update")
public String Update() {
	return "update";
}

@RequestMapping("/delete")
public String Delete() {
	return "delete";
}


@RequestMapping(value = "/addstudent", method = RequestMethod.POST)
public String createProduct(@RequestParam String name 
		, @RequestParam String email
		, @RequestParam int age
		, @RequestParam String gender) {
	Student student = new Student(null, name, email, age, gender);
	studentService.createStudent(student);
			return "success";
	
}

@RequestMapping(value = "/updatestudent", method = RequestMethod.POST)
public String updateProduct(@RequestParam Long id
		, @RequestParam String name 
		, @RequestParam String email
		, @RequestParam int age
		, @RequestParam String gender) {
	Student student = studentService.findbyid(id);
	student.setAge(age);
	student.setEmail(email);
	student.setGender(gender);
	student.setName(name);
	
    studentService.updateStudent(id, student);
			return "success";
	
}

@RequestMapping(value = "/deletestudent", method = RequestMethod.POST)
public String updateProduct(@RequestParam Long id) {
    studentService.deleteStudent(id);
			return "success";
	
}





}