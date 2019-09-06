package com.p1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {
		Car c = new Car(1, "Maruti");
		HatchBack hb = new HatchBack("high");
		SportsCar sc = new SportsCar(188);
		
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		session.save(c);
		session.save(hb);
		session.save(sc);
//		c = session.get(Car.class, 1);
		session.flush();
		t.commit();
		System.out.println(c.getBrand());
	}
	
}