package main.beans.dao;

import main.beans.Realisateur;

public class RealisateurDao {

	public Realisateur creerRealisateur(String nom, String prenom, Double commission) {
		Realisateur r = new Realisateur();
		r.setNom(nom);
		r.setPrenom(prenom);
		r.setCommission(commission);
		return r;
	}
}
