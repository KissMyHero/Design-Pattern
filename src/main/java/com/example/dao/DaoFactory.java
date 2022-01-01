package com.example.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.entite.BaseEntity;

public class DaoFactory {
	static SessionFactory sessionFactory=null;
	
	public static <T extends BaseEntity> IDao<T> getDao(){
		return new IDaoImpl<>();
	}

	public static SessionFactory getSessionFactory() {
		
		if(sessionFactory==null) {
			sessionFactory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		}
		return sessionFactory;
	}

}
