package com.ahmete.FutbolApp.model;

import com.ahmete.FutbolApp.Databases.FutbolcuDB;
import com.ahmete.FutbolApp.Databases.LigDB;
import com.ahmete.FutbolApp.Databases.StadyumDB;
import com.ahmete.FutbolApp.Databases.TakimDB;
import com.ahmete.FutbolApp.entities.Lig;
import com.ahmete.FutbolApp.entities.Musabaka;
import com.ahmete.FutbolApp.entities.Stadyum;
import com.ahmete.FutbolApp.entities.Takim;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class MusabakaModel {
	private static TakimDB takimDB;
	private static LigDB ligDB;
	private static FutbolcuDB futbolcuDB;
	
	private Integer musabakaID;
	private String evSahibiTakim;
	private String misafirTakim;
	private Stadyum stadyum;
	private int evSahibiSkor;
	private int misafirTakimSkor;
	private String hakemIsmi;
	private LocalDate musabakaTarihi;
	private Lig ligID;
	
	public MusabakaModel(TakimDB takimDB, LigDB ligDB, Musabaka musabaka, Takim evSahibi,Takim misafirTakim, Lig lig,
	                     StadyumDB stadyumDB) {
		this.evSahibiTakim =evSahibi.getTakimIsim();
		this.ligID = ligDB.findById(lig.getId()).orElse(null);
		this.misafirTakim =misafirTakim.getTakimIsim();
		this.musabakaID = musabaka.getId();
		this.musabakaTarihi = musabaka.getMusabakaTarihi();
		this.stadyum = stadyumDB.findById(evSahibi.getId()).orElse(null);
	}
	
	/**
	 * 	System.out.println("Ev Sahibi Takım       : "+evSahibiID+" VS "+"Misafir Takım : "+misafirTakimID);
	 * 	bunun yerine sadece takım isimlerini ver
	 */
	private void musabakaBilgileriniGoster(){
		System.out.println("------------------------------------");
		System.out.println("Musabaka Bilgileri");
		System.out.println("------------------------------------");
		System.out.println("Musabaka ID           : "+musabakaID);
		System.out.println("Ev Sahibi Takım       : "+evSahibiTakim+" VS "+"Misafir Takım : "+misafirTakim);
		System.out.println("Musabaka Tarihi       : "+musabakaTarihi);
		System.out.println("------------------------------------");
	}
}