package com.ahmete.FutbolApp.model;


import com.ahmete.FutbolApp.entities.Takim;
import com.ahmete.FutbolApp.utility.enums.EBolge;
import com.ahmete.FutbolApp.utility.enums.EKume;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class LigModel  {
	//TODO lig puan listesi
	private int ligID;
	private String ligIsmi;
	private List<Takim> takimlar;
	private String sezon;
	private EKume kume;
	private EBolge bolge;
	private LocalDate baslangicTarihi;
	Map<Integer, List<MusabakaModel>> fikstur;
	
}