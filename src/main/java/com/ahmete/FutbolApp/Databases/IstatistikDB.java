package com.ahmete.FutbolApp.Databases;

import com.ahmete.FutbolApp.entities.Istatistik;
import com.ahmete.FutbolApp.utility.DataBaseManager;

public class IstatistikDB extends DataBaseManager<Istatistik> {

	private  static final IstatistikDB instace=new IstatistikDB();
	
	private IstatistikDB(){}
	
	public static IstatistikDB getInstance(){
		return instace;
	}
}