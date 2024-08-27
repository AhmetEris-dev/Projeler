package com.ahmete.FutbolApp.utility;

import com.ahmete.FutbolApp.entities.Musabaka;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;

public class FiksturGenerator {
	private List<Integer> takimIDleri;
	private List<DayOfWeek> gunler;
	private static Map<Integer, List<Musabaka>> fikstur = new HashMap<>();
	private LocalDate sezonBaslangic;
	private Map<Integer, String> takimIDtoIsim;
	private Map<Integer, Integer> puanTablosu = new HashMap<>();
	
	public FiksturGenerator(List<Integer> takimIDleri, LocalDate sezonBaslangic, Map<Integer, String> takimIDtoIsim) {
		this.takimIDleri = takimIDleri;
		this.sezonBaslangic = sezonBaslangic;
		this.takimIDtoIsim = takimIDtoIsim;
		this.gunler = Arrays.asList(DayOfWeek.FRIDAY, DayOfWeek.SATURDAY, DayOfWeek.SUNDAY, DayOfWeek.MONDAY);
	}
	
	public void generateFikstur() {
		int takimSayisi = takimIDleri.size();
		boolean tekMi = takimSayisi % 2 != 0;
		
		if (tekMi) {
			takimIDleri.add(-1); // "BAY" için -1 kullanarak işaretleyelim
			takimSayisi++;
		}
		
		List<Integer> originalTakimlar = new ArrayList<>(takimIDleri);
		
		// İlk yarı
		for (int hafta = 0; hafta < takimSayisi - 1; hafta++) {
			List<Musabaka> musabakalar = new ArrayList<>();
			
			for (int i = 0; i < takimSayisi / 2; i++) {
				Integer evSahibi, misafirTakim;
				
				if (hafta % 2 == 0) {
					evSahibi = takimIDleri.get(i);
					misafirTakim = takimIDleri.get(takimSayisi - 1 - i);
				} else {
					evSahibi = takimIDleri.get(takimSayisi - 1 - i);
					misafirTakim = takimIDleri.get(i);
				}
				
				if (evSahibi != -1 && misafirTakim != -1) { // BAY hafta kontrolü
					musabakalar.add(new Musabaka(evSahibi, misafirTakim, takimIDtoIsim));
				}
			}
			
			fikstur.put(hafta + 1, musabakalar);
			takimIDleri.add(1, takimIDleri.remove(takimIDleri.size() - 1));
		}
		
		// İkinci yarı
		for (int hafta = 0; hafta < takimSayisi - 1; hafta++) {
			List<Musabaka> musabakalar = new ArrayList<>();
			
			for (int i = 0; i < takimSayisi / 2; i++) {
				Integer evSahibi, misafirTakim;
				
				if (hafta % 2 == 0) {
					evSahibi = takimIDleri.get(takimSayisi - 1 - i);
					misafirTakim = takimIDleri.get(i);
				} else {
					evSahibi = takimIDleri.get(i);
					misafirTakim = takimIDleri.get(takimSayisi - 1 - i);
				}
				
				if (evSahibi != -1 && misafirTakim != -1) { // BAY hafta kontrolü
					musabakalar.add(new Musabaka(evSahibi, misafirTakim, takimIDtoIsim));
				}
			}
			
			fikstur.put(hafta + takimSayisi, musabakalar);
			takimIDleri.add(1, takimIDleri.remove(takimIDleri.size() - 1));
		}
		
		gunleriAta();
		puanTablosunuGuncelle();
	}
	
	private void gunleriAta() {
		Random random = new Random();
		for (int hafta = 1; hafta <= fikstur.size(); hafta++) {
			List<Musabaka> musabakalar = fikstur.get(hafta);
			Collections.shuffle(musabakalar);
			for (Musabaka musabaka : musabakalar) {
				DayOfWeek gun = gunler.get(random.nextInt(gunler.size()));
				LocalDate musabakaTarihi = sezonBaslangic.plusWeeks(hafta - 1).with(gun);
				musabaka.setMusabakaTarihi(musabakaTarihi);
			}
			musabakalar.sort(Comparator.comparing(Musabaka::getMusabakaTarihi));
		}
	}
	
	public void puanTablosunuGuncelle() {
		Random random = new Random();
		for (List<Musabaka> musabakalar : fikstur.values()) {
			for (Musabaka musabaka : musabakalar) {
				int sonuc = random.nextInt(3); // 0 = ev sahibi galibiyeti, 1 = misafir takım galibiyeti, 2 = beraberlik
				Integer evSahibi = musabaka.getEvSahibiID();
				Integer misafirTakim = musabaka.getMisafirTakimID();
				
				switch (sonuc) {
					case 0:
						puanTablosu.put(evSahibi, puanTablosu.getOrDefault(evSahibi, 0) + 3);
						break;
					case 1:
						puanTablosu.put(misafirTakim, puanTablosu.getOrDefault(misafirTakim, 0) + 3);
						break;
					case 2:
						puanTablosu.put(evSahibi, puanTablosu.getOrDefault(evSahibi, 0) + 1);
						puanTablosu.put(misafirTakim, puanTablosu.getOrDefault(misafirTakim, 0) + 1);
						break;
				}
			}
		}
	}
	
	public void puanTablosunuYazdir() {
		System.out.println("Puan Tablosu:");
		puanTablosu.entrySet().stream()
		           .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
		           .forEach(entry -> {
			           String takimIsmi = takimIDtoIsim.get(entry.getKey());
			           System.out.println(takimIsmi + ": " + entry.getValue() + " puan");
		           });
	}
	
	public void fiksturuYazdir() {
		for (Map.Entry<Integer, List<Musabaka>> entry : fikstur.entrySet()) {
			Integer hafta = entry.getKey();
			List<Musabaka> musabakalar = entry.getValue();
			System.out.println("Hafta: " + hafta);
			for (Musabaka musabaka : musabakalar) {
				System.out.println(musabaka.toStringFikstur());
			}
			System.out.println();
		}
	}
}