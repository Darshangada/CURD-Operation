package com.atdevservices.CRUDOperation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "Student_Details")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long studentId;
	@NotBlank(message = "Name Should not be blank")
	@Pattern(regexp = "[A-Za-z\\s]+", message = "Only Alphabets are allowed")
	private String studentName;

    @NotNull(message = "Age should not be null")
    @Min(value = 1, message = "Age should be greater than 0")
	private int age;
	@NotBlank(message = "Grade Should not be blank")
	private String grade;
	@NotBlank(message = "Email Should not be blank")
	private String email;
	@NotBlank(message = "Course Should not be blank")
	private String course;
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Student(Long studentId,
			@NotBlank(message = "Name Should not be blank") @Pattern(regexp = "[A-Za-z\\s]+", message = "Only Alphabets are allowed") String studentName,
			@NotBlank(message = "Age Should not be blank") @Pattern(regexp = "[^\\d+$]+", message = "Only Numeric value are allowed") int age,
			@NotBlank(message = "Grade Should not be blank") String grade,
			@NotBlank(message = "Email Should not be blank") String email,
			@NotBlank(message = "Course Should not be blank") String course) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.age = age;
		this.grade = grade;
		this.email = email;
		this.course = course;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", age=" + age + ", grade=" + grade
				+ ", email=" + email + ", course=" + course + "]";
	}
	
	

	
	
}
