package main.beans.dao;

import main.beans.Categorie;
import main.beans.Film;

public class FilmDao {

	public Film creerFilm(String titre, Categorie categorie) {
		Film f = new Film();
		f.setTitre(titre);
		Categorie c = new Categorie();
		f.setCategorie(c);
		return f;
	}
}
