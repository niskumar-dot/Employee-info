package com.org.emp;

import java.util.Date;

public class Employee {

	int empId;
	String empName;
	Date empDOB;
	int empPhone;
	String empEmailID;
	String empAddress;

	public void empId() {
		System.out.println("empid :");
	}
	public void empName() {
		System.out.println("empName :");
	}
	public void empDob() {
		System.out.println("empDob :");
	}
	public void empPhone() {
		System.out.println("empPhone :");
	}
	public void empEmail() {
		System.out.println("empEmail :");
	}
	public void empAddress() {
		System.out.println("empAddress :");
	}
	
	public static void main(String args[]) {
		Employee emp = new Employee();
		emp.empId();
		emp.empName();
		emp.empDob();
		emp.empPhone();
		emp.empEmail();
		emp.empAddress();
		
	}
}
