package com.viom.bootdemo1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.viom.bootdemo1.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	//custom method
	List<Student > findByName(String name);
	
	Student findByNameAndPhone(String name, long phone);
	
	//custom query
	
	@Query("select s from Student s where s.name=:name")
	List<Student> getStudentByName(String name);

	@Query("select s from Student s where s.name=:name and s.phone= :phone")
	Student getStudentByNameAndPhone(String name, long phone);
	
	@Query(nativeQuery =  true, value = "select * from student")
	List<Student> getAll();
}
