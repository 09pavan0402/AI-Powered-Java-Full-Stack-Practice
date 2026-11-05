package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Product;
import com.util.HibernateUtil;

public class DMLOperations {

	public static void main(String[] args) {
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		Product product1=new Product("Washing Machine",1,50000);
		Product product2=new Product("AC",2,80000);
		session.persist(product1);
		session.persist(product2);
		session.getTransaction().commit();
	}
}
