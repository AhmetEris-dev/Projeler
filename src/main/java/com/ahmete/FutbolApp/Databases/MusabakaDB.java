package com.ahmete.FutbolApp.Databases;

import com.ahmete.FutbolApp.entities.Musabaka;
import com.ahmete.FutbolApp.utility.DataBaseManager;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class MusabakaDB extends DataBaseManager<Musabaka> {
	
	private static final MusabakaDB instance = new MusabakaDB();
	
	private MusabakaDB() {
	}
	
	public static MusabakaDB getInstance() {
		return instance;
	}
	
}