package com.flm.objectclass;

import java.util.Objects;

public class Student {
	int id;
	String name;
	public Student(){
		super();
	}
	public Student(int id, String name) {
		super();
		this.id=id;
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		Student student =(Student) obj;
		boolean output=(this.id==student.id)&&(this.name.equals(student.name));
		return output;
		
	}
	public int hashCode() {
		return Objects.hash(this.id,this.name);
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
}
