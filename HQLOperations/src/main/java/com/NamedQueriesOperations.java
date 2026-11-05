package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.entity.Product;
import com.util.HibernateUtil;

public class NamedQueriesOperations {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session openSession = sessionFactory.openSession();
//		Query<Product> namedQuery = openSession.createNamedQuery("allproducts",Product.class);
//		List<Product> list = namedQuery.list();
//		System.out.println(list);
		Query<Product> namedQuery = openSession.createNamedQuery("singleproduct",Product.class);
		namedQuery.setParameter(1, 3);
		List<Product> list = namedQuery.list();
		System.out.println(list);
	}
}
