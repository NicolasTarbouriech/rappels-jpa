package main.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import main.beans.Acteur;

public interface ActeurRepository extends JpaRepository<Acteur, Integer>{

	public List<Acteur> findByNomAndPrenom(String nom, String prenom);
}
