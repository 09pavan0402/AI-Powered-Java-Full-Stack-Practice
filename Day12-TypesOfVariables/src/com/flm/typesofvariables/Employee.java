package com.flm.typesofvariables;

public class Employee {
	int employeeId;
	String name;
	int age;
	double salary;
//	String companyName;
	static String companyName;
	public Employee(int empId,String empName,int empAge, double empSalary, String empCompanyName) {
		employeeId=empId;
		name=empName;
		age=empAge;
		salary=empSalary;
		companyName=empCompanyName;
	}
	public Employee() {
		int a=10;
		System.out.println(a);
	}
}
