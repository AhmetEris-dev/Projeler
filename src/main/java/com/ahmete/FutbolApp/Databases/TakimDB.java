package com.ahmete.FutbolApp.Databases;

import com.ahmete.FutbolApp.utility.enums.ERenkler;
import com.ahmete.FutbolApp.entities.Takim;
import com.ahmete.FutbolApp.utility.DataBaseManager;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TakimDB extends DataBaseManager<Takim> {
	
	//ismiyle takım bulma
	public Optional<Takim> takimiIsmiyleBul(String takimIsmi){
		return veriListesi.stream()
				.filter(takim -> takim.getTakimIsim().equalsIgnoreCase(takimIsmi))
				.findFirst();
	}
	public List<Takim> renklereGoreTakimBul(ERenkler renkler){
		return veriListesi.stream()
				.filter(takim ->takim.getRenkler().equals(renkler))
				.collect(Collectors.toList());
				
		
	}
	
}