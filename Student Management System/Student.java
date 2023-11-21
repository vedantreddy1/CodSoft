package com.StudentManagement.Student.Student;

public class Student {

	private String name;
	private int RollNumber;
	private String Grade;
	private String other_Details;

	public Student(String name, int RollNumber, String Grade, String other_Details) {
		this.name = name;
		this.RollNumber = RollNumber;
		this.Grade = Grade;
		this.other_Details = other_Details;
	}

	public String toString() {

		return "Name: " + name + ", RollNumber:" + RollNumber + ", Grade:" + Grade + ", other_Details" + other_Details;

	}

	public int getRollNumber() {
		return RollNumber;
	}

}
