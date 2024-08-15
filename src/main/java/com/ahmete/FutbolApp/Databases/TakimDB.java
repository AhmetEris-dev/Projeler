package com.ahmete.FutbolApp.Databases;

import com.ahmete.FutbolApp.utility.enums.ERenkler;
import com.ahmete.FutbolApp.entities.Takim;
import com.ahmete.FutbolApp.utility.DataBaseManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TakimDB extends DataBaseManager<Takim> {
	
	//ismiyle takım bulma
	public Optional<Takim> takimiIsmiyleBul(TakimDB takimDB, String takimIsmi){
		return veriListesi.stream()
				.filter(takim -> takim.getTakimIsim().equalsIgnoreCase(takimIsmi))
				.findFirst();
	}
	public List<Takim> renklereGoreTakimBul(ERenkler renkler){
		return veriListesi.stream()
				.filter(takim ->takim.getRenkler().equals(renkler))
				.collect(Collectors.toList());
				
		
	}
	public List<Takim> ismeGoreButunTakimleriListele(String takimIsmi){
		
			return 	veriListesi.stream().filter(takim -> takim.getTakimIsim().toLowerCase().contains(takimIsmi))
				           .collect(Collectors.toList());
		
		
		
	}
	public List<Takim> renklereGoreTakimBul2(ERenkler renkler){
		List<Takim> takimRenkleri=new ArrayList<>();
		for (Takim takim:veriListesi){
			if (takim.getRenkler().equals(renkler)){
				takimRenkleri.add(takim);
			}
			
		}
		return takimRenkleri;
		
	}
	public List<Takim> searchByPartialName(String ismeGore) {
		return veriListesi.stream()
		                  .filter(takim -> takim.getTakimIsim().toLowerCase().contains(ismeGore.toLowerCase()))
		                  .collect(Collectors.toList());
	}
	
	public List<Takim> ismeGoreButunTakimlariListele(String kulupIsmi) {
		return veriListesi.stream()
		                  .toList();
	}
	
}