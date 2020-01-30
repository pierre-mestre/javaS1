package com.dma.controleur;

import com.dma.modele.CalculatriceModele;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.util.converter.NumberStringConverter;
import javafx.scene.control.MenuItem;

import javafx.scene.control.Menu;

public class CalculatriceControleur {
	
	private CalculatriceModele modele;
	@FXML
	private Button b_clear;
	@FXML
	private Button b_carre;
	@FXML
	private Button b_racine;
	@FXML
	private Button b_clearentry;
	@FXML
	private Button b_sept;
	@FXML
	private Button b_quatre;
	@FXML
	private Button b_un;
	@FXML
	private Button b_oppose;
	@FXML
	private Button b_neuf;
	@FXML
	private Button b_inverse;
	@FXML
	private Button b_back;
	@FXML
	private Button b_division;
	@FXML
	private Button b_multiplication;
	@FXML
	private Button b_huit;
	@FXML
	private Button b_cinq;
	@FXML
	private Button b_six;
	@FXML
	private Button b_soustraction;
	@FXML
	private Button b_deux;
	@FXML
	private Button b_trois;
	@FXML
	private Button b_addition;
	@FXML
	private Button b_zero;
	@FXML
	private Button b_virgule;
	@FXML
	private Button b_egale;
	@FXML
	private Button b_pourcent;
	@FXML
	private Menu m_format;
	@FXML
	private MenuItem m_standard;
	@FXML
	private MenuItem m_scientifique;
	@FXML
	private MenuItem m_quitter;
	@FXML
	private MenuItem m_aideCalculatrice;
	@FXML
	private MenuItem m_apropos;
	@FXML
	private TextField t_saisie;
	
	@FXML
	private void initialize() {
	
		this.modele = new CalculatriceModele(); 
			
		t_saisie.textProperty().bindBidirectional(modele.courantDoubleProperty(),new NumberStringConverter());

		
		this.b_sept.setOnAction(event -> modele.init());
		this.b_quatre.setOnAction(event -> saisie(4));
		this.b_un.setOnAction(event -> saisie(1));
		this.b_neuf.setOnAction(event -> saisie(9));
		this.b_huit.setOnAction(event -> saisie(8));
		this.b_cinq.setOnAction(event -> saisie(5));
		this.b_six.setOnAction(event -> saisie(6));
		this.b_deux.setOnAction(event -> saisie(2));
		this.b_trois.setOnAction(event -> saisie(3));
		this.b_zero.setOnAction(event -> saisie(0));
		

		this.b_division.setOnAction(event -> modele.division());
		this.b_multiplication.setOnAction(event -> modele.multiplication());		
		this.b_soustraction.setOnAction(event -> modele.soustraction());		
		this.b_addition.setOnAction(event -> modele.addition());

		this.b_oppose.setOnAction(event -> modele.oppose());
		this.b_inverse.setOnAction(event -> modele.inverse());
		this.b_virgule.setOnAction(event -> modele.init());
		this.b_egale.setOnAction(event -> modele.egale());
		this.b_pourcent.setOnAction(event -> modele.pourcent());
		this.b_carre.setOnAction(event -> modele.carre());
		this.b_racine.setOnAction(event -> modele.racine());
		
		this.b_clear.setOnAction(event -> {modele.init(); 
											t_saisie.clear();});
		
		this.b_clearentry.setOnAction(event -> {modele.init(); 
											t_saisie.clear();});
	
		this.b_back.setOnAction(event -> deleteLast());
		
		
		//TODOOOOOOOOOOOO
		this.m_format.setOnAction(event -> modele.init());
		this.m_standard.setOnAction(event -> modele.init());
		this.m_scientifique.setOnAction(event -> modele.init());
		this.m_quitter.setOnAction(event -> modele.init());
		this.m_aideCalculatrice.setOnAction(event -> modele.init());
		this.m_apropos.setOnAction(event -> modele.init());
		this.t_saisie.setOnAction(event -> modele.init());
	


	}
	
	public void saisie(char nb) {
		String s = t_saisie.getText();
		s = new StringBuilder(s).append(nb).toString();
		t_saisie.setText(s);
	}
	public void saisie(int nb) {
		String s = t_saisie.getText();
		s = new StringBuilder(s).append(nb).toString();
		t_saisie.setText(s);
	}
	public void deleteLast() {
		String s = t_saisie.getText().trim();
		s = new StringBuilder(s).deleteCharAt(s.length()-1).toString();
		t_saisie.setText(s);
	}
}
