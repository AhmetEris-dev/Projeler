package com.ahmete.FutbolApp.utility;

import com.ahmete.FutbolApp.Databases.*;
import com.ahmete.FutbolApp.entities.*;
import com.ahmete.FutbolApp.model.DatabaseModel;
import com.ahmete.FutbolApp.model.MusabakaModel;

import java.io.*;
import java.util.List;
import java.util.Map;

public class FileIOReader {
	
	private static final File dosya =new File("C:\\FutbolAPPDatabase");
	
	public static void futbolcuDosyasiniOku(DatabaseModel databaseModel){
		
		try(ObjectInputStream ois=
				    new ObjectInputStream(new FileInputStream("C:\\FutbolAPPDatabase\\futbolcuDB.bin"))) {
		databaseModel.futbolcuDB.saveAll((List<Futbolcu>) ois.readObject());
		}
	
		catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void takimDosyasiniOku(DatabaseModel databaseModel){
		File inputFile=new File(dosya,"takimDB.bin");
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(inputFile))) {
			databaseModel.takimDB.saveAll((List<Takim>) ois.readObject());
		}
		
		catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void ligDosyasiniOku(DatabaseModel databaseModel){
		File inputFile=new File(dosya,"ligDB.bin");
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(inputFile))) {
			databaseModel.ligDB.saveAll((List<Lig>) ois.readObject());
		}
		
		catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void menajerDosyasiniOku(DatabaseModel databaseModel){
		File inputFile=new File(dosya,"menajerDB.bin");
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(inputFile))) {
			databaseModel.menajerDB.saveAll((List<Menajer>) ois.readObject());
		}
		
		catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static void stadyumDosyasiniOku(DatabaseModel databaseModel){
		File inputFile=new File(dosya,"stadyumDB.bin");
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(inputFile))) {
			databaseModel.stadyumDB.saveAll((List<Stadyum>) ois.readObject());
		}
		
		catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
//	public static void musabakaDosyayiOku(DatabaseModel databaseModel){
//		File inputFile=new File(dosya,"musabakaDB.bin");
//		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(inputFile))) {
//			databaseModel.musabakaDB.saveAll((List<Musabaka>) ois.readObject());
//		}
//
//		catch (IOException | ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//	}
//	public static void istatistikDosyasiniOku(DatabaseModel databaseModel){
//		File inputFile=new File(dosya,"istatistikDB.bin");
//		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(inputFile))) {
//			databaseModel.istatistikDB.saveAll((List<Istatistik>) ois.readObject());
//		}
//
//		catch (IOException | ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//	}
	public void writeFiksturToFile(Map<Integer, List<MusabakaModel>> fikstur, DatabaseModel databaseModel) {
		File inputFile=new File(dosya,"musabakaDB.bin");
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(inputFile))) {
			databaseModel.musabakaDB.saveAll((List<Musabaka>) ois.readObject());
		}
		
		catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	

	public static void nesneleriOku(DatabaseModel databaseModel){
		futbolcuDosyasiniOku(databaseModel);
		takimDosyasiniOku(databaseModel);
		ligDosyasiniOku(databaseModel);
		menajerDosyasiniOku(databaseModel);
		stadyumDosyasiniOku(databaseModel);
//		musabakaDosyayiOku(databaseModel);
//		istatistikDosyasiniOku(databaseModel);
		
	}
}