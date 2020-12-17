package main.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import main.beans.Acteur;
import main.beans.Intervenant;

public interface ActeurRepository extends JpaRepository<Intervenant, Integer>{

	public Intervenant findByNomAndPrenom(String nom, String prenom);
}
