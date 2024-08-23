package com.ahmete.FutbolApp;

import com.ahmete.FutbolApp.Databases.*;
import com.ahmete.FutbolApp.entities.Lig;
import com.ahmete.FutbolApp.entities.Takim;
import com.ahmete.FutbolApp.model.DatabaseModel;
import com.ahmete.FutbolApp.modules.MenajerModule;
import com.ahmete.FutbolApp.modules.TakimModule;
import com.ahmete.FutbolApp.utility.DataGenerator;
import com.ahmete.FutbolApp.utility.FiksturGenerator;
import com.ahmete.FutbolApp.utility.FileIOReader;
import com.ahmete.FutbolApp.utility.FileIOWriter;
import com.ahmete.FutbolApp.utility.enums.EBolge;
import com.ahmete.FutbolApp.utility.enums.EKume;
import com.ahmete.FutbolApp.utility.enums.ERenkler;

import java.time.LocalDate;
import java.util.*;

public class Test {
	private static DatabaseModel databaseModel=new DatabaseModel();
	private static Scanner scanner=new Scanner(System.in);
	

	
	
	public static void main(String[] args) {

//		DataGenerator.generateData(databaseModel);
//		FileIOWriter.nesneleriYazdir(databaseModel);
		FileIOReader.nesneleriOku(databaseModel);

		startApplication();
		
	 
//		Takim takim1 = new Takim("Galatasaray",1, ERenkler.KIRMIZI_SARI, "Dursun Özbek", "1905", takimDB);
//		Takim takim2 = new Takim("Fenerbahçe",2, ERenkler.SARI_LACIVERT, "Ali Koç", "1907", takimDB);
//		Takim takim3 = new Takim("Beşiktaş",3, ERenkler.SIYAH_BEYAZ, "Ahmet Nur Çebi", "1903", takimDB);
//		Takim takim4 = new Takim("Trabzonspor",4, ERenkler.BORDO_MAVI, "Ahmet Ağaoğlu", "1967", takimDB);
//		Takim takim5 = new Takim("Başakşehir",5, ERenkler.CIFT_KIRMIZI, "Göksel Gümüşdağ", "2014", takimDB);
//		Takim takim6 = new Takim("Alanyaspor",6, ERenkler.TURUNCU_LACIVERT, "Hasan Çavuşoğlu", "1948", takimDB);
//		Takim takim7 = new Takim("Antalyaspor",7, ERenkler.SERITLI_KIRMIZI, "Aziz Çetin", "1966", takimDB);
//		Takim takim8 = new Takim("Konyaspor",8, ERenkler.YESIL_BEYAZ, "Hilmi Kullukçu", "1922", takimDB);
//		Takim takim9 = new Takim("Sivasspor",9, ERenkler.KIRMIZI_BEYAZ, "Mecnun Otyakmaz", "1967", takimDB);
//		Takim takim10 = new Takim("Çaykur Rizespor",10, ERenkler.YESIL_MAVI, "İbrahim Turgut", "1953", takimDB);
//		Takim takim11 = new Takim("Gaziantep FK",11, ERenkler.CIFT_KIRMIZI, "Adil Kürükçü", "1969", takimDB);
//		Takim takim12 = new Takim("İstanbul Başakşehir",12, ERenkler.CIFT_KIRMIZI, "Göksel Gümüşdağ", "2014", takimDB);
//		Takim takim13 = new Takim("MKE Ankaragücü",13, ERenkler.SIYAH_KIRMIZI, "Fatih Mert", "1910", takimDB);
//		Takim takim14 = new Takim("Gençlerbirliği",14, ERenkler.KIRMIZI_SIYAH, "Murat Cavcav", "1923", takimDB);
//		Takim takim15 = new Takim("Kayserispor",15, ERenkler.KIRMIZI_SIYAH, "Berna Gözbaşı", "1966", takimDB);
//		Takim takim16 = new Takim("Yeni Malatyaspor",16, ERenkler.YESIL_SIYAH, "Adil Gevrek", "1986", takimDB);
//		Takim takim17 = new Takim("Göztepe",17, ERenkler.CIFT_KIRMIZI, "Mehmet Sepil", "1925", takimDB);
//		Takim takim18 = new Takim("Denizlispor",18, ERenkler.CIFT_KIRMIZI, "Ali İpek", "1966", takimDB);
//		Takim takim19 = new Takim("Bodrum FK",19, ERenkler.YESIL_BEYAZ, "Fikret Öztürk", "1931", takimDB);
//
//
//		Lig turkiyeSuperLigi = new Lig("Türkiye Süper Lig", "sezon1", EKume.TRENDYOL_SUPER_LIG, EBolge.TURKIYE, ligDB,
//		                               LocalDate.of(2024, 8, 20));
//
//
//		turkiyeSuperLigi.getTakimIDList()
//		                .addAll(List.of(takim1.getId(), takim2.getId(), takim3.getId(), takim4.getId(), takim5.getId(),
//		                                takim6.getId(), takim7.getId(), takim8.getId(), takim9.getId(), takim10.getId(),
//		                                takim11.getId(), takim12.getId(), takim13.getId(), takim14.getId(), takim15.getId(),
//		                                takim16.getId(), takim17.getId(), takim18.getId(), takim19.getId()));
//
//
//		Map<Integer, String> takimIdToNameMap = new HashMap<>();
//		takimIdToNameMap.put(takim1.getId(), takim1.getTakimIsim());
//		takimIdToNameMap.put(takim2.getId(), takim2.getTakimIsim());
//		takimIdToNameMap.put(takim3.getId(), takim3.getTakimIsim());
//		takimIdToNameMap.put(takim4.getId(), takim4.getTakimIsim());
//		takimIdToNameMap.put(takim5.getId(), takim5.getTakimIsim());
//		takimIdToNameMap.put(takim6.getId(), takim6.getTakimIsim());
//		takimIdToNameMap.put(takim7.getId(), takim7.getTakimIsim());
//		takimIdToNameMap.put(takim8.getId(), takim8.getTakimIsim());
//		takimIdToNameMap.put(takim9.getId(), takim9.getTakimIsim());
//		takimIdToNameMap.put(takim10.getId(), takim10.getTakimIsim());
//		takimIdToNameMap.put(takim11.getId(), takim11.getTakimIsim());
//		takimIdToNameMap.put(takim12.getId(), takim12.getTakimIsim());
//		takimIdToNameMap.put(takim13.getId(), takim13.getTakimIsim());
//		takimIdToNameMap.put(takim14.getId(), takim14.getTakimIsim());
//		takimIdToNameMap.put(takim15.getId(), takim15.getTakimIsim());
//		takimIdToNameMap.put(takim16.getId(), takim16.getTakimIsim());
//		takimIdToNameMap.put(takim17.getId(), takim17.getTakimIsim());
//		takimIdToNameMap.put(takim18.getId(), takim18.getTakimIsim());
//		takimIdToNameMap.put(takim19.getId(), takim19.getTakimIsim());
//
//
//		FiksturGenerator fiksturGenerator = new FiksturGenerator(turkiyeSuperLigi.getTakimIDList(), LocalDate.of(2024, 8, 20), takimIdToNameMap);
//		fiksturGenerator.generateFikstur();
//
//
//		fiksturGenerator.fiksturuYazdir(takimIdToNameMap);
//
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
				MenajerModule.menajerModule(databaseModel);
				break;
			}
			case 2: {
				TakimModule.takimModule(databaseModel);
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