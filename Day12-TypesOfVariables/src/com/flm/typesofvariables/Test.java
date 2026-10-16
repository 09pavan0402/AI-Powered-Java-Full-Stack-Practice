package com.flm.typesofvariables;

public class Test {

	public static void main(String[] args) {
		Employee emp1=new Employee();
		emp1.employeeId=1;
		emp1.name="Pavan";
		emp1.salary=100000;
		emp1.age=20;
//		emp1.companyName="FLM";
		Employee.companyName="FLM";
		emp1.companyName="FLMedu";
		Employee emp2=new Employee();
		emp2.employeeId=2;
		emp2.name="Balu";
		emp2.salary=200000;
		emp2.age=22;
//		emp2.companyName="FLM";
		System.out.println(emp1.employeeId);
		System.out.println(emp1.name);
		System.out.println(emp1.salary);
		System.out.println(emp1.age);
		System.out.println(emp1.companyName);
		System.out.println(emp2.employeeId);
		System.out.println(emp2.name);
		System.out.println(emp2.salary);
		System.out.println(emp2.age);
		System.out.println(emp2.companyName);
	}

}
