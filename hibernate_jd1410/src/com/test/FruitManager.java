package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FruitManager {
	public static void main(String[] args){
		
		Configuration configure = new Configuration().configure();
		
		SessionFactory sessionFactory = configure.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Fruit banana=new Fruit();
		banana.setId(1);
		banana.setName("banana");
		banana.setPrice(6);
		session.save(banana);
		
		Fruit apple=new Fruit();
		apple.setName("apple");
		apple.setPrice(5);
		session.save(apple);
		
		banana=(Fruit) session.load(Fruit.class, 1l);
		System.out.println(banana);
		
		session.delete(apple);
		transaction.commit();
		session.close();	
	}
}
