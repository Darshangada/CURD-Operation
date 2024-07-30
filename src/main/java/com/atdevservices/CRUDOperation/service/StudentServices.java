package com.atdevservices.CRUDOperation.service;

import java.util.List;

import com.atdevservices.CRUDOperation.model.Student;

public interface StudentServices {

	public Student addStudent(Student student);
	public List<Student> getAllStudent();
	public Student getStudentByID(long id);
	public Student UpdateStudent(long Id, Student student );
	public void DeleteStudent(long Id);
	
}
