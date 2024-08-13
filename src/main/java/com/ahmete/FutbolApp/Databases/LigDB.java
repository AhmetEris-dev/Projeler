package com.ahmete.FutbolApp.Databases;

import com.ahmete.FutbolApp.entities.Lig;
import com.ahmete.FutbolApp.utility.DataBaseManager;

import java.util.Optional;

public class LigDB extends DataBaseManager<Lig> {
	
	// lig ismine göre bulma
	public Optional<Lig> ligIsmiBul(String ligIsmi){
		return veriListesi.stream()
				.filter(lig -> lig.getLigIsmi().equalsIgnoreCase(ligIsmi))
				.findFirst();
	}
	
	// bütün ligleri listeledik
	public  void ligleriListele(){
		veriListesi.stream()
				.toList()
				.forEach(System.out::println);
				
	}
	
}