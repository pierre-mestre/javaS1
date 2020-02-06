package com.dma.modele;

import java.time.LocalDate;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import com.dma.modele.metier.Medecin;

public class AgendaModele implements IModele {
	private ObjectProperty<Medecin> medecinProperty; // le médecin sélectionné
	private ObjectProperty<LocalDate> jourProperty; // le jour sélectionné

	public AgendaModele() {
		medecinProperty = new SimpleObjectProperty<>(new Medecin());
		jourProperty = new SimpleObjectProperty<>(LocalDate.now());
	}

	public ObjectProperty<Medecin> getMedecinProperty() {
		return medecinProperty;
	}

	public ObjectProperty<LocalDate> getJourProperty() {
		return jourProperty;
	}

}
