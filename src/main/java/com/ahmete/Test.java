package com.ahmete;

import com.ahmete.FutbolApp.Databases.FutbolcuDB;
import com.ahmete.FutbolApp.Databases.LigDB;
import com.ahmete.FutbolApp.Databases.TakimDB;
import com.ahmete.FutbolApp.entities.Takim;
import com.ahmete.FutbolApp.modules.TakimModule;
import com.ahmete.FutbolApp.utility.DataBaseManager;
import com.ahmete.FutbolApp.utility.DataGenerator;
import com.ahmete.FutbolApp.utility.enums.EMevki;
import com.ahmete.FutbolApp.entities.Futbolcu;
import com.ahmete.FutbolApp.utility.enums.ERenkler;


import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import static com.ahmete.FutbolApp.modules.TakimModule.menu;


public class Test {
	private static FutbolcuDB futbolcuDB = new FutbolcuDB();
	private static TakimDB takimDB = new TakimDB();
	private static LigDB ligDB = new LigDB();
	private static TakimModule takimModule=new TakimModule();
	public static void main(String[] args) {
//		DataGenerator.generateTakimlar(takimDB, new LigDB());
		menu();
		
		
	}
	
	
//		FutbolcuDB futbolcuDB=new FutbolcuDB();
//
//
//		Futbolcu futbolcu=new Futbolcu("ahmet","eris",LocalDate.of(1997,9,1),20L,EMevki.KALECI,futbolcuDB);
////		System.out.println(futbolcu);
//
//
//		Takim takim=new Takim("asdsadasd",ERenkler.KIRMIZI_SARI,"asdasd","sadasd",takimDB);
//		Takim takim1=new Takim("asdsadasd",ERenkler.KIRMIZI_SARI,"asdasd","sadasd",takimDB);
//		Takim takim2=new Takim("asdsadasd",ERenkler.KIRMIZI_SARI,"asdasd","sadasd",takimDB);
//		Takim takim3=new Takim("asdsadasd",ERenkler.KIRMIZI_SARI,"asdasd","sadasd",takimDB);
//		Takim takim4=new Takim("asdsadasd",ERenkler.KIRMIZI_SARI,"asdasd","sadasd",takimDB);
//
////		System.out.println(takimDB.findAll());
//		System.out.println("renklere göre bul");
//
//		List<Takim> takimList = takimDB.renklereGoreTakimBul(ERenkler.KIRMIZI_SARI);
//		System.out.println(takimList);
//
//
//		menu();
//
//
//
//	}
//	static void menu(){
//		Scanner scanner=new Scanner(System.in);
//		int secim=-1;
//		while (secim!=0){
//			System.out.println("1-tüm kulupleri lislete");
//			System.out.println("2- kuluplerliste");
//			System.out.println("0-cıkıs yap");
//			System.out.println("secim yap");
//			secim=scanner.nextInt();
//			scanner.nextLine();
//
//			switch (secim){
//				case 1:{
//					tumkulupleriListele();
//					break;
//				}
//				case 0 :{
//					System.out.println("cıkıs");
//					break;
//				}
//				default:
//					System.out.println("secim");
//			}
//		}
//	}
//
//	public static void tumkulupleriListele() {
//		List<Takim> takimList=takimDB.findAll();
//		takimList.forEach(System.out::println);
//	}
	
}