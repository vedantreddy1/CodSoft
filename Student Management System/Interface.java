package com.StudentManagement.Student.Student;

import java.util.Scanner;

public class Interface {

	public static void main(String[] args) {
		StudentManagementSystem sms = new StudentManagementSystem();
		Scanner scanner = new Scanner(System.in);
		
		
		while (true) {
			System.out.println("\n Student Mangement System");
			System.out.println("1. Add Student");
			System.out.println("2. Remove Student");
			System.out.println("3. Search Student");
			System.out.println("4. Display All Student");
			System.out.println("5. EXIT");
			
			int choice = scanner.nextInt();
			scanner.nextLine();
					switch (choice) {
					case 1: {
						//ADD STUDENT
						
						System.out.println("Enter Name :: ");
						String name = scanner.nextLine();
						System.out.println("Enter RollNumber : ");
						int RollNumber = scanner.nextInt();
						scanner.nextLine();
						System.out.println("Grade : ");
						String Grade = scanner.nextLine();
						System.out.println("other Details : ");
						String other_Details = scanner.nextLine();
						
						Student newStudent = new Student(name, RollNumber,Grade, other_Details);
						sms.addStudent(newStudent);
						System.out.println("Student added successfully");
						break;
					}
					case 2 :{
						
						// REMOVE STUDENT
						
						System.out.println("Enter the Roll Number to Remove");
						int RollNumber = scanner.nextInt();
						scanner.nextLine();
						sms.removeStudent(RollNumber);
					
						System.out.println("Student removed Successfully");
						break;
						
						
					}
					case 3 :{
						
						//SEARCH FOR STUDENT
						
						System.out.println("Enter the RollNumber for Search");
						int RollNumber = scanner.nextInt();
						Student foundStudent = sms.searchStudent(RollNumber);
						if(foundStudent != null) {
							System.out.println("Found Student : " + foundStudent);
							}
						else {
							System.out.println("Student with Roll Number"+ RollNumber); 
						}
						break;
					}
					case 4 : {
						
						//ALL STUDENTS
						
						System.out.println("All Students");
						sms.displayAllStudent();
						break;
						
					}
					case 5 :{
						
						//EXIT 
						
					System.out.println("Existing Student Management system . GoodBye");	
					scanner.close();
					System.exit(0);
					}
					default:
						System.out.println("Invalid choice pleae enter the valid option");
		
		}
	
	}

	}}
