package com.ahmete.FutbolApp.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Musabaka extends BaseEntitiy{
	static int musabakaIDCOunt=0;
	private Takim evSahibi;
	private Takim misafirTakim;
	private String stadyum;
	private int evSahibiSkor;
	private int misafirTakimSkor;
	private String hakemIsmi;
	private LocalDate musabakaTarihi;
	
	public Musabaka(Takim evSahibi, Takim misafirTakim, String stadyum, int evSahibiSkor, int misafirTakimSkor, String hakemIsmi, LocalDate musabakaTarihi) {
		this.evSahibi = evSahibi;
		this.misafirTakim = misafirTakim;
		this.stadyum = stadyum;
		this.evSahibiSkor = evSahibiSkor;
		this.misafirTakimSkor = misafirTakimSkor;
		this.hakemIsmi = hakemIsmi;
		this.musabakaTarihi = musabakaTarihi;
	}
	
	public static int getMusabakaIDCOunt() {
		return musabakaIDCOunt;
	}
	
	public static void setMusabakaIDCOunt(int musabakaIDCOunt) {
		Musabaka.musabakaIDCOunt = musabakaIDCOunt;
	}
	
	public Takim getEvSahibi() {
		return evSahibi;
	}
	
	public void setEvSahibi(Takim evSahibi) {
		this.evSahibi = evSahibi;
	}
	
	public Takim getMisafirTakim() {
		return misafirTakim;
	}
	
	public void setMisafirTakim(Takim misafirTakim) {
		this.misafirTakim = misafirTakim;
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
	
	@Override
	public String toString() {
		return "Musabaka{" + "evSahibi=" + getEvSahibi() + ", misafirTakim=" + getMisafirTakim() + ", stadyum='" + getStadyum() + '\'' + ", evSahibiSkor=" + getEvSahibiSkor() + ", misafirTakimSkor=" + getMisafirTakimSkor() + ", hakemIsmi='" + getHakemIsmi() + '\'' + ", musabakaTarihi=" + getMusabakaTarihi() + ", id=" + getId() + '}';
	}
}