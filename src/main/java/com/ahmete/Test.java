package com.ahmete;

import com.ahmete.FutbolApp.Databases.FutbolcuDB;
import com.ahmete.FutbolApp.Databases.LigDB;
import com.ahmete.FutbolApp.Databases.MenajerDB;
import com.ahmete.FutbolApp.Databases.TakimDB;
import com.ahmete.FutbolApp.modules.TakimModule;
import com.ahmete.FutbolApp.utility.DataGenerator;
import com.ahmete.FutbolApp.utility.FileIOReader;
import com.ahmete.FutbolApp.utility.FileIOWriter;


public class Test {
	private static FutbolcuDB futbolcuDB = new FutbolcuDB();
	private static TakimDB takimDB=new TakimDB();
	private static LigDB ligDB = new LigDB();
	private static MenajerDB menajerDB=new MenajerDB();
	
	public static void main(String[] args) {
//		DataGenerator.generateData(futbolcuDB,takimDB,ligDB,menajerDB);
//		FileIOWriter.nesneleriYazdir(futbolcuDB,takimDB,ligDB,menajerDB);
		FileIOReader.nesneleriOku(futbolcuDB,takimDB,ligDB,menajerDB);
//		ligDB.findAll().forEach(System.out::println);
//		FileIOWriter.menajerleriDosyayaYazdir(menajerDB);
//		FileIOWriter.takimlariDosyayaYazdir(takimDB);
//		FileIOWriter.futbolculariDosyayaYazdir(futbolcuDB);
//		FileIOWriter.ligleriDosyayaYazdir(ligDB);
//
		starApplication();
	}
	
	public static void starApplication(){
		int opt =0;
		do {
			TakimModule.takimModule(takimDB,futbolcuDB,ligDB);
		}while (opt!=0);
		
	}
}