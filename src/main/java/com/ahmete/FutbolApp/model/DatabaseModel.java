package com.ahmete.FutbolApp.model;

import com.ahmete.FutbolApp.Databases.*;

public class DatabaseModel {
	
	public final FutbolcuDB futbolcuDB = new FutbolcuDB();
	public final TakimDB takimDB=new TakimDB();
	public final LigDB ligDB = new LigDB();
	public final MenajerDB menajerDB=new MenajerDB();
	public final MusabakaDB musabakaDB=new MusabakaDB();
	public final StadyumDB stadyumDB=new StadyumDB();

}