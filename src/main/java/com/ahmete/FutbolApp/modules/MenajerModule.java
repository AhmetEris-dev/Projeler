package com.ahmete.FutbolApp.modules;

import com.ahmete.FutbolApp.Databases.FutbolcuDB;
import com.ahmete.FutbolApp.Databases.MenajerDB;
import com.ahmete.FutbolApp.Databases.TakimDB;
import com.ahmete.FutbolApp.entities.Menajer;
import com.ahmete.FutbolApp.entities.Takim;

import java.util.Optional;
import java.util.Scanner;

public class MenajerModule {
	
	private static MenajerDB menajerDB;
	private static TakimDB takimDB;
	private static FutbolcuDB futbolcuDB;
	private static Optional<Menajer> aktifMenajer=Optional.empty();  // aktif menajer bilgisini burada tutuyoruz
	private static final Scanner scanner=new Scanner(System.in);
	
	public static void  menajerModule(MenajerDB menajerDB,TakimDB takimDB,FutbolcuDB futbolcuDB){
		MenajerModule.menajerDB=menajerDB;
		MenajerModule.takimDB=takimDB;
		MenajerModule.futbolcuDB=futbolcuDB;
		
		int opt;
		do {
			
			opt=menajerGirisMenu();
			menajerGirisMenuOpsiyonlari(opt);
		}while (opt!=0);
	}
	
	private static Optional<Menajer> girisYap(){
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
	private static int menajerGirisMenu(){
		System.out.println("-----Menajer Giris Menu-----");
		System.out.println("1-Giris Yap");
		System.out.println("0-Geri dön");
		System.out.print("seciminiz: ");
		int opt =scanner.nextInt();
		scanner.nextLine();
		return opt;
	}
	private static int menajerGirisMenuOpsiyonlari(int opt){
		switch (opt){
			case 1:{
				girisYap();
				
				
				
			}
		}
		return opt;
	}
	
	
}