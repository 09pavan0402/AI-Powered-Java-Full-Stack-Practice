package com.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="courses")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int courseId;
	private String courseName;
	private double coursePrice;
	@ManyToMany(mappedBy = "courses", cascade = CascadeType.ALL)
	private List<Student> students;
	public Course() {
		super();
	}
	public Course(String courseName, double coursePrice) {
		super();
		this.courseName = courseName;
		this.coursePrice = coursePrice;
	}
	public Course(int courseId, String courseName, double coursePrice, List<Student> students) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.coursePrice = coursePrice;
		this.students = students;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public double getCoursePrice() {
		return coursePrice;
	}
	public void setCoursePrice(double coursePrice) {
		this.coursePrice = coursePrice;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", coursePrice=" + coursePrice + "]";
	}
}
