package com.ahmete.FutbolApp.utility;

public interface ICRUD<T> {
	
	T save(T t);
	
	Iterable<T> saveAll(Iterable<T> t);
	
	T update( T t);
	
	Iterable<T> findAll();
	
	T findByID(int id);
	
}