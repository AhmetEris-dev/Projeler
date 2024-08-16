package com.ahmete;

import com.ahmete.FutbolApp.Databases.FutbolcuDB;
import com.ahmete.FutbolApp.Databases.LigDB;
import com.ahmete.FutbolApp.Databases.MenajerDB;
import com.ahmete.FutbolApp.Databases.TakimDB;
import com.ahmete.FutbolApp.modules.TakimModule;
import com.ahmete.FutbolApp.utility.DataGenerator;




public class Test {
	private static FutbolcuDB futbolcuDB = new FutbolcuDB();
	private static TakimDB takimDB=new TakimDB();
	private static LigDB ligDB = new LigDB();
	private static MenajerDB menajerDB=new MenajerDB();
	
	public static void main(String[] args) {
		DataGenerator.generateData(futbolcuDB,takimDB,ligDB,menajerDB);
		starApplication();
	}
	public static void starApplication(){
		int opt =0;
		do {
			TakimModule.takimModule(takimDB,futbolcuDB,ligDB);
		}while (opt!=0);
		
	}
}