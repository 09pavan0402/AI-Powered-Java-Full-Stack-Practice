package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.NativeQuery;
import com.entity.Product;
import com.util.HibernateUtil;

public class NativeQueries {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		//delete
		session.beginTransaction();
		MutationQuery nativeMutationQuery = session.createNativeMutationQuery("delete from products where product_id=:product_id");
		nativeMutationQuery.setParameter("product_id", 6);
		nativeMutationQuery.executeUpdate();
		session.getTransaction().commit();
		
	}
	private static void selectALl(Session session) {
		NativeQuery<Product> nativeQuery = session.createNativeQuery("select * from products",Product.class);
		List<Product> list = nativeQuery.list();
		System.out.println(list);
	}
	private static void select(Session session) {
		NativeQuery<Product> nativeQuery = session.createNativeQuery("select * from products where product_id=1",Product.class);
		List<Product> list = nativeQuery.list();
		System.out.println(list);
	}
	private static void insert(Session session) {
		session.beginTransaction();
		MutationQuery nativeMutationQuery = session.createNativeMutationQuery("insert into products(product_name,product_quantity,product_price) values(?1,?2,?3)");
		nativeMutationQuery.setParameter(1, "Sofa");
		nativeMutationQuery.setParameter(2, 1);
		nativeMutationQuery.setParameter(3, 100000);
		nativeMutationQuery.executeUpdate();
		session.getTransaction().commit();
	}
	private static void update(Session session) {
		session.beginTransaction();
		MutationQuery nativeMutationQuery = session.createNativeMutationQuery("update products set product_quantity=:product_quantity where product_id=:product_id");
		nativeMutationQuery.setParameter("product_quantity",2);
		nativeMutationQuery.setParameter("product_id", 6);
		nativeMutationQuery.executeUpdate();
		session.getTransaction().commit();
	}
}
