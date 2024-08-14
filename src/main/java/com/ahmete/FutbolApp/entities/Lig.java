package com.ahmete.FutbolApp.entities;


import com.ahmete.FutbolApp.Databases.LigDB;

import java.util.ArrayList;
import java.util.List;


public class Lig extends BaseEntitiy {
	static int ligIDCount = 0;
	//alperen hocaya hashmap ile olurmu sor
	
	private String ligIsmi;
	private List<Takim> takimList;
	
	
	public Lig(LigDB ligDB) {
		this.id=++ligIDCount;
		takimList=new ArrayList<>();
		ligDB.save(this);
	}
	
	public Lig(String ligIsmi,LigDB ligDB) {
		this.ligIsmi = ligIsmi;
		takimList=new ArrayList<>();
		ligDB.save(this);
	}
	
	public static int getLigIDCount() {
		return ligIDCount;
	}
	
	public static void setLigIDCount(int ligIDCount) {
		Lig.ligIDCount = ligIDCount;
	}
	
	public String getLigIsmi() {
		return ligIsmi;
	}
	
	public void setLigIsmi(String ligIsmi) {
		this.ligIsmi = ligIsmi;
	}
	
	public List<Takim> getTakimList() {
		return takimList;
	}
	
	public void setTakimList(List<Takim> takimList) {
		this.takimList = takimList;
	}
	
	@Override
	public String toString() {
		return "Lig{" + "ligIsmi='" + getLigIsmi() + '\'' + ", takimList=" + getTakimList() + ", id=" + getId() + '}';
	}
}