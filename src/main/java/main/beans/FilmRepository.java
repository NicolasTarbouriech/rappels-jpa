package main.beans;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film, Integer> {

	public Film findByTitre (String titre);
}
