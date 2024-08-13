package com.ahmete.FutbolApp.utility;

import com.ahmete.FutbolApp.entities.BaseEntitiy;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class DataBaseManager<T extends BaseEntitiy> implements ICRUD<T>{
	
	protected ArrayList<T> veriListesi=new ArrayList<>();
	
	@Override
	public Optional<T> save(T t) {
		if (t !=null && veriListesi.add(t)) {
			return Optional.of(t);
			
		}
		return Optional.empty();
	}
	
	@Override
	public Optional<List<T>> saveAll(List<T> t) {
		// ? ekleyebildin mi eklediysen t dön ekleyemediysen null dön
		return Optional.ofNullable(veriListesi.addAll(t) ? t : null);
		
	
	}
	
	@Override
	public Optional<T> update(T t) {
		int index=veriListesi.indexOf(t);
		if (index>=0){
			T oldEntitiy=veriListesi.set(index,t);
			return Optional.of(oldEntitiy);
		}else {
			return Optional.empty();
		}
	}
	
	@Override
	public Optional<List<T>> findAll() {
		// ? verilistesi
		return Optional.ofNullable(veriListesi != null ? new ArrayList<>(veriListesi) : null);	}
	
	@Override
	public Optional<T> findById(int id) {
		for (BaseEntitiy entity : veriListesi) {
			if (entity.getId() == id) {
				return Optional.of((T) entity);
			}
		}
		return Optional.empty();
	}
}