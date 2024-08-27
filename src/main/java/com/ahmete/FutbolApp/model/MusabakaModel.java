package com.ahmete.FutbolApp.model;

import com.ahmete.FutbolApp.Databases.FutbolcuDB;
import com.ahmete.FutbolApp.Databases.LigDB;
import com.ahmete.FutbolApp.Databases.StadyumDB;
import com.ahmete.FutbolApp.Databases.TakimDB;
import com.ahmete.FutbolApp.entities.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class MusabakaModel {
	private DatabaseModel databaseModel;
	
	
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
	private Map<Integer, Integer> puanTablosu;

	
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
	
	public void macSonucuIsle(Istatistik evsahibiIstatistik, Istatistik misafirIstatistik, int evsahibiGol, int misafirGol) {
		
		evsahibiIstatistik.setAtilanGol(evsahibiIstatistik.getAtilanGol() + evsahibiGol);
		misafirIstatistik.setAtilanGol(misafirIstatistik.getAtilanGol() + misafirGol);
		
		if (evsahibiGol > misafirGol) {
			evsahibiIstatistik.setGalibiyet(evsahibiIstatistik.getGalibiyet() + 1);
			misafirIstatistik.setMaglubiyet(misafirIstatistik.getMaglubiyet() + 1);
		} else if (evsahibiGol < misafirGol) {
			misafirIstatistik.setGalibiyet(misafirIstatistik.getGalibiyet() + 1);
			evsahibiIstatistik.setMaglubiyet(evsahibiIstatistik.getMaglubiyet() + 1);
		} else {
			evsahibiIstatistik.setBeraberlik(evsahibiIstatistik.getBeraberlik() + 1);
			misafirIstatistik.setBeraberlik(misafirIstatistik.getBeraberlik() + 1);
		}
		evsahibiIstatistik.setYenilenGol(evsahibiIstatistik.getYenilenGol() + misafirGol);
		misafirIstatistik.setYenilenGol(misafirIstatistik.getYenilenGol() + evsahibiGol);
		
		databaseModel.istatistikDB.save(evsahibiIstatistik);
		databaseModel.istatistikDB.save(misafirIstatistik);
		
		puanTablosu.put(evsahibiIstatistik.getTakimID(), puanHesapla(evsahibiIstatistik));
		puanTablosu.put(misafirIstatistik.getTakimID(), puanHesapla(misafirIstatistik));
	}
	
	private int puanHesapla(Istatistik istatistik){
		return istatistik.getGalibiyet()*3+istatistik.getBeraberlik();
	}
}