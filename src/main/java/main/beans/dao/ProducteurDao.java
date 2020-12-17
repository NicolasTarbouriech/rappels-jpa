package main.beans.dao;

import main.beans.Producteur;

public class ProducteurDao {

	public Producteur creerProducteur(String nom, String prenom, Double budget) {
		Producteur p = new Producteur();
		p.setNom(nom);
		p.setPrenom(prenom);
		p.setBudget(budget);
		return p;
	}
}
