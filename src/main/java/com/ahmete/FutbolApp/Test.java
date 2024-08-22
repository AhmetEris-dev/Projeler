package com.ahmete.FutbolApp;

import com.ahmete.FutbolApp.Databases.*;
import com.ahmete.FutbolApp.entities.Musabaka;
import com.ahmete.FutbolApp.model.MusabakaModel;
import com.ahmete.FutbolApp.modules.MenajerModule;
import com.ahmete.FutbolApp.modules.TakimModule;
import com.ahmete.FutbolApp.utility.DataGenerator;
import com.ahmete.FutbolApp.utility.FiksturGenerator;
import com.ahmete.FutbolApp.utility.FileIOReader;
import com.ahmete.FutbolApp.utility.FileIOWriter;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * 1 kaydedilen musabakaları tarihe göre sırala ve console cıktısı al
 * 2 musabakaları kaydet
 */

public class Test {
	private static FutbolcuDB futbolcuDB = new FutbolcuDB();
	private static TakimDB takimDB=new TakimDB();
	private static LigDB ligDB = new LigDB();
	private static MenajerDB menajerDB=new MenajerDB();
	private static StadyumDB stadyumDB=new StadyumDB();
	private static Scanner scanner=new Scanner(System.in);
	private static MusabakaDB musabakaDB=new MusabakaDB();

	
	
	public static void main(String[] args) {

//		DataGenerator.generateData(futbolcuDB, takimDB, ligDB, menajerDB,stadyumDB);
//		FileIOWriter.nesneleriYazdir(futbolcuDB, takimDB, ligDB, menajerDB,stadyumDB);
//		FileIOReader.nesneleriOku(futbolcuDB,takimDB,ligDB,menajerDB)


//		startApplication();
		
		List<Integer> takimIDleri = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19));
		LocalDate sezonBaslangic = LocalDate.of(2024, 8, 20); // Sezon başlangıç tarihi

		// FiksturGenerator örneği oluşturuluyor
		FiksturGenerator fiksturGenerator = new FiksturGenerator(takimIDleri, sezonBaslangic);
		fiksturGenerator.generateFikstur();

		// Fikstürü yazdır
		fiksturGenerator.fiksturuYazdir();
	
	
	
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
		System.out.println("3- Fiksturu goruntule");
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
			case 3:{
				
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