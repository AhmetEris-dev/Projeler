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

public class MusabakaModel {
	private static TakimDB takimDB;
	private static LigDB ligDB;
	private static FutbolcuDB futbolcuDB;
	
	private Integer musabakaID;
	private Takim evSahibiTakim;
	private Takim misafirTakim;
	private Stadyum stadyum;
	private int evSahibiSkor;
	private int misafirTakimSkor;
	private String hakemIsmi;
	private LocalDate musabakaTarihi;
	private Lig ligID;
	
	public MusabakaModel(TakimDB takimDB, LigDB ligDB, FutbolcuDB futbolcuDB, StadyumDB stadyumDB, Musabaka musabaka,
	                     Lig lig) {
		this.takimDB = takimDB;
		this.ligDB = ligDB;
		this.futbolcuDB = futbolcuDB;
		
		this.musabakaID = musabaka.getId();
		this.evSahibiTakim = takimDB.findById(musabaka.getEvSahibiID()).orElse(null);
		this.misafirTakim = takimDB.findById(musabaka.getMisafirTakimID()).orElse(null);
		this.ligID = ligDB.findById(lig.getId()).orElse(null);
		this.stadyum = stadyumDB.findById(musabaka.getId()).orElse(null);
		this.musabakaTarihi = musabaka.getMusabakaTarihi();
		this.evSahibiSkor = musabaka.getEvSahibiSkor();
		this.misafirTakimSkor = musabaka.getMisafirTakimSkor();
		this.hakemIsmi = musabaka.getHakemIsmi();
		
	}
	
	
	public void musabakaBilgileriniGoster(){
		System.out.println("------------------------------------");
		System.out.println("Musabaka Bilgileri");
		System.out.println("------------------------------------");
		System.out.println("Musabaka ID           : " + musabakaID);
		System.out.println("Ev Sahibi Takım       : " + (evSahibiTakim != null ? evSahibiTakim.getTakimIsim() : "Bilinmiyor"));
		System.out.println("                VS                    ");
		System.out.println("Misafir Takım         : " + (misafirTakim != null ? misafirTakim.getTakimIsim() : "Bilinmiyor"));
		System.out.println("Stadyum ismi          : " + (stadyum != null ? stadyum.getId() : "Bilinmiyor"));
		System.out.println("Musabaka Tarihi       : " + musabakaTarihi);
		System.out.println("Ev Sahibi Skor        : " + evSahibiSkor);
		System.out.println("Misafir Takım Skor     : " + misafirTakimSkor);
		System.out.println("Hakem İsmi            : " + hakemIsmi);
		System.out.println("------------------------------------");
	}
}