package com.ahmete.FutbolApp.Databases;

import com.ahmete.FutbolApp.entities.Musabaka;
import com.ahmete.FutbolApp.utility.DataBaseManager;


public class MusabakaDB extends DataBaseManager<Musabaka> {
	
	private static final MusabakaDB instance = new MusabakaDB();
	
	private MusabakaDB() {
	}
	
	public static MusabakaDB getInstance() {
		return instance;
	}
	
}