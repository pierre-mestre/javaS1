/*
 * 
 */
package util;

// TODO: Auto-generated Javadoc
/**
 * The Class Adresse.
 *
 * @author mestrep
 */
public class Adresse {


	/** The voie. */
	String voie;
	
	/** The complement adresse. */
	String complementAdresse;
	
	/** The ville. */
	String ville;
	
	/** The code postal. */
	String codePostal;
	
	/**
	 * Instantiates a new adresse.
	 */
	public Adresse() {
		super();
		this.voie = "chemin de la reussite";
		this.complementAdresse = "serveurs de l'esiee PARIS";
		this.ville = "Noisy le GRAND";
		this.codePostal = "93160";
	}
	
	/**
	 * Instantiates a new adresse.
	 *
	 * @param voie the voie
	 * @param complementAdresse the complement adresse
	 * @param ville the ville
	 * @param codePostal the code postal
	 */
	public Adresse(String voie, String complementAdresse, String ville, String codePostal) {
		super();
		this.voie = voie;
		this.complementAdresse = complementAdresse;
		this.ville = ville;
		this.codePostal = codePostal;
	}
	
	/**
	 * Instantiates a new adresse.
	 *
	 * @param adresse the adresse
	 */
	public Adresse(Adresse adresse) {
		super();
		this.voie = adresse.voie;
		this.complementAdresse = adresse.complementAdresse;
		this.ville = adresse.ville;
		this.codePostal = adresse.codePostal;
	}
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Adresse [voie=" + voie + ", complementAdresse=" + complementAdresse + ", ville=" + ville
				+ ", codePostal=" + codePostal + "]";
	}
	
	/**
	 * Gets the voie.
	 *
	 * @return the voie
	 */
	public String getVoie() {
		return voie;
	}

	/**
	 * Sets the voie.
	 *
	 * @param voie the new voie
	 */
	public void setVoie(String voie) {
		this.voie = voie;
	}

	/**
	 * Gets the complement adresse.
	 *
	 * @return the complement adresse
	 */
	public String getComplementAdresse() {
		return complementAdresse;
	}

	/**
	 * Sets the complement adresse.
	 *
	 * @param complementAdresse the new complement adresse
	 */
	public void setComplementAdresse(String complementAdresse) {
		this.complementAdresse = complementAdresse;
	}

	/**
	 * Gets the ville.
	 *
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}

	/**
	 * Sets the ville.
	 *
	 * @param ville the new ville
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}

	/**
	 * Gets the code postal.
	 *
	 * @return the code postal
	 */
	public String getCodePostal() {
		return codePostal;
	}

	/**
	 * Sets the code postal.
	 *
	 * @param codePostal the new code postal
	 */
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
		
}
