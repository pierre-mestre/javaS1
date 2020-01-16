/*
 * 
 */
package pers;

import util.Adresse;

// TODO: Auto-generated Javadoc
/**
 * The Class Technicien.
 */
public class Technicien extends Employe {

	/** The specialite. */
	private String specialite;
	
	/** The Constant prime. */
	public static final double prime = 50;

	
	/**
	 * Instantiates a new technicien.
	 */
	public Technicien() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new technicien.
	 *
	 * @param nom the nom
	 * @param prenom the prenom
	 * @param age the age
	 * @param d the d
	 */
	public Technicien(String nom, String prenom, int age, double d) {
		super(nom, prenom, age, d);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new technicien.
	 *
	 * @param nom the nom
	 * @param prenom the prenom
	 * @param age the age
	 * @param d the d
	 * @param spec the spec
	 */
	public Technicien(String nom, String prenom, int age, double d, String spec) {
		super(nom, prenom, age, d);
		this.specialite = spec;
	}

	/**
	 * Gets the specialite.
	 *
	 * @return the specialite
	 */
	public String getSpecialite() {
		return specialite;
	}

	/**
	 * Sets the specialite.
	 *
	 * @param specialite the new specialite
	 */
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	/**
	 * Affichetech.
	 */
	public void affichetech() {
		super.affiche();
		System.out.println("Spécialité : " + specialite);		
	}
	
	/**
	 * Augmentation.
	 *
	 * @param pc the pc
	 */
	public void augmentation(float pc) {
		super.augmentation(pc);
		setSalaire(salaire + Technicien.prime);
	}
	
}