package com.ahmete.FutbolApp.entities;

import com.ahmete.FutbolApp.Databases.MusabakaDB;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Musabaka extends BaseEntity {
	static int musabakaIDCOunt=0;
	
	private Integer  evSahibiID;
	private Integer  misafirTakimID;
	private String stadyum;
	private int evSahibiSkor;
	private int misafirTakimSkor;
	private String hakemIsmi;
	private LocalDate musabakaTarihi; //localdate time yap
	private Integer ligID;
	//sonradan stadyumID eklenecek
	
	
	public Musabaka(Integer  evSahibiID, Integer  misafirTakimID, String stadyum, int evSahibiSkor,
	                int misafirTakimSkor,
	                String hakemIsmi, LocalDate musabakaTarihi,Integer ligID, MusabakaDB musabakaDB) {
		this.evSahibiID = evSahibiID;
		this.misafirTakimID = misafirTakimID;
		this.stadyum = stadyum;
		this.evSahibiSkor = evSahibiSkor;
		this.misafirTakimSkor = misafirTakimSkor;
		this.hakemIsmi = hakemIsmi;
		this.musabakaTarihi = musabakaTarihi;
		this.ligID=ligID;
		musabakaDB.save(this);
	}
	
	public Musabaka(Integer evSahibiID, Integer misafirTakimID) {
		this.evSahibiID=evSahibiID;
		this.misafirTakimID=misafirTakimID;
	}
	
	
	public static int getMusabakaIDCOunt() {
		return musabakaIDCOunt;
	}
	
	public static void setMusabakaIDCOunt(int musabakaIDCOunt) {
		Musabaka.musabakaIDCOunt = musabakaIDCOunt;
	}
	
	public Integer getEvSahibi() {
		return evSahibiID;
	}
	
	public void setEvSahibi(Integer  evSahibiID) {
		this.evSahibiID = evSahibiID;
	}
	
	public Integer getMisafirTakim() {
		return misafirTakimID;
	}
	
	public void setMisafirTakim(Integer misafirTakim) {
		this.misafirTakimID = misafirTakimID;
	}
	
	public String getStadyum() {
		return stadyum;
	}
	
	public void setStadyum(String stadyum) {
		this.stadyum = stadyum;
	}
	
	public int getEvSahibiSkor() {
		return evSahibiSkor;
	}
	
	public void setEvSahibiSkor(int evSahibiSkor) {
		this.evSahibiSkor = evSahibiSkor;
	}
	
	public int getMisafirTakimSkor() {
		return misafirTakimSkor;
	}
	
	public void setMisafirTakimSkor(int misafirTakimSkor) {
		this.misafirTakimSkor = misafirTakimSkor;
	}
	
	public String getHakemIsmi() {
		return hakemIsmi;
	}
	
	public void setHakemIsmi(String hakemIsmi) {
		this.hakemIsmi = hakemIsmi;
	}
	
	public LocalDate getMusabakaTarihi() {
		return musabakaTarihi;
	}
	
	public void setMusabakaTarihi(LocalDate musabakaTarihi) {
		this.musabakaTarihi = musabakaTarihi;
	}
	

	public String toStringFikstur() {
		return "Musabaka{" + "evSahibi=" + getEvSahibi()+" VS " + ", misafirTakim=" + getMisafirTakim() + ", " +
				"musabakaTarihi=" + getMusabakaTarihi() +  '}';
	}
	
	@Override
	public String toString() {
		return "Musabaka{" + "evSahibiID=" + evSahibiID + ", misafirTakimID=" + misafirTakimID + ", stadyum='" + getStadyum() + '\'' + ", evSahibiSkor=" + getEvSahibiSkor() + ", misafirTakimSkor=" + getMisafirTakimSkor() + ", hakemIsmi='" + getHakemIsmi() + '\'' + ", musabakaTarihi=" + getMusabakaTarihi() + ", ligID=" + ligID + ", evSahibi=" + getEvSahibi() + ", misafirTakim=" + getMisafirTakim() + ", id=" + getId() + '}';
	}
}