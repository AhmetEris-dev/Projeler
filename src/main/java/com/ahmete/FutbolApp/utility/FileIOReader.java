package com.ahmete.FutbolApp.utility;

import com.ahmete.FutbolApp.Databases.*;
import com.ahmete.FutbolApp.entities.Futbolcu;
import com.ahmete.FutbolApp.entities.Lig;
import com.ahmete.FutbolApp.entities.Menajer;
import com.ahmete.FutbolApp.entities.Takim;

import java.io.*;
import java.util.List;

public class FileIOReader {
	
	private static final File dosya =new File("C:\\FutbolAPPDatabase");
	
	public static void futbolcuDosyasiniOku(FutbolcuDB futbolcuDB){
		
		try(ObjectInputStream ois=
				    new ObjectInputStream(new FileInputStream("C:\\FutbolAPPDatabase\\futbolcuDB.bin"))) {
		futbolcuDB.saveAll((List<Futbolcu>) ois.readObject());
		}
	
		catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void takimDosyasiniOku(TakimDB takimDB){
		File inputFile=new File(dosya,"takimDB.bin");
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(inputFile))) {
			takimDB.saveAll((List<Takim>) ois.readObject());
		}
		
		catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void ligDosyasiniOku(LigDB ligDB){
		File inputFile=new File(dosya,"ligDB.bin");
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(inputFile))) {
			ligDB.saveAll((List<Lig>) ois.readObject());
		}
		
		catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void menajerDosyasiniOku(MenajerDB menajerDB){
		File inputFile=new File(dosya,"menajerDB.bin");
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(inputFile))) {
			menajerDB.saveAll((List<Menajer>) ois.readObject());
		}
		
		catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void fiksturDosyasiniOku(FiksturGeneratorDB fiksturGeneratorDB){
		File inputFile=new File(dosya,"fiksturDB.bin");
		try (ObjectInputStream ois =new ObjectInputStream(new FileInputStream(inputFile))){
			fiksturGeneratorDB.saveAll((List<FiksturGenerator>) ois.readObject());
		}
		
		catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static void nesneleriOku(FutbolcuDB futbolcuDB, TakimDB takimDB, LigDB ligDB, MenajerDB menajerDB,
	                                FiksturGeneratorDB fiksturGeneratorDB){
		futbolcuDosyasiniOku(futbolcuDB);
		takimDosyasiniOku(takimDB);
		ligDosyasiniOku(ligDB);
		menajerDosyasiniOku(menajerDB);
		fiksturDosyasiniOku(fiksturGeneratorDB);
	}
}