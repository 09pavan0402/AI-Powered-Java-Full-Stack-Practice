package com.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name="departments")
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="department_id")
	private int departmentId;
	private String departmentName;
	@OneToMany(cascade = CascadeType.ALL, mappedBy="department", fetch = FetchType.EAGER)
	private List<Student> student;
	public Department() {
		super();
	}
	public Department(String departmentName, List<Student> student) {
		super();
		this.departmentName = departmentName;
		this.student = student;
	}
	public Department(String departmentName) {
		super();
		this.departmentName = departmentName;
	}
	public Department(int departmentId, List<Student> student) {
		super();
		this.departmentId = departmentId;
		this.student = student;
	}
	public Department(int departmentId, String departmentName, List<Student> student) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.student = student;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + "]";
	}
	
	
}
