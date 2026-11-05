package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Employee;
import com.util.HibernateUtil;

public class DMLOperations {

	public static void main(String[] args) {
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		
		Session session=sessionFactory.openSession();
		//Transient state
		Employee emp1=new Employee("govind",900000);
		//Persistent state
		Employee employee=session.find(Employee.class, 1);
		session.beginTransaction();
		session.persist(emp1);
		
//		employee.setEmployeeSalary(5000000);
//		emp1.setEmployeeSalary(800000);
		session.getTransaction().commit();
		session.close();
		//detached state
		employee.setEmployeeSalary(5000000);
		emp1.setEmployeeSalary(800000);
		System.out.println("updated employee");
	}
}
