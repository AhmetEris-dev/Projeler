package com.ahmete;

import com.ahmete.FutbolApp.Databases.FutbolcuDB;
import com.ahmete.FutbolApp.Databases.LigDB;
import com.ahmete.FutbolApp.Databases.MenajerDB;
import com.ahmete.FutbolApp.Databases.TakimDB;
import com.ahmete.FutbolApp.modules.MenajerModule;
import com.ahmete.FutbolApp.modules.TakimModule;
import com.ahmete.FutbolApp.utility.DataGenerator;
import com.ahmete.FutbolApp.utility.FileIOReader;
import com.ahmete.FutbolApp.utility.FileIOWriter;

import java.util.Scanner;


public class Test {
	private static FutbolcuDB futbolcuDB = new FutbolcuDB();
	private static TakimDB takimDB=new TakimDB();
	private static LigDB ligDB = new LigDB();
	private static MenajerDB menajerDB=new MenajerDB();
	private static Scanner scanner=new Scanner(System.in);
	
	public static void main(String[] args) {
	
//		DataGenerator.generateData(futbolcuDB, takimDB, ligDB, menajerDB);
//		FileIOWriter.nesneleriYazdir(futbolcuDB, takimDB, ligDB, menajerDB);
		FileIOReader.nesneleriOku(futbolcuDB,takimDB,ligDB,menajerDB);
//		ligDB.findAll().forEach(System.out::println);
//		FileIOWriter.menajerleriDosyayaYazdir(menajerDB);
//		FileIOWriter.takimlariDosyayaYazdir(takimDB);
//		FileIOWriter.futbolculariDosyayaYazdir(futbolcuDB);
//		FileIOWriter.ligleriDosyayaYazdir(ligDB);
//		FileIOReader.futbolcuDosyasiniOku(futbolcuDB);
//		futbolcuDB.findAll().forEach(System.out::println);

		startApplication();
	}
	
	public static void startApplication(){
		int opt =0;
		do {
			opt = futbolAppMenuOpsiyonlari(futbolAppMenu());
		}while (opt!=0);
	}
	
	private static int futbolAppMenu(){
		System.out.println("### Futbol App Ana Menu ###");
		System.out.println("1- Menajer Islemleri");
		System.out.println("2- Takim Islemleri");
		System.out.println("0- Cikis");
		System.out.println("Secimiz: ");
		int opt = scanner.nextInt();scanner.nextLine();
		return opt;
	}
	
	private static int futbolAppMenuOpsiyonlari(int opt){
		switch (opt){
			case 1:{
				MenajerModule.menajerModule(menajerDB,takimDB,futbolcuDB);
				break;
			}
			case 2: {
				TakimModule.takimModule(takimDB,futbolcuDB,ligDB);
				break;
			}
			case 0: {
				System.out.println("FutbolApp kapatiliyor...");
				break;
			}
			default:{
				System.out.println("Gecerli bir secim yapiniz !!");
			}
		}
		return opt;
	}
}