package com.hibernate.utils;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	static SessionFactory factory = null;

	public static SessionFactory getFactory() {
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		factory = configuration.buildSessionFactory(builder.build());
		return factory;
	}

	public static SessionFactory getFactory(String fileName) {

		Configuration configuration = new Configuration().configure(fileName);
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		factory = configuration.buildSessionFactory(builder.build());

		return factory;

	}

}
