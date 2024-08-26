package com.ahmete.FutbolApp.model;

import com.ahmete.FutbolApp.Databases.*;

public class DatabaseModel {
	private static final DatabaseModel instance = new DatabaseModel();
	
	public final FutbolcuDB futbolcuDB = FutbolcuDB.getInstance();
	public final TakimDB takimDB = TakimDB.getInstance();
	public final LigDB ligDB = LigDB.getInstance();
	public final MenajerDB menajerDB = MenajerDB.getInstance();
	public final MusabakaDB musabakaDB = MusabakaDB.getInstance();
	public final StadyumDB stadyumDB = StadyumDB.getInstance();
	public final IstatistikDB istatistikDB=IstatistikDB.getInstance();
	
	private DatabaseModel() {}
	
	public static DatabaseModel getInstance() {
		return instance;
	}
}