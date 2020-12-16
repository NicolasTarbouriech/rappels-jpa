package main.beans;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ActeurRepository extends JpaRepository<Acteur, Integer>{

	public Acteur findByNomAndPrenom(String nom, String prenom);
}
