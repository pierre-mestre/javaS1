/*
 * 
 */
package pers;

import util.Adresse;

// TODO: Auto-generated Javadoc
/**
 * The Class Employe.
 */
public class Employe extends Personne {
	
	/** The salaire. */
	protected double salaire;
	
	/**
	 * Instantiates a new employe.
	 */
	public Employe() {
		super();
		this.salaire = 1521;
	}
	
	/**
	 * Instantiates a new employe.
	 *
	 * @param salaire the salaire
	 */
	public Employe(Double salaire) {
		super();
		this.salaire = salaire;
	}
	
	/**
	 * Instantiates a new employe.
	 *
	 * @param prenom the prenom
	 * @param nom the nom
	 * @param age the age
	 * @param salaire the salaire
	 */
	public Employe(String prenom, String nom, int age, Double salaire) {
		super(prenom, nom, age, new Adresse());
		this.salaire = salaire;
	}
	
	/**
	 * Instantiates a new employe.
	 *
	 * @param prenom the prenom
	 * @param nom the nom
	 * @param age the age
	 * @param adresse the adresse
	 * @param salaire the salaire
	 */
	public Employe(String prenom, String nom, int age, Adresse adresse, Double salaire) {
		super(prenom, nom, age, adresse);
		this.salaire = salaire;
	}
	
	
	/**
	 * Sets the salaire.
	 *
	 * @param salaire the new salaire
	 */
	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}

	/**
	 * Gets the prenom.
	 *
	 * @return the prenom
	 */
	@Override
	public String getPrenom() {
		// TODO Auto-generated method stub
		return super.getPrenom();
	}

	/**
	 * Sets the prenom.
	 *
	 * @param prenom the new prenom
	 */
	@Override
	public void setPrenom(String prenom) {
		// TODO Auto-generated method stub
		super.setPrenom(prenom);
	}

	/**
	 * Gets the nom.
	 *
	 * @return the nom
	 */
	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return super.getNom();
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " salaire : "+salaire;
	}

	/**
	 * Affiche.
	 */
	@Override
	public void affiche() {
		// TODO Auto-generated method stub
		super.affiche();
	}

	/**
	 * Sets the nom.
	 *
	 * @param nom the new nom
	 */
	@Override
	public void setNom(String nom) {
		// TODO Auto-generated method stub
		super.setNom(nom);
	}

	/**
	 * Gets the age.
	 *
	 * @return the age
	 */
	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return super.getAge();
	}

	/**
	 * Sets the age.
	 *
	 * @param age the new age
	 */
	@Override
	public void setAge(int age) {
		// TODO Auto-generated method stub
		super.setAge(age);
	}

	/**
	 * Gets the adresse.
	 *
	 * @return the adresse
	 */
	@Override
	public Adresse getAdresse() {
		// TODO Auto-generated method stub
		return super.getAdresse();
	}

	/**
	 * Sets the adresse.
	 *
	 * @param adresse the new adresse
	 */
	@Override
	public void setAdresse(Adresse adresse) {
		// TODO Auto-generated method stub
		super.setAdresse(adresse);
	}
	
	/**
	 * Affichemp.
	 */
	public void affichemp() {
		System.out.println(this.toString());
		
	}
	
	/**
	 * Augmentation.
	 *
	 * @param pc the pc
	 */
	public void augmentation(float pc) {
		
		setSalaire(((pc/100)*salaire) + salaire);
	}

}
