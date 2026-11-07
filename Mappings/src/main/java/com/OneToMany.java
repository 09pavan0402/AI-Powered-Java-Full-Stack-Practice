package com;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Department;
import com.entity.Order;
import com.entity.Student;
import com.entity.User;
import com.util.HibernateUtil;

public class OneToMany {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		Department department = session.find(Department.class, 2);
		System.out.println(department);
	}
	private static void users(Session session) {
		session.beginTransaction();
		Order order1=new Order(1,2000);
		Order order2=new Order(3,6000);
		Order order3=new Order(10,20000);
		
		List<Order> firstOrdersList=new ArrayList<Order>();
		firstOrdersList.add(order1);
		firstOrdersList.add(order2);
		
		List<Order> secondOrdersList=new ArrayList<Order>();
		secondOrdersList.add(order3);
		
		User user1=new User("pavan",20,firstOrdersList);
		User user2=new User("gopal",20,secondOrdersList);
		
		order1.setUser(user1);
		order2.setUser(user1);
		order3.setUser(user2);
		
		session.persist(user1);
		session.persist(user2);
		session.getTransaction().commit();
	}
	private static void addDepartment(Session session) {
		session.beginTransaction();
		Department dept1=new Department("ECE");
		Department dept2=new Department("EEE");
		Department dept3=new Department("CSE");
		
		session.persist(dept1);
		session.persist(dept2);
		session.persist(dept3);
		session.getTransaction().commit();
    }
	private static void addStudent(Session session) {
		Student stu1=new Student("pavan",20);
		Student stu2=new Student("pandu",22);
		Student stu3=new Student("gopal",23);
		Student stu4=new Student("bhanu",19);
		List<Student> students=new ArrayList<Student>();
		students.add(stu1);
		students.add(stu2);
		students.add(stu3);
		students.add(stu4);
		//cse
		Department department = session.find(Department.class, 2);
		department.setStudent(students);
		stu1.setDepartment(department);
		stu2.setDepartment(department);
		stu3.setDepartment(department);
		stu4.setDepartment(department);
		session.beginTransaction();
		session.persist(department);
		session.getTransaction().commit();
	}
}
