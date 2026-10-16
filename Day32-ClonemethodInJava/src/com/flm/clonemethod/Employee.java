package com.flm.clonemethod;

public class Employee implements Cloneable{
	
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	private Address address;
	public Employee() {
		
	}
	
	public Employee(int employeeId, String employeeName, double employeeSalary, Address address) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.address = address;
	}
	
	public Employee(Employee emp) {
		this.employeeId=emp.employeeId;
		this.employeeName = emp.employeeName;
		this.employeeSalary = emp.employeeSalary;
		this.address=new Address(emp.address);
	}
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	
	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}

	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", address=" + address + "]";
	}


	@Override
	public Object clone() throws CloneNotSupportedException {
		
		return new Employee(this);
	}
}
