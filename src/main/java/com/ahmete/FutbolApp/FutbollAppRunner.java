package com.ahmete.FutbolApp;

import com.ahmete.FutbolApp.model.DatabaseModel;
import com.ahmete.FutbolApp.model.LigModel;
import com.ahmete.FutbolApp.modules.MenajerModule;
import com.ahmete.FutbolApp.modules.TakimModule;
import com.ahmete.FutbolApp.utility.FileIOReader;

import java.util.*;

public class FutbollAppRunner {
	private static DatabaseModel databaseModel = DatabaseModel.getInstance();
	private static Scanner scanner = new Scanner(System.in);
	private static LigModel ligModel = new LigModel(databaseModel);
	
	
	public static void main(String[] args) {

//		DataGenerator.generateData(databaseModel);
//		FileIOWriter.nesneleriYazdir(databaseModel);
		FileIOReader.nesneleriOku(databaseModel);

		startApplication();
	 
		
	
	}
	
	public static void startApplication() {
		int opt = 0;
		do {
			opt = futbolAppMenuOpsiyonlari(futbolAppMenu());
		} while (opt != 0);
	}
	
	private static int futbolAppMenu() {
		System.out.println("### Futbol App Ana Menu ###");
		System.out.println("1- Menajer Islemleri");
		System.out.println("2- Takim Islemleri");
		System.out.println("3- Fiksturu goruntule");
		System.out.println("0- Cikis");
		System.out.println("Secimiz: ");
		int opt = scanner.nextInt();
		scanner.nextLine();
		return opt;
	}
	
	private static int futbolAppMenuOpsiyonlari(int opt) {
		switch (opt) {
			case 1: {
				MenajerModule.menajerModule(databaseModel);
				break;
			}
			case 2: {
				TakimModule.takimModule(databaseModel);
				break;
			}
			case 3:{
				ligModel.fiksturOlustur(databaseModel);
				break;
			}
			case 0: {
				System.out.println("FutbolApp kapatiliyor...");
				break;
			}
			default: {
				System.out.println("Gecerli bir secim yapiniz !!");
			}
		}
		return opt;
	}
}