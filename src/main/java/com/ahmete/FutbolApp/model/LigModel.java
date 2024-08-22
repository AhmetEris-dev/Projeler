package com.ahmete.FutbolApp.model;


import com.ahmete.FutbolApp.entities.Lig;
import com.ahmete.FutbolApp.entities.Takim;
import com.ahmete.FutbolApp.utility.enums.EBolge;
import com.ahmete.FutbolApp.utility.enums.EKume;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class LigModel {
	//TODO lig puan listesi
	private int ligID;
	private String ligIsmi;
	private List<Takim> takimlar;
	private String sezon;
	private EKume kume;
	private EBolge bolge;
	private LocalDate baslangicTarihi;
	private Map<Integer, List<MusabakaModel>> fikstur;
	
	public LigModel(Lig lig, List<Takim> takimlar) {
		this.baslangicTarihi = lig.getBaslangicTarihi();
		this.bolge = lig.getBolge();
		this.fikstur = null; // Burada `fikstur` değerini uygun şekilde başlatın
		this.kume = lig.getKume();
		this.ligID = lig.getId();
		this.ligIsmi = lig.getLigIsmi();
		this.sezon = lig.getSezon();
		this.takimlar = takimlar;
	}
	
	public void ligBilgileriniGoster() {
		System.out.println("----------------------------");
		System.out.println("LIG BILGILERI");
		System.out.println("----------------------------");
		System.out.println("Lig ID                   : " + ligID);
		System.out.println("Lig Ismi                 : " + ligIsmi);
		System.out.println("Lig Bolge                : " + bolge);
		System.out.println("Lig Kume                 : " + kume);
		System.out.println("Lig Sezon                : " + sezon);
		System.out.println("Lig Baslangic tarihi     : " + baslangicTarihi);
		System.out.println("Takimlar                 : " + takimlar);
		
		if (fikstur != null) {
			System.out.println("Fikstur:");
			for (Map.Entry<Integer, List<MusabakaModel>> entry : fikstur.entrySet()) {
				System.out.println("Hafta: " + entry.getKey());
				for (MusabakaModel musabaka : entry.getValue()) {
					musabaka.musabakaBilgileriniGoster();
				}
			}
		} else {
			System.out.println("Fikstur bilgisi mevcut değil.");
		}
		
		System.out.println("----------------------------");
	}
	
	public void setFikstur(Map<Integer, List<MusabakaModel>> fikstur) {
		this.fikstur = fikstur;
	}
}