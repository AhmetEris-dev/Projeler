package com.ahmete.FutbolApp.utility;

import java.util.List;
import java.util.Optional;

public interface ICRUD<T> {
	
	Optional<T> save(T t);
	
	Optional<List<T>> saveAll(List<T> t);
	
	Optional<T> update( T t);
	
	Optional<List<T>> findAll();
	
	Optional<T> findById(int id);
}