package com.ahmete.FutbolApp.entities;

public class Istatistik extends BaseEntity {
	private int galibiyet;
	private int beraberlik;
	private int maglubiyet;
	private int atilanGol;
	private int yenilenGol;
	
	public Istatistik() {
		this.galibiyet = 0;
		this.beraberlik = 0;
		this.maglubiyet = 0;
		this.atilanGol = 0;
		this.yenilenGol = 0;
	}
	
	
	public int getAveraj(){
		return atilanGol-yenilenGol;
	}
	
	
	public void galibiyetEkle() {
		this.galibiyet++;
	}
	
	public void beraberlikEkle() {
		this.beraberlik++;
	}
	
	public void maglubiyetEkle() {
		this.maglubiyet++;
	}
	
	public void golEkle(int atilan, int yenilen) {
		this.atilanGol += atilan;
		this.yenilenGol += yenilen;
	}
	
	public int getGalibiyet() {
		return galibiyet;
	}
	
	public int getBeraberlik() {
		return beraberlik;
	}
	
	public int getMaglubiyet() {
		return maglubiyet;
	}
	
	public int getAtılanGol() {
		return atilanGol;
	}
	
	public int getYenilenGol() {
		return yenilenGol;
	}
	
	public int getPuan() {
		return (galibiyet * 3) + (beraberlik * 1);
	}
}