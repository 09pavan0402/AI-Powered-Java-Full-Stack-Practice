package com.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.entity.Aadhar;
import com.entity.Citizen;
import com.entity.Order;
import com.entity.User;

public class HibernateUtil {
	private static SessionFactory sessionFactory=null;
	public static SessionFactory getSessionFactory() {
		if(sessionFactory==null) {
			Configuration cfg=new Configuration();
			cfg.configure("Hibernate.cfg.xml");
			cfg.addAnnotatedClass(Citizen.class);
			cfg.addAnnotatedClass(Aadhar.class);
			cfg.addAnnotatedClass(User.class);
			cfg.addAnnotatedClass(Order.class);
			sessionFactory =cfg.buildSessionFactory();
			return sessionFactory;
		}
		else {
			return sessionFactory;
		}
	}
}
