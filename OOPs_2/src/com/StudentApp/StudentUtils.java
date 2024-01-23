package com.StudentApp;

import java.util.Scanner;

public class StudentUtils {
    Student[] students  = new Student[5];
	public Student addStudent(Scanner sc){
		System.out.println("Enter the student id :");
		int id = sc.nextInt();
		System.out.println("Enter the student name :");
		String name = sc.next();
		System.out.println("Enter the student dept :");
		String dept = sc.next();
		System.out.println("Does student paid annual fees ? yes/no");
		String fessPaid = sc.next();
		System.out.println("Enter the student contact number :");
		int contact = sc.nextInt();
		System.out.println("Enter the student address :");
		String address = sc.next();
		
		Student student = new Student();
		student.setStudentId(id);
		student.setStudentName(name);
	    student.setStudentDept(dept);	
        student.setFeePaid(fessPaid);
	    student.setContactNumber(contact);  
	    student.setAddress(address);
	    return student;
		
	}
	
	
	public Student getStudentDetails(int id,Student[] arr){
		try{
			for(int i=0;i<arr.length;i++){
				if(id==arr[i].getStudentId()){
					return arr[i];
				}
			}
		}catch(Exception e){
			return null;
		}
		return null;
		
	}
	
}