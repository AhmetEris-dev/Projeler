package com.ahmete.FutbolApp.entities;

import com.ahmete.FutbolApp.Databases.TakimDB;
import com.ahmete.FutbolApp.utility.enums.ERenkler;

import java.util.Arrays;

public class Takim extends BaseEntitiy {
	static int takimIdCount = 0;
	
	private String takimIsim;
	private String baskanIsmi;
	private String kurulusTarihi;
	private ERenkler renkler;
	private int menajerID=-1;
	
	public Takim(String takimIsim, ERenkler renkler, String baskanIsmi, String kurulusTarihi,TakimDB takimDB) {
		this.takimIsim = takimIsim;
		this.renkler = renkler;
		this.baskanIsmi = baskanIsmi;
		this.kurulusTarihi = kurulusTarihi;
		this.menajerID = menajerID;
		takimDB.save(this);
	}
	
	public Takim(TakimDB takimDB) {
		this.id=++takimIdCount;
		takimDB.save(this);
	}
	
	public static int getTakimIdCount() {
		return takimIdCount;
	}
	
	public static void setTakimIdCount(int takimIdCount) {
		Takim.takimIdCount = takimIdCount;
	}
	
	public String getTakimIsim() {
		return takimIsim;
	}
	
	public void setTakimIsim(String takimIsim) {
		this.takimIsim = takimIsim;
	}
	
	public String getBaskanIsmi() {
		return baskanIsmi;
	}
	
	public void setBaskanIsmi(String baskanIsmi) {
		this.baskanIsmi = baskanIsmi;
	}
	
	
	public String getKurulusTarihi() {
		return kurulusTarihi;
	}
	
	public void setKurulusTarihi(String kurulusTarihi) {
		this.kurulusTarihi = kurulusTarihi;
	}
	
	
	
	public ERenkler getRenkler() {
		return renkler;
	}
	
	public void setRenkler(ERenkler renkler) {
		this.renkler = renkler;
	}
	
	@Override
	public String toString() {
		return "Takim{" + "takimIsim='" + getTakimIsim() + '\'' + ", baskanIsmi='" + getBaskanIsmi() + '\'' + ", teknikDirektor='" + '\'' + ", kurulusTarihi='" + getKurulusTarihi() + '\'' + ", puan=" + ", renkler=" + getRenkler() + ", id=" + getId() + '}';
	}
}