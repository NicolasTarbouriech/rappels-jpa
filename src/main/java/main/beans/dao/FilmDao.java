package main.beans.dao;


import main.beans.Film;

public class FilmDao {

	public Film creerFilm(String titre) {
		Film f = new Film();
		f.setTitre(titre);
		
		return f;
	}
}
