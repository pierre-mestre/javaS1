package utils;

import java.util.ArrayList;

public class TstList {
	public ArrayList<Compteur> compteurList = new ArrayList<Compteur>();

	public TstList() {
		
		int val = 1;
		
		for (int i =0; i<10; i++) {
			val = (int) (Compteur.MAX*Math.random());
			compteurList.add(new Compteur(val));
		}
	}
	
	public void setCompteurList(ArrayList<Compteur> compteurList) {
		this.compteurList = compteurList;
	}
	
	public ArrayList<Compteur> getCompteurList() {
		return compteurList;
	}



}
