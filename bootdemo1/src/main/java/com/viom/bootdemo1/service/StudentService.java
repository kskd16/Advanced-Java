package com.viom.bootdemo1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viom.bootdemo1.entity.College;
import com.viom.bootdemo1.entity.Student;
import com.viom.bootdemo1.repository.CollegeRepository;
import com.viom.bootdemo1.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private CollegeRepository collegeRepo;
	@Autowired
	private StudentRepository repo ;
	
	public Student saveStudent(Student s) {
		return repo.save(s);
	}
	
	public void deleteStudent(Student s) {
		repo.delete(s);
	
	}
	public Student findStudent(int id) {
		Optional<Student> opt = repo.findById(id);
		return opt.get();
	}
	
	public List<Student> findAll(){
		return repo.findAll();
	}
	
	public void deleteById(int id) {
		repo.deleteById(id);
	}
	public List<Student> saveAll(List<Student> list){
		return repo.saveAll(list);
	}
	
	public List<Student> getAll(){
		return repo.getAll();
	}
	public List<Student> findStudentByName(String name){
		return repo.findByName(name);
	}
	
	public Student findByNameAndPhone(String name, long phone) {
		return repo.findByNameAndPhone(name, phone);
	}
	public Student assignStudentToCollege(int studentId, int collegeId) {

	    Student student = repo.findById(studentId)
	            .orElseThrow(() -> new RuntimeException("Student not found"));

	    College college = collegeRepo.findById(collegeId)
	            .orElseThrow(() -> new RuntimeException("College not found"));

	    student.setCollege(college);  

	    return repo.save(student);
	}

}
