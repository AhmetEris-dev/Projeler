package com.ahmete.FutbolApp.Databases;

import com.ahmete.FutbolApp.entities.Lig;
import com.ahmete.FutbolApp.utility.DataBaseManager;


public class LigDB extends DataBaseManager<Lig> {
	
	private static final LigDB instance = new LigDB();
	
	private LigDB() {
	}
	
	public static LigDB getInstance() {
		return instance;
	}
	
}