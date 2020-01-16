/*
 * 
 */
package pers;

import util.Adresse;

// TODO: Auto-generated Javadoc
/**
 * The Class Personne.
 */
public class Personne {

	/** The prenom. */
	String prenom;
	
	/** The nom. */
	String nom;
	
	/** The age. */
	int age;
	
	/** The adresse. */
	Adresse adresse;
	
	/**
	 * Instantiates a new personne.
	 */
	public Personne() {
		super();
		this.prenom = "Pierre";
		this.nom = "MESTRE";
		this.age = 20;
		this.adresse = new Adresse();
	}
	
	/**
	 * Instantiates a new personne.
	 *
	 * @param prenom the prenom
	 * @param nom the nom
	 * @param age the age
	 * @param adresse the adresse
	 */
	public Personne(String prenom, String nom, int age, Adresse adresse) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.age = age;
		this.adresse = new Adresse(adresse);
	}

	/**
	 * Gets the prenom.
	 *
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * Sets the prenom.
	 *
	 * @param prenom the new prenom
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * Gets the nom.
	 *
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Personne [prenom=" + prenom + ", nom=" + nom + ", age=" + age + ", adresse=" + adresse + "]";
	}
	
	/**
	 * Affiche.
	 */
	public void affiche() {
		System.out.println(this.toString());
	}

	/**
	 * Sets the nom.
	 *
	 * @param nom the new nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Gets the age.
	 *
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Sets the age.
	 *
	 * @param age the new age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * Gets the adresse.
	 *
	 * @return the adresse
	 */
	public Adresse getAdresse() {
		return adresse;
	}

	/**
	 * Sets the adresse.
	 *
	 * @param adresse the new adresse
	 */
	public void setAdresse(Adresse adresse) {
		this.adresse = new Adresse(adresse);
	}
	
}
