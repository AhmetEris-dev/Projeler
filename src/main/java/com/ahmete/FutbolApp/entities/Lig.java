package com.ahmete.FutbolApp.entities;


import com.ahmete.FutbolApp.Databases.LigDB;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lig extends BaseEntitiy {
	static int ligIDCount = 0;
	//alperen hocaya hashmap ile olurmu sor
	
	private String ligIsmi;
	private List<Integer> takimIDLer=new ArrayList<>();
	private List<Integer> takimPuanlari=new ArrayList<>();
	
	
	public Lig(String ligIsmi, List<Integer> takimIDLer, List<Integer> takimPuanlari, LigDB ligDB) {
		this.ligIsmi = ligIsmi;
		this.takimIDLer = takimIDLer;
		this.takimPuanlari = takimPuanlari;
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
	
	public List<Integer> getTakimIDLer() {
		return takimIDLer;
	}
	
	public void setTakimIDLer(List<Integer> takimIDLer) {
		this.takimIDLer = takimIDLer;
	}
	
	public List<Integer> getTakimPuanlari() {
		return takimPuanlari;
	}
	
	public void setTakimPuanlari(List<Integer> takimPuanlari) {
		this.takimPuanlari = takimPuanlari;
	}
	
	@Override
	public String toString() {
		return "Lig{" + "ligIsmi='" + getLigIsmi() + '\'' + ", takimIDLer=" + getTakimIDLer() + ", takimPuanlari=" + getTakimPuanlari() + ", id=" + getId() + '}';
	}
}