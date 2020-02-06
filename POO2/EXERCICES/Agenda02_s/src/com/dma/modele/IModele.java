package com.dma.modele;

import java.time.LocalDate;
import javafx.beans.property.ObjectProperty;
import com.dma.modele.metier.Medecin;

public interface IModele {

	public ObjectProperty<Medecin> getMedecinProperty() ;
	
	public ObjectProperty<LocalDate> getJourProperty() ;
	
}
