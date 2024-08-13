package com.ahmete.FutbolApp.entities;

import java.util.ArrayList;
import java.util.List;

public class Lig extends BaseEntitiy{
static int ligIDCount=0;

private String ligIsmi;
	
	public Lig(String ligIsmi) {
		this.ligIsmi = ligIsmi;
		this.id=++ligIDCount;
	}
	
	public String getLigIsmi() {
		return ligIsmi;
	}
	
	public void setLigIsmi(String ligIsmi) {
		this.ligIsmi = ligIsmi;
	}
}