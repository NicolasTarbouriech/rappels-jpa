package main.beans;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ActeurRepository extends JpaRepository<Acteur, Integer>{

	public List<Acteur> findByNomAndPrenom(String nom, String prenom);
}
