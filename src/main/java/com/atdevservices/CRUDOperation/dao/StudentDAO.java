package com.atdevservices.CRUDOperation.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atdevservices.CRUDOperation.model.Student;
import com.atdevservices.CRUDOperation.repository.StudentRepository;
import com.atdevservices.CRUDOperation.service.StudentServices;

@Service
public class StudentDAO implements StudentServices {
	
	@Autowired
	private StudentRepository repository;

	@Override
	public Student addStudent(Student student) {
		
		return repository.save(student);
	}

	@Override
	public List<Student> getAllStudent() {
		
		return repository.findAll();
	}

	@Override
	public Student getStudentByID(long id) {
		
		return repository.findById(id).orElse(null);
	}

	@Override
	public Student UpdateStudent(long Id, Student student) {
		Student std= repository.getById(Id);
		if(std != null) {
			std.setStudentName(student.getStudentName());
			std.setAge(student.getAge());
			std.setEmail(student.getEmail());
			std.setGrade(student.getGrade());
			std.setCourse(student.getCourse());
			
			return repository.save(std);
		}
		return null;
	}

	@Override
	public void DeleteStudent(long Id) {
		repository.deleteById(Id);
	}

}
