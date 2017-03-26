package com.briup.base;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.briup.bean.Fruit;

public class HibernateBase {

	private Configuration cfg;
	private SessionFactory sf;
	
	@Before
	public void before(){
		
		try {
			cfg = new Configuration();
			cfg.configure();
			sf = cfg.buildSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@After 
	public void after(){
		
		try {
			sf.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void save(){
		
		try {
			Session session = sf.openSession();
			Transaction tran = session.beginTransaction();
			Fruit fruit = new Fruit(1,"apple","Good!",3.0);
			session.save(fruit);
			tran.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
