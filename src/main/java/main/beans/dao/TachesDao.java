package main.beans.dao;

import java.time.LocalDateTime;

import main.beans.Taches;

public class TachesDao {

	public Taches creerTaches(String description, LocalDateTime date) {
		Taches t = new Taches();
		t.setDescription(description);
		t.setDate(date);
		return t;
	}
}
