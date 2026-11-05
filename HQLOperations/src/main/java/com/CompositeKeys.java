package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Car;
import com.entity.CarId;
import com.util.HibernateUtil;

public class CompositeKeys {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session openSession = sessionFactory.openSession();
		openSession.beginTransaction();
		CarId carId=new CarId(123, 334);
		Car car=new Car(carId,"Altoz","Tata",900000.00);
		openSession.persist(car);
		openSession.getTransaction().commit();
	}
}
