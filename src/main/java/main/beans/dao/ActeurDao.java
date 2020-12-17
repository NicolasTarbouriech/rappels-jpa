package main.beans.dao;

import main.beans.Acteur;

public class ActeurDao {

	public Acteur creerActeur(String nom, String prenom, String agence, double salaire) {
		Acteur a = new Acteur();
		a.setNom(nom);
		a.setPrenom(prenom);
		a.setAgence(agence);
		a.setSalaire(salaire);
		return a;
	}
}
