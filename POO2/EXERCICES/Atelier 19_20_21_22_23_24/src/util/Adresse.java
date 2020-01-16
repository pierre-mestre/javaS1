package util;

public class Adresse {


	String voie;
	String complementAdresse;
	String ville;
	String codePostal;
	
	public Adresse() {
		super();
		this.voie = "chemin de la reussite";
		this.complementAdresse = "serveurs de l'esiee PARIS";
		this.ville = "Noisy le GRAND";
		this.codePostal = "93160";
	}
	public Adresse(String voie, String complementAdresse, String ville, String codePostal) {
		super();
		this.voie = voie;
		this.complementAdresse = complementAdresse;
		this.ville = ville;
		this.codePostal = codePostal;
	}
	public Adresse(Adresse adresse) {
		super();
		this.voie = adresse.voie;
		this.complementAdresse = adresse.complementAdresse;
		this.ville = adresse.ville;
		this.codePostal = adresse.codePostal;
	}
	@Override
	public String toString() {
		return "Adresse [voie=" + voie + ", complementAdresse=" + complementAdresse + ", ville=" + ville
				+ ", codePostal=" + codePostal + "]";
	}
	public String getVoie() {
		return voie;
	}

	public void setVoie(String voie) {
		this.voie = voie;
	}

	public String getComplementAdresse() {
		return complementAdresse;
	}

	public void setComplementAdresse(String complementAdresse) {
		this.complementAdresse = complementAdresse;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
		
}
