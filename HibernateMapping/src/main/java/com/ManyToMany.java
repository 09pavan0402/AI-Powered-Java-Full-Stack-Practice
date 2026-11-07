package com;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Course;
import com.entity.Student;
import com.util.HibernateUtil;

public class ManyToMany {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		Course course = session.find(Course.class, 1);
		System.out.println(course);
	}
	private static void addCourses(Session session) {
		session.beginTransaction();
		Course course1=new Course("JFS",15000);
		Course course2=new Course("PFS",14000);
		Course course3=new Course("Mern Stack",15000);
		session.persist(course1);
		session.persist(course2);
		session.persist(course3);
		session.getTransaction().commit();
	}
	private static void addStudents(Session session) {
		session.beginTransaction();
		Student stu1=new Student("pavan");
		Student stu2=new Student("bhanu");
		
		List<Student> students1=new ArrayList<Student>();
		students1.add(stu1);
		students1.add(stu2);
		
		Course course = session.find(Course.class, 1);
		List<Course> coursesList=new ArrayList<Course>();
		coursesList.add(course);
		course.setStudents(students1);
		stu1.setCourses(coursesList);
		stu2.setCourses(coursesList);
		session.persist(course);
		session.getTransaction().commit();
	}
}
