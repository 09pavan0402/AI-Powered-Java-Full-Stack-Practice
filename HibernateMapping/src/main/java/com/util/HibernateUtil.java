package com.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Course;
import com.entity.Student;


public class HibernateUtil {
	private static SessionFactory sessionFactory=null;
	public static SessionFactory getSessionFactory() {
		if(sessionFactory==null) {
			Configuration cfg=new Configuration();
			cfg.configure("Hibernate.cfg.xml");
			cfg.addAnnotatedClass(Student.class);
			cfg.addAnnotatedClass(Course.class);
			sessionFactory =cfg.buildSessionFactory();
			return sessionFactory;
		}
		else {
			return sessionFactory;
		}
	}
}
