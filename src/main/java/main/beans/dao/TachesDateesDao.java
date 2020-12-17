package main.beans.dao;

import java.time.LocalDateTime;

import main.beans.TachesDatees;

public class TachesDateesDao {

	public TachesDatees creerTachesDatees(LocalDateTime dateEcheance) {
		TachesDatees td = new TachesDatees();
		td.setDate(dateEcheance);
		return td;
	}
}
