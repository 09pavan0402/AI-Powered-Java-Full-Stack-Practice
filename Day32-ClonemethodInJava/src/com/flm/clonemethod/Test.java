package com.flm.clonemethod;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		Address add1=new Address(522003,"guntur");
		Employee emp1=new Employee(1,"pavan",400000, add1);
		System.out.println(emp1);
		Employee emp2= (Employee) emp1.clone();
		System.out.println(emp2);
		
		emp1.setEmployeeId(3);
		emp1.getAddress().setCity("vijag");
		System.out.println("========================");
		System.out.println(emp1);
		System.out.println(emp2);
	}

}
