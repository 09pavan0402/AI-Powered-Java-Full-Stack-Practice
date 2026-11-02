package com.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DMLOperations {

	public static void main(String[] args) {
		//session object is used to intact with database
		//session object comes from section factory
		//session factory is created at hibernate.cfg.xml file
		//we had configuration class to taken session factory from hibernate.cfg.xml
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Students.class);
		//session factory
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		//session
		Session openSession = sessionFactory.openSession();
		openSession.beginTransaction();
		
		//by using objects without queries with orm
		Students st1=new Students(3,"bhanu",95);
		openSession.persist(st1);//persist noting but insert
		openSession.getTransaction().commit();
	}
}
