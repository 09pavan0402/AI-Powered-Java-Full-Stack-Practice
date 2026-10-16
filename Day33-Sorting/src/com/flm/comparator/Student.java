package com.flm.comparator;

public class Student  {
	int stuId;
	String stuName;
	int marks;
	public Student() {
		
	}
	public Student(int stuId, String stuName, int marks) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", marks=" + marks + "]";
	}
}
