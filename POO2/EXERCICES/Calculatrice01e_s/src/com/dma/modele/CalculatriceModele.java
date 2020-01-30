package com.dma.modele;

import javafx.beans.property.DoubleProperty;

public class CalculatriceModele {

	public javafx.beans.property.DoubleProperty getCourant() {
		return courant;
	}

	public void setCourant(javafx.beans.property.DoubleProperty courant) {
		this.courant = courant;
	}

	public javafx.beans.property.DoubleProperty getResultat() {
		return resultat;
	}

	public void setResultat(javafx.beans.property.DoubleProperty resultat) {
		this.resultat = resultat;
	}
	javafx.beans.property.DoubleProperty courant;
	javafx.beans.property.DoubleProperty resultat;
	enum Operation {NONE, ADDITION, SOUSTRACTION, MULTIPLICATION, DIVISION, POURCENT, RACINE, CARRE, INVERSE, OPPOSE, EGALE}
	Operation lastOpp = Operation.NONE;
	
	public CalculatriceModele () {
		this.courant = new javafx.beans.property.SimpleDoubleProperty(0);
		this.resultat = new javafx.beans.property.SimpleDoubleProperty(0);
	}
	
	public void init() {
		this.courant = new javafx.beans.property.SimpleDoubleProperty(0);
		this.resultat = new javafx.beans.property.SimpleDoubleProperty(0);
	}
	public DoubleProperty courantDoubleProperty() {
		return courant;
		
	}

	public void addition() {
		this.resultat = this.courant;
		this.lastOpp = Operation.ADDITION;
	}
	public void soustraction() {
		this.resultat = this.courant;
		this.lastOpp = Operation.SOUSTRACTION;	
	}
	public void multiplication() {
		this.resultat = this.courant;
		this.lastOpp = Operation.MULTIPLICATION;
	}
	public void division() {
		this.resultat = this.courant;
		this.lastOpp = Operation.DIVISION;
	}
	public void pourcent() {
		this.resultat = this.courant;
		this.lastOpp = Operation.POURCENT;
	}
	public void racine() {
		this.resultat = this.courant;
		this.lastOpp = Operation.CARRE;
	}
	public void carre() {
		this.resultat = this.courant;
		this.lastOpp = Operation.INVERSE;
	}
	public void inverse() {
		this.resultat = this.courant;
		this.lastOpp = Operation.INVERSE;
	}
	public void oppose() {
		this.resultat = this.courant;
		this.lastOpp = Operation.OPPOSE;
	}
	public void egale() {
		this.resultat = this.courant;
		this.lastOpp = Operation.EGALE;
	}
		
		
}
