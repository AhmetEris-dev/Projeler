package com.ahmete.FutbolApp.entities;

public class Istatistik extends BaseEntity{
 static int istatistikIDCount=0;
	
	private Integer ligID;
	private Integer takimID;
	private Integer galibiyet;
	private Integer maglubiyet;
	private Integer beraberlik;
	private Integer atilanGol;
	private Integer yenilenGol;
	
	public Istatistik(Integer atilanGol, Integer beraberlik, Integer galibiyet, Integer ligID, Integer maglubiyet, Integer takimID, Integer yenilenGol) {
		this.atilanGol = atilanGol;
		this.beraberlik = beraberlik;
		this.galibiyet = galibiyet;
		this.ligID = ligID;
		this.maglubiyet = maglubiyet;
		this.takimID = takimID;
		this.yenilenGol = yenilenGol;
		this.id=++istatistikIDCount;
	}
	
	public Integer getAtilanGol() {
		return atilanGol;
	}
	
	public void setAtilanGol(Integer atilanGol) {
		this.atilanGol = atilanGol;
	}
	
	public Integer getBeraberlik() {
		return beraberlik;
	}
	
	public void setBeraberlik(Integer beraberlik) {
		this.beraberlik = beraberlik;
	}
	
	public Integer getGalibiyet() {
		return galibiyet;
	}
	
	public void setGalibiyet(Integer galibiyet) {
		this.galibiyet = galibiyet;
	}
	
	public static int getIstatistikID() {
		return istatistikIDCount;
	}
	
	public static void setIstatistikID(int istatistikID) {
		Istatistik.istatistikIDCount = istatistikID;
	}
	
	public Integer getLigID() {
		return ligID;
	}
	
	public void setLigID(Integer ligID) {
		this.ligID = ligID;
	}
	
	public Integer getMaglubiyet() {
		return maglubiyet;
	}
	
	public void setMaglubiyet(Integer maglubiyet) {
		this.maglubiyet = maglubiyet;
	}
	
	public Integer getTakimID() {
		return takimID;
	}
	
	public void setTakimID(Integer takimID) {
		this.takimID = takimID;
	}
	
	public Integer getYenilenGol() {
		return yenilenGol;
	}
	
	public void setYenilenGol(Integer yenilenGol) {
		this.yenilenGol = yenilenGol;
	}
	
	@Override
	public String toString() {
		return "Istatistik{" + "atilanGol=" + getAtilanGol() + ", ligID=" + getLigID() + ", takimID=" + getTakimID() + ", galibiyet=" + getGalibiyet() + ", maglubiyet=" + getMaglubiyet() + ", beraberlik=" + getBeraberlik() + ", yenilenGol=" + getYenilenGol() + ", id=" + getId() + '}';
	}
}