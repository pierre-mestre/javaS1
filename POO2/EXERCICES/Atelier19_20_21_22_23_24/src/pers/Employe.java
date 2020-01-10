package pers;

import util.Adresse;

public class Employe extends Personne {
	double salaire;
	
	public Employe() {
		super();
		this.salaire = 1521;
	}
	public Employe(Double salaire) {
		super();
		this.salaire = salaire;
	}
	public Employe(String prenom, String nom, int age, Double salaire) {
		super(prenom, nom, age, new Adresse());
		this.salaire = salaire;
	}
	public Employe(String prenom, String nom, int age, Adresse adresse, Double salaire) {
		super(prenom, nom, age, adresse);
		this.salaire = salaire;
	}
	
	
	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}

	@Override
	public String getPrenom() {
		// TODO Auto-generated method stub
		return super.getPrenom();
	}

	@Override
	public void setPrenom(String prenom) {
		// TODO Auto-generated method stub
		super.setPrenom(prenom);
	}

	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return super.getNom();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " salaire : "+salaire;
	}

	@Override
	public void affiche() {
		// TODO Auto-generated method stub
		super.affiche();
	}

	@Override
	public void setNom(String nom) {
		// TODO Auto-generated method stub
		super.setNom(nom);
	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return super.getAge();
	}

	@Override
	public void setAge(int age) {
		// TODO Auto-generated method stub
		super.setAge(age);
	}

	@Override
	public Adresse getAdresse() {
		// TODO Auto-generated method stub
		return super.getAdresse();
	}

	@Override
	public void setAdresse(Adresse adresse) {
		// TODO Auto-generated method stub
		super.setAdresse(adresse);
	}
	public void affichemp() {
		System.out.println(this.toString());
		
	}

}
