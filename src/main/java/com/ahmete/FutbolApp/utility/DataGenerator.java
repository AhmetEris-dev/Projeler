package com.ahmete.FutbolApp.utility;

import com.ahmete.FutbolApp.Databases.TakimDB;
import com.ahmete.FutbolApp.entities.Takim;
import com.ahmete.FutbolApp.utility.enums.ERenkler;

import java.util.ArrayList;
import java.util.List;

public class DataGenerator {
	private static TakimDB takimDB;
	public  List<Takim> takimList=new ArrayList<>();
	
	Takim takim1 = new Takim("Galatasaray",  ERenkler.KIRMIZI_SARI, "Dursun Özbek", "1905", takimDB);
	Takim takim2 = new Takim("Fenerbahçe",  ERenkler.SARI_LACIVERT, "Ali Koç", "1907", takimDB);
	Takim takim3 = new Takim("Beşiktaş",  ERenkler.SİYAH_BEYAZ, "Ahmet Nur Çebi", "1903", takimDB);
	Takim takim4 = new Takim("Trabzonspor",  ERenkler.BORDO_MAVİ, "Ahmet Ağaoğlu", "1967", takimDB);
	Takim takim5 = new Takim("Başakşehir",  ERenkler.ÇİFT_KIRMIZI, " Göksel Gümüşdağ", "2014", takimDB);
	Takim takim6 = new Takim("Alanyaspor", ERenkler.TURUNCU_LACIVERT, "Hasan Çavuşoğlu", "1948", takimDB);
	Takim takim7 = new Takim("Antalyaspor",  ERenkler.ŞERİTLİ_KIRMIZI, "Aziz Çetin", "1966", takimDB);
	Takim takim8 = new Takim("Konyaspor",  ERenkler.YEŞİL_BEYAZ, "Hilmi Kullukçu", "1922", takimDB);
	Takim takim9 = new Takim("Sivasspor",  ERenkler.KIRMIZI_BEYAZ, "Mecnun Otyakmaz", "1967", takimDB);
	Takim takim10 = new Takim("Çaykur Rizespor", ERenkler.YEŞİL_MAVİ, "İbrahim Turgut", "1953", takimDB);
	Takim takim11 = new Takim("Gaziantep FK",  ERenkler.ÇİFT_KIRMIZI, "Adil Kürükçü", "1969", takimDB);
	Takim takim12 = new Takim("İstanbul Başakşehir",  ERenkler.ÇİFT_KIRMIZI, " Göksel Gümüşdağ", "2014", takimDB);
	Takim takim13 = new Takim("MKE Ankaragücü",  ERenkler.SİYAH_KIRMIZI, "Fatih Mert", "1910", takimDB);
	Takim takim14 = new Takim("Gençlerbirliği",  ERenkler.KIRMIZI_SIYAH, "Murat Cavcav", "1923", takimDB);
	Takim takim15 = new Takim("Kayserispor",  ERenkler.KIRMIZI_SIYAH, "Berna Gözbaşı", "1966", takimDB);
	Takim takim16 = new Takim("Yeni Malatyaspor",  ERenkler.YEŞİL_SIYAH, "Adil Gevrek", "1986", takimDB);
	Takim takim17 = new Takim("Göztepe",  ERenkler.ÇİFT_KIRMIZI, "Mehmet Sepil", "1925", takimDB);
	Takim takim18 = new Takim("Denizlispor",  ERenkler.ÇİFT_KIRMIZI, "Ali İpek", "1966", takimDB);
	
	public static TakimDB getTakimDB() {
		List<Takim> takimList=takimDB.saveAll(new ArrayList<>());
		System.out.println(takimList);
		return takimDB;
	}
}