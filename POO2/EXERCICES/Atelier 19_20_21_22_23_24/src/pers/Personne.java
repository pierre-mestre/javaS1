package pers;

import util.Adresse;

public class Personne {

	String prenom;
	String nom;
	int age;
	Adresse adresse;
	
	public Personne() {
		super();
		this.prenom = "Pierre";
		this.nom = "MESTRE";
		this.age = 20;
		this.adresse = new Adresse();
	}
	public Personne(String prenom, String nom, int age, Adresse adresse) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.age = age;
		this.adresse = new Adresse(adresse);
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	@Override
	public String toString() {
		return "Personne [prenom=" + prenom + ", nom=" + nom + ", age=" + age + ", adresse=" + adresse + "]";
	}
	public void affiche() {
		System.out.println(this.toString());
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = new Adresse(adresse);
	}
	
}
