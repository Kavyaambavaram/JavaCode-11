package com.StudentApp;

import java.util.Scanner;

public class StudentManagementApp {

	public static void main(String[] args) {
		System.out.println("---------Welcome to StudentManagementApp--------");
		StudentUtils studentUtils = new StudentUtils();
		Student[] arr = new Student[3];
		Scanner sc = new Scanner(System.in);
		Student newStudent = studentUtils.addStudent(sc);
		Student newStudent2 = studentUtils.addStudent(sc);
		Student newStudent3 = studentUtils.addStudent(sc);
		
		System.out.println("Adding to array");
		arr[0] = newStudent;
		arr[1] = newStudent2;
		arr[2] = newStudent3;
		
		
		System.out.println("Enter the id of student to be search:");
		int searchId = sc.nextInt();
	
		Student storedStudent = studentUtils.getStudentDetails(searchId, arr);
        if(storedStudent!=null){
        	System.out.println("Displaying the details");
        	System.out.println("Id      :"+storedStudent.getStudentId());
        	System.out.println("Name    :"+storedStudent.getStudentName());
        	System.out.println("Dept    :"+storedStudent.getStudentDept());
        	System.out.println("FeePaid :"+storedStudent.getFeePaid());
        	System.out.println("Contact :"+storedStudent.getContactNumber());
        	System.out.println("Address :"+storedStudent.getAddress());
        }else{
        	System.out.println("Student not found");
        }
	}

}