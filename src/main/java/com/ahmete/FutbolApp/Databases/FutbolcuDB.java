package com.ahmete.FutbolApp.Databases;

import com.ahmete.FutbolApp.utility.enums.EMevki;
import com.ahmete.FutbolApp.entities.Futbolcu;
import com.ahmete.FutbolApp.utility.DataBaseManager;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FutbolcuDB extends DataBaseManager<Futbolcu> {
	
	//isme ve soyisme göre futbolcu bulma
	public Optional<Futbolcu> ismiVeSoyIsmiBul(String isim, String soyIsim) {
		return veriListesi.stream()
		                  .filter(futbolcu -> futbolcu.getIsim().equalsIgnoreCase(isim) && futbolcu.getSoyIsim()
		                                                                                           .equalsIgnoreCase(soyIsim))
		                  .findFirst();
	}
	
	// mevkiye göre futbolcu bulma
	public List<Futbolcu> mevkiBul(EMevki mevki) {
		return veriListesi.stream()
		                  .filter(futbolcu -> futbolcu.getMevki().equals(mevki)).collect(Collectors.toList());
	}
	
	// takımID ye göre futbolcu bulma
	public List<Futbolcu> takimIDBul(Integer takimID) {
		return veriListesi.stream()
		                  .filter(futbolcu -> futbolcu.getTakimID().equals(takimID))
		                  .collect(Collectors.toList());
	}
	
	public boolean futbolcuSil(int id){
		return veriListesi.removeIf(futbolcu -> futbolcu.getId()==id);
	}
}