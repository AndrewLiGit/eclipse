package com.test;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;

public class RobinProductTest {
	public static void main(String[] args){
		Configuration configure = new Configuration().configure();
		SessionFactory sessionFactory = configure.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		for(int i=0;i<10;i++){
			RobinProduct rp=new RobinProduct();
			rp.setName("product"+i);
			rp.setPrice(i+5);
			rp.setCount(5000);
			session.save(rp);
//			if(i==5)
//				System.out.println(rp);
		}
		RobinProduct 
		rp=(RobinProduct) session.load(RobinProduct.class, 103);
		System.out.println(rp);
		rp.setName("pppp");
		session.saveOrUpdate(rp);
		rp=(RobinProduct) session.get(RobinProduct.class, 105);
		System.out.println(rp);
		session.delete(rp);
		transaction.commit();

		session.close();
	}
}
