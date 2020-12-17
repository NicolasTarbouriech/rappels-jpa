package main.beans;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film, Integer> {

	public List<Film> findByTitre (String titre);
}
