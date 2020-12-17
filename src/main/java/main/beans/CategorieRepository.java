package main.beans;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepository extends JpaRepository<Categorie, Integer> {

	public List<Categorie> findByDateMaj(LocalDateTime date_maj);
}
