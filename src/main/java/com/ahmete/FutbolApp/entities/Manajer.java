package com.ahmete.FutbolApp.entities;

import java.time.LocalDate;

public class Manajer extends BaseEntity {
	static int manajerIDCount;
	
	private String isim;
	private String soyIsim;
//	private long sozlesmeBedeli;  buraya sonradan sözleşme entitysi gelicek
	private LocalDate dogumTarihi;
	private int takimID=-1;
	
	public Manajer(String isim, String soyIsim, LocalDate dogumTarihi) {
		this.isim = isim;
		this.soyIsim = soyIsim;
		this.dogumTarihi = dogumTarihi;
	}
	
	public static int getManajerIDCount() {
		return manajerIDCount;
	}
	
	public static void setManajerIDCount(int manajerIDCount) {
		Manajer.manajerIDCount = manajerIDCount;
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
	
	public int getTakimID() {
		return takimID;
	}
	
	public void setTakimID(int takimID) {
		this.takimID = takimID;
	}
	
	@Override
	public String toString() {
		return "Manajer{" + "isim='" + getIsim() + '\'' + ", soyIsim='" + getSoyIsim() + '\''  + ", dogumTarihi=" + getDogumTarihi() + ", id=" + getId() + '}';
	}
}