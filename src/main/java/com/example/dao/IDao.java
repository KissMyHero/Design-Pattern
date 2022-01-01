package com.example.dao;

import java.util.List;

import com.example.entite.BaseEntity;

public interface IDao<T extends BaseEntity> {
	
	void create(T  t);
	
	T findById(Class<T> t,Long id);
	
	
	List<T> findAll(Class<T> t);
	
	
	List<T> findAllFromJPQL(Class<T> t);
	
	void update(T t);
	
	void delete(T t);

}
