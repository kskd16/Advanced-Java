package com.example;

public interface StudentCRUD {
	void saveStudent(StudentTwo s);
	void updateStudentName(int id, String name);
	void updateStudentPhone(int id, long phone);
	void deleteStudent(int id);
	void findStudent(int id);
	void findAll();
	
}
