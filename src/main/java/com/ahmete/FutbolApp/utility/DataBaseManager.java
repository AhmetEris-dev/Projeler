package com.ahmete.FutbolApp.utility;

import com.ahmete.FutbolApp.entities.BaseEntitiy;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class DataBaseManager<T extends BaseEntitiy> implements ICRUD<T>{
	
	protected ArrayList<T> veriListesi=new ArrayList<>();
	
	@Override
	public T save(T t) {
		if (veriListesi.add(t)){
			return t;
			
		}else {
			return null;
		}
	}
	
	@Override
	public List<T> saveAll(Iterable<T> t) {
		if (veriListesi.addAll((Collection<? extends T>) t)){
			return (List<T>) t;
		}else {
			return null;
		}
	
	}
	
	@Override
	public T update(T t) {
		int index=veriListesi.indexOf(t);
		return veriListesi.set(index,t);
	}
	
	@Override
	public List<T> findAll() {
		return veriListesi;
	}
	
	@Override
	public T findByID(int id) {
		for (BaseEntitiy entitiy:veriListesi){
			if (entitiy.getId()==id){
				return (T) entitiy;
			}
		}
		return null;
	}
}