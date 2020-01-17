package gestion;

import ga.Personne;
import utils.Compteur;
import utils.TstList;
import utils.TstMap;
import utils.TstTreeSet;

public class Appli {

	public static void main(String[] args) {

		TstTreeSet tlist = new TstTreeSet();
		
		for (Compteur compteur : tlist.compteurList) {
			compteur.affiche();
		}
		TstMap tstMap = new TstMap();
		
		for (Personne compteur : tstMap.compteurList.values() ) {
			System.out.println(compteur.toString());
		}
			// A COMPLETER ICI

	}
	
}
