package com.flm.comparable;

public class Student implements Comparable<Student> {
	private int stuId;
	private String stuName;
	private int marks;
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
	@Override
	public int compareTo(Student student) {
//		return this.marks-student.marks;
		return this.stuName.compareTo(student.stuName);
	}
}
