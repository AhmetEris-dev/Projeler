package com.ahmete.FutbolApp.entities;
/**
 * yetenekler
 */

import java.time.LocalDate;

public class Futbolcu extends BaseEntitiy{
	static int futbolcuIdCount=0;
	
	private String isim;
	private String soyIsim;
	private LocalDate dogumTarihi;
	private String bonservisBedeli;
	private EMevki mevki;
	private Integer takimID; //takım id tut
	
	public Futbolcu(String isim, String soyIsim, LocalDate dogumTarihi, String bonservisBedeli, EMevki mevki, Integer takimID) {
		this.isim = isim;
		this.soyIsim = soyIsim;
		this.dogumTarihi = dogumTarihi;
		this.bonservisBedeli = bonservisBedeli;
		this.mevki = mevki;
		this.takimID = takimID;
	}
	
	public static int getFutbolcuIdCount() {
		return futbolcuIdCount;
	}
	
	public static void setFutbolcuIdCount(int futbolcuIdCount) {
		Futbolcu.futbolcuIdCount = futbolcuIdCount;
	}
	
	public String getIsim() {
		return isim;
	}
	
	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	public String getSoyIsim() {
		return soyIsim;
	}
	
	public void setSoyIsim(String soyIsim) {
		this.soyIsim = soyIsim;
	}
	
	public LocalDate getDogumTarihi() {
		return dogumTarihi;
	}
	
	public void setDogumTarihi(LocalDate dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}
	
	public String getBonservisBedeli() {
		return bonservisBedeli;
	}
	
	public void setBonservisBedeli(String bonservisBedeli) {
		this.bonservisBedeli = bonservisBedeli;
	}
	
	public EMevki getMevki() {
		return mevki;
	}
	
	public void setMevki(EMevki mevki) {
		this.mevki = mevki;
	}
	
	public Integer getTakimID() {
		return takimID;
	}
	
	public void setTakimID(Integer takimID) {
		this.takimID = takimID;
	}
}