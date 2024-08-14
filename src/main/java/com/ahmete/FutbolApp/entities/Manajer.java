package com.ahmete.FutbolApp.entities;

import java.time.LocalDate;

public class Manajer extends BaseEntitiy {
	static int manajerIDCount;
	
	private String isim;
	private String soyIsim;
	private long sozlesmeBedeli;
	private LocalDate dogumTarihi;
	
	public Manajer(String isim, String soyIsim, long sozlesmeBedeliy, LocalDate dogumTarihi) {
		this.isim = isim;
		this.soyIsim = soyIsim;
		this.sozlesmeBedeli = sozlesmeBedeli;
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
	
	public long getSozlesmeBedeliy() {
		return sozlesmeBedeli;
	}
	
	public void setSozlesmeBedeliy(long sozlesmeBedeliy) {
		this.sozlesmeBedeli = sozlesmeBedeliy;
	}
	
	public LocalDate getDogumTarihi() {
		return dogumTarihi;
	}
	
	public void setDogumTarihi(LocalDate dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}
	
	@Override
	public String toString() {
		return "Manajer{" + "isim='" + getIsim() + '\'' + ", soyIsim='" + getSoyIsim() + '\'' + ", sozlesmeBedeli=" + getSozlesmeBedeliy() + ", dogumTarihi=" + getDogumTarihi() + ", id=" + getId() + '}';
	}
}