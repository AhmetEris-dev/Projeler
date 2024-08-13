package com.ahmete;

import com.ahmete.FutbolApp.Databases.FutbolcuDB;
import com.ahmete.FutbolApp.Databases.LigDB;
import com.ahmete.FutbolApp.Databases.MusabakaDB;
import com.ahmete.FutbolApp.Databases.TakimDB;
import com.ahmete.FutbolApp.entities.Lig;
import com.ahmete.FutbolApp.entities.Musabaka;
import com.ahmete.FutbolApp.entities.Takim;
import com.ahmete.FutbolApp.utility.enums.EMevki;
import com.ahmete.FutbolApp.entities.Futbolcu;
import com.ahmete.FutbolApp.utility.enums.ERenkler;

import java.time.LocalDate;
import java.util.Optional;

public class Test {
	public static void main(String[] args) {
		
	
			// Database instance'ları oluşturuluyor
			FutbolcuDB futbolcuDB = new FutbolcuDB();
			LigDB ligDB = new LigDB();
			MusabakaDB musabakaDB = new MusabakaDB();
			TakimDB takimDB = new TakimDB();
			
			// Lig oluşturma ve kaydetme
			Lig lig = new Lig("Super Lig");
			ligDB.save(lig);
			
			// Takım oluşturma ve kaydetme
			Takim takim1 = new Takim("Galatasaray", "Burak Elmas", "Fatih Terim", "1905", 85, lig.getId(), ERenkler.SARI_KIRMIZI);
			Takim takim2 = new Takim("Fenerbahçe", "Ali Koç", "Jorge Jesus", "1907", 82, lig.getId(), ERenkler.LACIVERT_SARI);
			takimDB.save(takim1);
			takimDB.save(takim2);
			
			// Futbolcu oluşturma ve kaydetme
			Futbolcu futbolcu1 = new Futbolcu("Kerem", "Aktürkoğlu", LocalDate.of(1998, 10, 21), "10M", EMevki.HUCUM);
			futbolcu1.setTakimID(takim1.getId());
			futbolcuDB.save(futbolcu1);
			
			Futbolcu futbolcu2 = new Futbolcu("Mesut", "Özil", LocalDate.of(1988, 10, 15), "5M", EMevki.ORTASAHA);
			futbolcu2.setTakimID(takim2.getId());
			futbolcuDB.save(futbolcu2);
			
			// Müsabaka oluşturma ve kaydetme
			Musabaka musabaka = new Musabaka(takim1, takim2, "Türk Telekom Stadı", 2, 1, "Cüneyt Çakır", LocalDate.now());
			musabakaDB.save(musabaka);
			
			// Testler
			// 1. Lig ismine göre bulma
			Optional<Lig> ligTest = ligDB.ligIsmiBul("Super Lig");
			ligTest.ifPresent(System.out::println);
			
			// 2. Takım ismine göre bulma
			Optional<Takim> takimTest = takimDB.takimiIsmiyleBul("Galatasaray");
			takimTest.ifPresent(System.out::println);
			
			// 3. Futbolcu ismine ve soyisime göre bulma
			Optional<Futbolcu> futbolcuTest = futbolcuDB.ismiVeSoyIsmiBul("Kerem", "Aktürkoğlu");
			futbolcuTest.ifPresent(System.out::println);
			
			// 4. Mevkiye göre futbolcu bulma
			futbolcuDB.mevkiBul(EMevki.HUCUM).forEach(System.out::println);
			
			// 5. Müsabaka tarihine göre bulma
			musabakaDB.tarihindekiMusabakalariBul(LocalDate.now()).forEach(System.out::println);
		}
	}