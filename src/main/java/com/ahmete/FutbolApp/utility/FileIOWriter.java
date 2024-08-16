package com.ahmete.FutbolApp.utility;

import com.ahmete.FutbolApp.Databases.FutbolcuDB;
import com.ahmete.FutbolApp.Databases.LigDB;
import com.ahmete.FutbolApp.Databases.MenajerDB;
import com.ahmete.FutbolApp.Databases.TakimDB;

import java.io.*;

public class FileIOWriter {
	private static final File dosya = new File("C:\\FutbolAPPDatabase");
	
	public static void futbolculariDosyayaYazdir(FutbolcuDB futbolcuDB) {
		File outputFile = new File(dosya, "futbolcuDB.bin");
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(outputFile))) {
			oos.writeObject(futbolcuDB.findAll());
		}
		
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void takimlariDosyayaYazdir(TakimDB takimDB) {
		File outputFile = new File(dosya, "takimDB.bin");
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(outputFile))) {
			oos.writeObject(takimDB.findAll());
		}
		
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void ligleriDosyayaYazdir(LigDB ligDB){
		File outputFile =new File(dosya,"ligDB.bin");
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(outputFile))) {
			oos.writeObject(ligDB.findAll());
		}
		
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void menajerleriDosyayaYazdir(MenajerDB menajerDB){
		File outputFile=new File(dosya,"menajerDB.bin");
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(outputFile))) {
			oos.writeObject(menajerDB.findAll());
		}
		
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void nesneleriYazdir(FutbolcuDB futbolcuDB,TakimDB takimDB,LigDB ligDB,MenajerDB menajerDB){
		futbolculariDosyayaYazdir(futbolcuDB);
		takimlariDosyayaYazdir(takimDB);
		ligleriDosyayaYazdir(ligDB);
		menajerleriDosyayaYazdir(menajerDB);
	}
	
	
}