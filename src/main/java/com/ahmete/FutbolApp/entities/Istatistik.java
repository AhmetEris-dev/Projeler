package com.ahmete.FutbolApp.entities;

public class Istatistik extends BaseEntity {
	private int galibiyet;
	private int mağlubiyet;
	private int beraberlik;
	private int atilanGol;
	private int yenilenGol;
	
	public Istatistik() {
		this.galibiyet = 0;
		this.mağlubiyet = 0;
		this.beraberlik = 0;
		this.atilanGol = 0;
		this.yenilenGol = 0;
	}
	
	public void galibiyetEkle() {
		this.galibiyet++;
	}
	
	public void maglubiyetEkle() {
		this.mağlubiyet++;
	}
	
	public void beraberlikEkle() {
		this.beraberlik++;
	}
	
	public void golEkle(int atilanGol, int yenilenGol) {
		this.atilanGol += atilanGol;
		this.yenilenGol += yenilenGol;
	}
	
	public int getPuan() {
		return (galibiyet * 3) + (beraberlik);
	}
	
	public int getGalibiyet() {
		return galibiyet;
	}
	
	public int getMaglubiyet() {
		return mağlubiyet;
	}
	
	public int getBeraberlik() {
		return beraberlik;
	}
	
	public int getAtılanGol() {
		return atilanGol;
	}
	
	public int getYenilenGol() {
		return yenilenGol;
	}
}