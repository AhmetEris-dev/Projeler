package com.ahmete.FutbolApp.Databases;

import com.ahmete.FutbolApp.utility.enums.EMevki;
import com.ahmete.FutbolApp.entities.Futbolcu;
import com.ahmete.FutbolApp.utility.DataBaseManager;

import java.util.List;

import java.util.stream.Collectors;

public class FutbolcuDB extends DataBaseManager<Futbolcu> {
	
	private static final FutbolcuDB instance = new FutbolcuDB();
	
	private FutbolcuDB() {}
	
	public static FutbolcuDB getInstance() {
		return instance;
	}
	
	public List<Futbolcu> takimIdyeGoreFutbolcuBul(Integer takimId){
		return veriListesi.stream()
		                  .filter(futbolcu -> futbolcu.getTakimID().equals(takimId))
		                  .collect(Collectors.toList());
	}
	
	public List<Futbolcu> takimIdyeGoreFutbolculariListele(int takimId) {
		return veriListesi.stream()
				.filter(futbolcu -> futbolcu.getTakimID().equals(takimId))
				.collect(Collectors.toList());
	}
}