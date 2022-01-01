package com.example.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.example.entite.BaseEntity;

public class IDaoImpl<T extends BaseEntity> implements IDao<T>{

	public void create(T t) {
		SessionFactory factory=DaoFactory.getSessionFactory();
		
		Session session=factory.openSession();
		
		session.beginTransaction();
		
		session.save(t);
		
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public T findById(Class<T> t, Long id) {
       SessionFactory factory=DaoFactory.getSessionFactory();
	   Session session=factory.openSession();
	   T entity=session.find(t, id);
	   session.close();
		return entity;
	}

	@Override
	public List<T> findAllFromJPQL(Class<T> t) {
		 SessionFactory factory=DaoFactory.getSessionFactory();
		   Session session=factory.openSession();
		   
		   Query q=session.createQuery("select t FROM "+t.getSimpleName() + " t ");//select t from Client t;
		session.close();
		return q.getResultList();
	}

	@Override
	public void update(T t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(T t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<T> findAll(Class<T> type) {
		   SessionFactory factory=DaoFactory.getSessionFactory();
		   Session session=factory.openSession();

		   CriteriaBuilder builder=session.getCriteriaBuilder();
		   CriteriaQuery<T> query= builder.createQuery(type);
		   Root<T> root =query.from(type);
		   query.select(root);

		   Query q=session.createQuery(query);
		   session.close();
		   return q.getResultList();

	}

}
