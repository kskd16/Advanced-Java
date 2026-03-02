package com.viom.bootdemo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.viom.bootdemo1.entity.Student;
import com.viom.bootdemo1.service.StudentService;

@RequestMapping("/example")
@RestController
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@PostMapping("/student")
	public Student saveStu(@RequestBody Student s) {
		
		return service.saveStudent(s);
	}
	
	@GetMapping("/student/{id}")
	public Student findStudentById(@PathVariable int id) {
		return service.findStudent(id);
	}
	
	@GetMapping("/studentall")
	public List<Student> findAll(){
		return service.findAll();
	}
	
	@DeleteMapping("/studentdel")
	public String deleteStudent(@RequestBody Student s) {
		service.deleteStudent(s);
		return "student deleted";
	}
	
	@PostMapping("/saveAll")
	public List<Student> saveAllStudent(@RequestBody List<Student> list){
		return service.saveAll(list);
	}
	
	@DeleteMapping("/studentdel/{id}")
	public String deleteStudentById(@PathVariable int id) {
		service.deleteById(id);
		return id+" deleted";
	}
	
	@GetMapping("/student/findName")
	public List<Student> findByName(@RequestParam String name) {
	    return service.findStudentByName(name);
	}
	
	@GetMapping("student/findNameAndPhone")
	public Student findByNameAndPhone(@RequestParam String name,@RequestParam long phone) {
		return service.findByNameAndPhone(name, phone);
	}
	
	@GetMapping("student/findAll")
	public List<Student> getAll(){
		return service.getAll();
	}
	@PostMapping("/student/assign/{studentId}/{collegeId}")
	public Student assignStudent(
	        @PathVariable int studentId,
	        @PathVariable int collegeId) {

	    return service.assignStudentToCollege(studentId, collegeId);
	}

}
