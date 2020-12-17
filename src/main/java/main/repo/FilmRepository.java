package main.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import main.beans.Film;

public interface FilmRepository extends JpaRepository<Film, Integer> {

	public List<Film> findByTitre (String titre);
}
