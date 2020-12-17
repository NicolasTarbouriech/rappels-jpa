package main.beans;

import java.time.LocalDateTime;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("TD")
public class TachesDatees extends Taches {

	private LocalDateTime dateEcheance;

	public LocalDateTime getDateEcheance() {
		return dateEcheance;
	}

	public void setDateEcheance(LocalDateTime dateEcheance) {
		this.dateEcheance = dateEcheance;
	}
	
	
	
	
}
