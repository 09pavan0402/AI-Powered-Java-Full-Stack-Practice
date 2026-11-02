package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Employee;
import com.entity.Students;
import com.util.HibernateUtil;

public class DMLOperations {

	public static void main(String[] args) {
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		
		Session session=sessionFactory.openSession();
		
		Employee emp11=new Employee("pavan",100000);
		session.beginTransaction();
		session.persist(emp11);
		session.getTransaction().commit();
		
		
	}
	public static void insertSession(Session session) {
		Students st1=new Students(4, "raghu", 55);
		session.beginTransaction();
		session.persist(st1);
		session.getTransaction().commit();
	}
	public static void selectSession(Session session) {
		//DDL - select
		//select 8 from students where id=1;
		Students st1=session.find(Students.class, 1);
		System.out.println(st1);
	}
	public static void deleteSession(Session session) {
		//Delete
		Students st=new Students(4,"",0);
		session.remove(st);
		session.beginTransaction();
		session.getTransaction().commit();
	}
	public static void updateSession(Session session) {
		//update
		Students st=session.find(Students.class, 2);
		//Students st=new Students();
		st.setStu_marks(60);
		session.beginTransaction();
		session.merge(st);
		session.getTransaction().commit();
	}
}
