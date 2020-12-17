package main.beans.dao;

import java.time.LocalDateTime;

import main.beans.Categorie;

public class CategorieDao {

	public Categorie creerCategorie(String nom, LocalDateTime dateMaj) {
		Categorie c = new Categorie();
		c.setDate_maj(dateMaj);
		c.setNom(nom);
		return c;
		
	}
}
