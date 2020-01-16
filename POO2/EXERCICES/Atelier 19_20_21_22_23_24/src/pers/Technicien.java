package pers;

import util.Adresse;

public class Technicien extends Employe {

	private String specialite;
	public static final double prime = 50;

	
	public Technicien() {
		// TODO Auto-generated constructor stub
	}

	public Technicien(String nom, String prenom, int age, double d) {
		super(nom, prenom, age, d);
		// TODO Auto-generated constructor stub
	}

	public Technicien(String nom, String prenom, int age, double d, String spec) {
		super(nom, prenom, age, d);
		this.specialite = spec;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	public void affichetech() {
		super.affiche();
		System.out.println("Spécialité : " + specialite);		
	}
	
	public void augmentation(float pc) {
		super.augmentation(pc);
		setSalaire(salaire + Technicien.prime);
	}
	
}