package com.ahmete;

import com.ahmete.FutbolApp.Databases.FutbolcuDB;
import com.ahmete.FutbolApp.Databases.LigDB;
import com.ahmete.FutbolApp.Databases.MusabakaDB;
import com.ahmete.FutbolApp.Databases.TakimDB;
import com.ahmete.FutbolApp.entities.Lig;
import com.ahmete.FutbolApp.entities.Musabaka;
import com.ahmete.FutbolApp.entities.Takim;
import com.ahmete.FutbolApp.utility.DataGenerator;
import com.ahmete.FutbolApp.utility.enums.EMevki;
import com.ahmete.FutbolApp.entities.Futbolcu;
import com.ahmete.FutbolApp.utility.enums.ERenkler;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;


public class Test {
	static  TakimDB takimDB=new TakimDB();
	public static void main(String[] args) {
		
		FutbolcuDB futbolcuDB=new FutbolcuDB();
	
		
		Futbolcu futbolcu=new Futbolcu("ahmet","eris",LocalDate.of(1997,9,1),"20m",EMevki.KALECI,futbolcuDB);
//		System.out.println(futbolcu);
		
//		Takim takim=new Takim("gala","asdasdsad","asdasdasd",ERenkler.KIRMIZI_SARI,takimDB);
//		Takim takim1=new Takim("gala","asdasdsad","asdasdasd",ERenkler.SARI_LACIVERT,takimDB);
//		Takim takim2=new Takim("gala","asdasdsad","asdasdasd",ERenkler.KIRMIZI_SARI,takimDB);
////		System.out.println(takimDB.findAll());
		System.out.println("renklere göre bul");
		
		List<Takim> takimList = takimDB.renklereGoreTakimBul(ERenkler.KIRMIZI_SARI);
		System.out.println(takimList);


//		menu();
		
		DataGenerator.getTakimDB();
		
	}
	static void menu(){
		Scanner scanner=new Scanner(System.in);
		int secim=-1;
		while (secim!=0){
			System.out.println("1-tüm kulupleri lislete");
			System.out.println("2- kuluplerliste");
			System.out.println("0-cıkıs yap");
			System.out.println("secim yap");
			secim=scanner.nextInt();
			scanner.nextLine();
			
			switch (secim){
				case 1:{
					tumkulupleriListele2();
					break;
				}
				case 0 :{
					System.out.println("cıkıs");
					break;
				}
				default:
					System.out.println("secim");
			}
		}
	}
	
	public static void tumkulupleriListele2() {
		List<Takim> takimList=takimDB.findAll();
		takimList.forEach(System.out::println);
	}
	
}