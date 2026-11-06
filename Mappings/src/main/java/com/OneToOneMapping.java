package com;

import java.time.LocalDate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.entity.Aadhar;
import com.entity.Citizen;
import com.util.HibernateUtil;

public class OneToOneMapping {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
//		Aadhar aadhar =new Aadhar(173456,LocalDate.now());
//		Citizen citizen=new Citizen("pandu",30,aadhar);
//		session.persist(aadhar);
//		session.persist(citizen);
		Citizen citizen = session.find(Citizen.class, 2);
		System.out.println(citizen);
		session.getTransaction().commit();
	}
}
