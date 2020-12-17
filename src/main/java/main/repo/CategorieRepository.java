package main.repo;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import main.beans.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Integer> {

	public List<Categorie> findByDateMaj(LocalDateTime date_maj);
}
