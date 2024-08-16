package com.ahmete.FutbolApp.utility;

import com.ahmete.FutbolApp.Databases.FutbolcuDB;

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
}