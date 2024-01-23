package com.encapsulation;

import java.util.Scanner;

class Employee{
	private int empId;
	private String empName;
	private String empDep;
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getEmpId() {
		return this.empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDep() {
		return empDep;
	}
	public void setEmpDep(String empDep) {
		this.empDep = empDep;
	}
	
}

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee id: ");
		int empId=sc.nextInt();
		
		System.out.println("Enter the employee department: ");
		String empDep=sc.next();
		
		System.out.println("Enter the employee name: ");
		String empName=sc.next();
		
		Employee emp=new Employee();
		emp.setEmpId(empId);
		emp.setEmpName(empName);
		emp.setEmpDep(empDep);
		
		System.out.println("Displaying the deatils ");
		System.out.println("Employee Id : "+empId);
		System.out.println("Employee Name : "+empName);
		System.out.println("Employee  Department: "+empDep);
	}
	

}
