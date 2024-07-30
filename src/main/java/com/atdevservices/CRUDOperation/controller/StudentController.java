package com.atdevservices.CRUDOperation.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atdevservices.CRUDOperation.dao.StudentDAO;
import com.atdevservices.CRUDOperation.model.Student;

@RestController
@RequestMapping("/api/students")
public class StudentController {

	@Autowired
	private StudentDAO dao;

	// Insert Student Details;

	@PostMapping("/create")
	public Student createStudent(@Valid @RequestBody Student student) {
		if (student != null) {
			Student std = dao.addStudent(student);
			return std;
		} else {
			return null;
		}
	}

	// Find All Student Record

	@GetMapping(path = "/getALL")
	public List<Student> getAllStudents() {
		return dao.getAllStudent();
	}

	// Find Student By Id
	
	@GetMapping(path = "/getbyId/{id}")
	public Student getStudentById(@PathVariable("id") Long id) {
		Student student = dao.getStudentByID(id);
		return student;
	}
	
	// Update Student Record
	
	 @PutMapping("/update/{id}")
	    public Student updateStudent(@PathVariable("id") Long id, @RequestBody Student studentDetails) {
	        Student updatedStudent = dao.UpdateStudent(id, studentDetails);
	        return updatedStudent;
	    }
	 
	 // Delete Student Record
	 
	 @DeleteMapping("/delete/{id}")
	    public void deleteStudent(@PathVariable("id") Long id) {
	        dao.DeleteStudent(id);
	       
	    }
}
