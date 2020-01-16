package gestion;

import java.util.ArrayList;

import pers.Employe;
import pers.Personne;
import pers.Technicien;
import util.Adresse;

public class Appli {

	public static void main(String[] args) {
		ArrayList<Personne> tpers = new  ArrayList<Personne>();
		Personne martin=new Personne();
		martin.setNom("MARTIN");
		martin.setPrenom("Pierre");
		martin.setAge(28);
		martin.setAdresse(new Adresse("3, rue de la Pompe","", 
			"75013", "Paris"));

		martin.affiche(); // MARTIN Pierre 28
		tpers.add(martin);
		
		Personne durand=new Personne("DURAND","Alain",30,
			new Adresse("Bd Gambetta","","78300","Poissy"));
		String n=durand.getNom();
		String p=durand.getPrenom();
		int a=durand.getAge();
		Adresse ad=durand.getAdresse();
		System.out.println(n+" "+p+" "+a+" "+ad.toString()); 
		// DURAND Alain 30
		tpers.add(durand);
		Employe legoff=new Employe();
		legoff.affichemp();
		legoff.setNom("LEGOFF");
		legoff.setPrenom("Eve");
		legoff.setAge(32);
		legoff.setSalaire(4000.0);
		legoff.setAdresse(ad);
		legoff.affichemp();
		tpers.add(legoff);
		Employe duval=new Employe("DUVAL","Sophie",25,3000.0);
		duval.setAdresse(new Adresse("10, rue de l'Entreprise",
			"Pole galilee 1","95000","Cergy"));
		duval.augmentation(1.0f);
		duval.affichemp();
		tpers.add(duval);
		Technicien dupuis=
			new Technicien("DUPUIS","Bernard",28,3500,"maintenance");
		dupuis.setAdresse(new Adresse("20, rue de la Republique",
				"","75011","Paris"));
		dupuis.augmentation(1.0f);
		dupuis.affichetech();
		tpers.add(dupuis);
		System.out.println("===================================");

		// A COMPLETER
		
		for (Personne object : tpers) {
			/*if (object.getClass().getSimpleName().equals("Technicien")) {
				Technicien tech = (Technicien) object;
				tech.affichetech();
			}else if (object.getClass().getSimpleName().equals("Employe")) {
				Employe emp = (Employe) object;
				emp.affichemp();
			}else if (object.getClass().getSimpleName().equals("Personne")) {
				object.affiche();
			}*/
			
			System.out.println(object.toString());
		}

		


	}

}
