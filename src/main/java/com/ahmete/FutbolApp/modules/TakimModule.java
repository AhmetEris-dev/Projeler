package com.ahmete.FutbolApp.modules;

import com.ahmete.FutbolApp.Databases.FutbolcuDB;
import com.ahmete.FutbolApp.Databases.LigDB;
import com.ahmete.FutbolApp.Databases.MusabakaDB;
import com.ahmete.FutbolApp.Databases.TakimDB;
import com.ahmete.FutbolApp.entities.Takim;
import com.ahmete.FutbolApp.utility.DataBaseManager;
import com.ahmete.FutbolApp.utility.DataGenerator;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;


/**
 * Kulüp modulü; Menüde; 1- Isme Gore Kulup Ara, 2- Kulupleri Listele
 *
 */
public class TakimModule {
	
		private static final TakimDB takimDB = new TakimDB();
		private static final Scanner scanner = new Scanner(System.in);
	
		public static void menu() {
			DataGenerator.generateTakimlar(takimDB, new LigDB());
		while (true) {
			System.out.println("------ Takim Menusu ---------");
			System.out.println("1-Isme göre kulüp ara");
			System.out.println("2-Kulupleri listele");
			System.out.println("0-Çıkış yap");
			System.out.print("Seçiminizi yapınız: ");
			int secim = scanner.nextInt();
			scanner.nextLine();
			
			switch (secim) {
				case 1:
					ismeGoreAra();
					break;
				case 2:
					listeleTakimlar();
					break;
				case 0:
					scanner.close();
					System.out.println("Çıkış yapılıyor...");
					return;
				default:
					System.out.println("Lütfen geçerli bir seçim yapınız.");
					break;
			}
		}
	}
	
	public static void ismeGoreAra() {
		System.out.print("Kulüp ismine giriniz (veya kısmını giriniz): ");
		String kulupIsmi = scanner.nextLine();
		List<Takim> takimlar = takimDB.searchByPartialName(kulupIsmi);
		
		if (takimlar.isEmpty()) {
			System.out.println("Aradığınız kriterlere uygun kulüp bulunamadı.");
		} else {
			for (int i = 0; i < takimlar.size(); i++) {
				System.out.println((i + 1) + ". " + takimlar.get(i).getTakimIsim());
			}
		}
	}
	
	public static void listeleTakimlar() {
		List<Takim> takimlar = takimDB.findAll();
		if (takimlar.isEmpty()) {
			System.out.println("Herhangi bir kulüp bulunamadı.");
		} else {
			System.out.println("Kulüpler:");
			for (int i = 0; i < takimlar.size(); i++) {
				Takim takim = takimlar.get(i);
				System.out.println((i + 1) + ". " + takim.getTakimIsim()+ " - " + takim.getRenkler()
						                   +". " + takim.getBaskanIsmi() + " - " + takim.getKurulusTarihi());
				
			}
		}
	}
	
//	public static int takimDetayMenu(String takimIsmi) {
//			while (true){
//				System.out.println("----takim Ismi----");
//				System.out.println("1-Takim detaylarini göster");
//				System.out.println("2-Takim oyuncularını göster");
//				System.out.println("0-Ana menuye dön ");
//				System.out.println("seciminiz: ");
//				int secim = scanner.nextInt();
//				scanner.nextLine();
//
//			}
//	}
	
	
}