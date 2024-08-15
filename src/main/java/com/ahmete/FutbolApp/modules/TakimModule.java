//package com.ahmete.FutbolApp.modules;
//
//import com.ahmete.FutbolApp.Databases.FutbolcuDB;
//import com.ahmete.FutbolApp.Databases.TakimDB;
//import com.ahmete.FutbolApp.entities.Takim;
//
//import java.util.List;
//import java.util.Optional;
//import java.util.Scanner;
//
//
///**
// * Kulüp modulü; Menüde; 1- Isme Gore Kulup Ara, 2- Kulupleri Listele
// *
// */
//public class TakimModule {
//	private static TakimDB takimDB;
//	private static FutbolcuDB futbolcuDB;
//	private static Scanner scanner = new Scanner(System.in);
//
//	public static void takimModule(TakimDB takimDB, FutbolcuDB futbolcuDB) {
//		TakimModule.takimDB = takimDB;
//		TakimModule.futbolcuDB = futbolcuDB;
//		int opt = 0;
//		takimMenuOptions(takimMenu());
//	}
//
//	private static int takimMenu() {
//		System.out.println("### TAKIM MENU ###");
//		System.out.println("1- Isme göre kulup ara");
//		System.out.println("2- Kulupleri listele");
//		System.out.println("0- anamenuye  don");
//		System.out.print("Lütfen bir seçenek girin: ");
//		int opt = scanner.nextInt();
//		scanner.nextLine();
//		return opt;
//	}
//	private static void takimMenuOptions(int opt){
//	switch (opt){
//		case 1 :{
//			Optional<Takim> teamOptional= ismeGoreKulupAra();
//
//			break;
//		}
//	}
//
//	}
//
//	private static Optional<Takim> ismeGoreKulupAra() {
//		System.out.println("lütfen kulup ismi giriniz");
//		List<Takim> takimList=takimDB.takimiIsmiyleBul()
//	}
//
//
//}