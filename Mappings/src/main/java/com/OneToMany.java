package com;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Order;
import com.entity.User;
import com.util.HibernateUtil;

public class OneToMany {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
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
}
