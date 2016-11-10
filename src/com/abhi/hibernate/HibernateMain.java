package com.abhi.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.Service;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.spi.SessionFactoryServiceRegistryBuilder;

public class HibernateMain {

public static void main(String[]args) {
	Configuration configuration = new Configuration();
	configuration.configure();
	configuration.addAnnotatedClass(User.class);
	ServiceRegistry sr= new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
	SessionFactory sf= configuration.buildSessionFactory(sr);
	
	User user1= new User();
	user1.setUsername("Raju");
	user1.setEmailId("xyz@er.com");
	Session ss= sf.openSession();
	ss.beginTransaction();
	ss.save(user1);
	ss.getTransaction().commit();
	ss.close();
	
	
		
}
}
