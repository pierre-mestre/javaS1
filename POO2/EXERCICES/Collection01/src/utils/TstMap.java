package utils;

import java.util.ArrayList;
import java.util.HashMap;

import ga.Personne;

public class TstMap {
	public HashMap<String,Personne> compteurList = new HashMap <String,Personne>();

	public HashMap<String, Personne> getCompteurList() {
		return compteurList;
	}

	public void setCompteurList(HashMap<String, Personne> compteurList) {
		this.compteurList = compteurList;
	}

	public TstMap() {
		
		int val = 1;
		Personne tpers[]={  
				new Personne("MARTIN","Pierre",28,"1720665005002"),
				new Personne("DUVAL","Jean",30,"1700465126022"),
				new Personne("DURAND","Alain",25,"1751265678031"),
				new Personne("DUPOND","Martine",35,"2650165047008"),
				new Personne("DUPONT","Jeannine",41,"2590265028015"),
				new Personne("LEGOFF","Annie",19,"2810765089017"),
				new Personne("LEGALL","Bernard",50,"1500965051001")
			};

		
		for (int i =0; i<tpers.length; i++) {
			val = (int) (Compteur.MAX*Math.random());
			compteurList.put(tpers[i].getNumss(), tpers[i]);
		}
	}
}
