package com.StudentManagement.Student.Student;

import java.util.ArrayList;


public class StudentManagementSystem {
	
	private ArrayList<Student> students;
	public StudentManagementSystem() {
		
		students= new ArrayList<>();
		}
	
	public void addStudent(Student student) {
		students.add(student);
	}
	public void removeStudent(int RollNumber) {
		students.removeIf(student -> student.getRollNumber() == RollNumber);
	}
	
	
	public Student searchStudent(int RollNumber) {
		for (Student student: students) {
			if(student.getRollNumber()==RollNumber) {
				return student;
			}
		}
		return null;
	}
	
	
	public void displayAllStudent() {
		for (Student student : students) {
			System.out.println(student);
		}
	}

}
