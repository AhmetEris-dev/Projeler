package com.ahmete.FutbolApp.modules;

import com.ahmete.FutbolApp.Databases.FutbolcuDB;
import com.ahmete.FutbolApp.Databases.MenajerDB;
import com.ahmete.FutbolApp.Databases.TakimDB;
import com.ahmete.FutbolApp.entities.Futbolcu;
import com.ahmete.FutbolApp.entities.Menajer;
import com.ahmete.FutbolApp.model.DatabaseModel;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class MenajerModule {
	
	private static DatabaseModel databaseModel;
	private static Optional<Menajer> aktifMenajer = Optional.empty();  // aktif menajer bilgisini burada tutuyoruz
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void menajerModule(DatabaseModel dbModel) {
		databaseModel = dbModel;
		
		int opt;
		do {
			
			
			opt =menajerGirisMenuOpsiyonlari(menajerGirisMenu());
		} while (opt != 0);
	}
	
	private static Optional<Menajer> girisYap() {
		MenajerDB menajerDB = databaseModel.menajerDB;
		while (true) {
			System.out.println("lütfen menajer ID giriniz");
			int id = scanner.nextInt();
			scanner.nextLine();
			System.out.println("lütfen menajer sifrenizi giriniz");
			String sifre = scanner.nextLine();
			Optional<Menajer> menager1 = menajerDB.meajerIdVeSifresiniBul(id, sifre);
			
			if (menager1.isPresent()) {
				aktifMenajer = menager1;
				System.out.println("başarılı bir şekilde giriş yaptınız");
				return menager1;
			}
			else {
				System.out.println("giriş yapılamadı.Lütfen tekrar deneyiniz");
			}
			
		}
	}
	
	private static int menajerGirisMenu() {
		System.out.println("-----Menajer Giris Menu-----");
		System.out.println("1-Giris Yap");
		System.out.println("0-Geri dön");
		System.out.print("seciminiz: ");
		int opt = scanner.nextInt();
		scanner.nextLine();
		return opt;
	}
	
	private static int menajerGirisMenuOpsiyonlari(int opt) {
		switch (opt) {
			case 1: {
				girisYap();
				menajerMenuOpsiyonlari(menajerMenu());
				break;
			}
			case 2: {
				System.out.println("Ana menuye donuluyor");
				break;
			}
			case 0: {
				System.out.println("0--Ust menuye donuluyor ");
				break;
			}
		}
		return opt;
		
	}
	
	private static int menajerMenu() {
		
		System.out.println("-----Menajer Menu-----");
		System.out.println("1-Takimimin detaylarını goruntuleyin");
		System.out.println("2-Takimimin futbolcularımı goruntuleyin");
		System.out.println("3-Diğer takimlarin özet bilgilerini goruntuleyin");
		System.out.println("4-Diğer takimlarin futbolcularının özet bilgilerini goruntuleyin");
		System.out.println("0-Cıkıs yap");
		System.out.print("seciminiz: ");
		int opt = scanner.nextInt();
		scanner.nextLine();
		return opt;
	}
	
	private static int menajerMenuOpsiyonlari(int opt) {
		switch (opt) {
			case 1: {
				kulubumunDetaylariniGoruntule();
				menajerMenuOpsiyonlari( menajerMenu());
				break;
			}
			case 2: {
				kulubumunFutbolculariniGoruntule();
				menajerMenuOpsiyonlari( menajerMenu());
				break;
			}
			case 3: {
				takimlerinOzetBilgileriniGoruntule();
				takimIdyeGoreFutbolcularOzetBilgi();
				menajerMenuOpsiyonlari( menajerMenu());
				break;
			}
			case 0: {
				System.out.println("Ust menuye donuluyor");
			}
			default:
				System.out.println("Geçerli bir seçim yapınız!!");
		}
		return opt;
	}
	
	private static void takimIdyeGoreFutbolcularOzetBilgi() {
		FutbolcuDB futbolcuDB = databaseModel.futbolcuDB;
		System.out.println("Futbolcularini goruntulemek istediginiz takimi seciniz:");
		int takimId = scanner.nextInt();
		scanner.nextLine();
		List<Futbolcu> futbolcuList = futbolcuDB.takimIdyeGoreFutbolculariListele(takimId);
		futbolcuList.forEach(futbolcu -> System.out.println(futbolcu.toStringOzet()));
	}
	
	private static void takimlerinOzetBilgileriniGoruntule() {
		TakimDB takimDB = databaseModel.takimDB;
		takimDB.takimlarIsimIdList();
	}
	
	private static void kulubumunDetaylariniGoruntule() {
		TakimDB takimDB = databaseModel.takimDB;
		if (aktifMenajer.isEmpty()) {
			System.out.println("lütfen giriş yapınız");
		}
		takimDB.menajerinTakimIdsineGoreTakimBul(aktifMenajer.get().getTakimID());
	}
	
	private static void kulubumunFutbolculariniGoruntule() {
		FutbolcuDB futbolcuDB = databaseModel.futbolcuDB;
		
		if (aktifMenajer.isEmpty()) {
			System.out.println("lütfen giriş yapınız");
		}
		List<Futbolcu> takiminFutbolculari = futbolcuDB.takimIdyeGoreFutbolcuBul(aktifMenajer.get().getTakimID());
		takiminFutbolculari.forEach(System.out::println);
	}
}