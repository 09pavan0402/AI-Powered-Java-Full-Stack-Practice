package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Students {
	@Id
	private int stu_id;
	private String stu_name;
	private int stu_marks;
	public Students() {
		
	}
	
	public Students(int stu_id, String stu_name, int stu_marks) {
		this.stu_id = stu_id;
		this.stu_name = stu_name;
		this.stu_marks = stu_marks;
	}

	public int getStu_id() {
		return stu_id;
	}
	public void setStu_id(int stu_id) {
		this.stu_id=stu_id;
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
		return "Students [stu_id=" + stu_id + ", stu_name=" + stu_name + ", stu_marks=" + stu_marks + "]";
	}
}
