package com.ahmete.FutbolApp.Databases;

import com.ahmete.FutbolApp.entities.Stadyum;
import com.ahmete.FutbolApp.utility.DataBaseManager;

public class StadyumDB extends DataBaseManager<Stadyum> {
	
	private static final StadyumDB instance = new StadyumDB();
	
	private StadyumDB() {
	}
	
	public static StadyumDB getInstance() {
		return instance;
	}
}