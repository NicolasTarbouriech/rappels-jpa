package main.beans.dao;

import main.beans.Adresse;

public class AdresseDao {
	
	public Adresse creerAdresse(Integer numeroRue, String libelleRue, String ville, Integer codePostal) {
		Adresse a = new Adresse();
		a.setNumeroRue(numeroRue);
		a.setLibelleRue(libelleRue);
		a.setVille(ville);
		a.setCodePostal(codePostal);
		return a;
	}
}
