package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Students {
	//variable names same as column name as per students table in database
	//this class called pojo class
	@Id
	private int stu_Id;
	private String stu_name;
	private int stu_marks;
	public Students() {
		
	}
	public Students(int stu_Id, String stu_name, int stu_marks) {
		
		this.stu_Id = stu_Id;
		this.stu_name = stu_name;
		this.stu_marks = stu_marks;
	}
	public int getStu_Id() {
		return stu_Id;
	}
	public void setStu_Id(int stu_Id) {
		this.stu_Id = stu_Id;
	}
	public String getStu_name() {
		return stu_name;
	}
	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}
	public int getStu_marks() {
		return stu_marks;
	}
	public void setStu_marks(int stu_marks) {
		this.stu_marks = stu_marks;
	}
	@Override
	public String toString() {
		return "Students [stu_Id=" + stu_Id + ", stu_name=" + stu_name + ", stu_marks=" + stu_marks + "]";
	}
}
