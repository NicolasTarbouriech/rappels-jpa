package main.beans;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepository extends JpaRepository<Categorie, Integer> {

	public Categorie findByDateMaj(Date date_maj);
}
