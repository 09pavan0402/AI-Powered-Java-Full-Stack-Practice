package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.SelectionQuery;

import com.entity.Product;
import com.util.HibernateUtil;

public class DMLOperations {

	public static void main(String[] args) {
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
		//delete session
		session.beginTransaction();
		MutationQuery mutationQuery = session.createMutationQuery("delete from Product where productId=:productId");
		mutationQuery.setParameter("productId", 5);
		mutationQuery.executeUpdate();
		session.getTransaction().commit();
	}
	private static void selectALl(Session session) {
//		SelectionQuery<Product> selectionQuery = session.createSelectionQuery("select p from Product p", Product.class);
		SelectionQuery<Product> selectionQuery = session.createSelectionQuery("from Product", Product.class);
		List<Product> list = selectionQuery.list();
		System.out.println(list);
	}
	private static void select(Session session) {
		//static
		//SelectionQuery<Product> selectionQuery = session.createSelectionQuery("from Product where id=1",Product.class);
		//dinamic
		SelectionQuery<Product> selectionQuery = session.createSelectionQuery("from Product where productId=?1",Product.class);
		selectionQuery.setParameter(1, 2);
		List<Product> list = selectionQuery.list();
		System.out.println(list);
	}
	private static void insert(Session session) {
		session.beginTransaction();
		MutationQuery mutationQuery = session.createMutationQuery("insert into Product(productName,productQuantity,productPrice) values(?1,?2,?3)");
		mutationQuery.setParameter(1, "Sofa");
		mutationQuery.setParameter(2, 1);
		mutationQuery.setParameter(3, 100000);
		mutationQuery.executeUpdate();
		session.getTransaction().commit();
	}
	private static void update(Session session) {
		session.beginTransaction();
	//	MutationQuery mutationQuery = session.createMutationQuery("update Product set productNmae=?1 where productid=?2");
		MutationQuery mutationQuery = session.createMutationQuery("update Product set productName=:productName where productId=:productId");
		mutationQuery.setParameter("productName","TV");
		mutationQuery.setParameter("productId", 3);
		MutationQuery mutationQuery2 = session.createMutationQuery("update Product set productName=:productName,productQuantity=:productQuantity where productId=:productId");
		mutationQuery2.setParameter("productName","Fridge");
		mutationQuery2.setParameter("productQuantity",3);
		mutationQuery2.setParameter("productId", 4);
		mutationQuery2.executeUpdate();
		session.getTransaction().commit();
	}
}