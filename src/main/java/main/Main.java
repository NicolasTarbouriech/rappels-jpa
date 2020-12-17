package main;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import main.beans.Acteur;
import main.beans.Adresse;
import main.beans.Film;
import main.beans.Intervenant;
import main.beans.Producteur;
import main.beans.Realisateur;
import main.beans.Taches;
import main.beans.TachesDatees;
import main.beans.Categorie;
import main.repo.ActeurRepository;
import main.repo.CategorieRepository;
import main.repo.FilmRepository;

@SpringBootApplication
@EnableTransactionManagement
public class Main implements CommandLineRunner {

	@PersistenceContext
	private EntityManager em;

	@Autowired
	private ActeurRepository acteurRepo;

	@Autowired
	private FilmRepository filmRepo;

	@Autowired
	private CategorieRepository cateRepo;

	public static void main(String[] args) {

		// EntityManagerFactory entityManagerFactory =
		// Persistence.createEntityManagerFactory("films");
		// EntityManager manager = entityManagerFactory.createEntityManager();

		SpringApplication.run(Main.class, args);

	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {
		/*
		Film harrypotter = new Film();
		Categorie cat = em.find(Categorie.class, 3);
		harrypotter.setTitre("Harry Potter");
		harrypotter.setAnneeSortie("2020");
		harrypotter.setCategorie(cat);
		em.persist(harrypotter);

		Acteur acteur1 = new Acteur();
		acteur1.setNom("acteur1");
		acteur1.setPrenom("joli");

		Acteur acteur2 = new Acteur();
		acteur2.setNom("acteur2");
		acteur2.setPrenom("jacke");

		Acteur acteur3 = new Acteur();
		acteur3.setNom("acteur3");

		Realisateur real = new Realisateur();
		real.setNom("real1");

		Producteur prod = new Producteur();
		prod.setNom("prod1");

		 */

		Intervenant aa1 = em.find(Intervenant.class, 9);
		Intervenant aa2 = em.find(Intervenant.class, 10);
		Intervenant aa3 = em.find(Intervenant.class, 11);
		Intervenant aa4 = em.find(Intervenant.class, 12);
		Intervenant aa5 = em.find(Intervenant.class, 13);

		/*
		 * Film f = em.find(Film.class, 6); aa1.getFilms().add(f);
		 * aa2.getFilms().add(f); aa3.getFilms().add(f); aa4.getFilms().add(f);
		 * aa5.getFilms().add(f);
		 */

		/*
		 * Adresse a1 = new Adresse(); em.persist(a1);
		 * 
		 * a1.setNumeroRue(45); a1.setLibelleRue("tourni"); a1.setVille("mtp");
		 * a1.setCodePostal(34000); a1.setIntervenant(aa1); aa1.getAdresses().add(a1);
		 * em.persist(a1);
		 * 
		 * Adresse a2 = new Adresse(); em.persist(a2);
		 * 
		 * a2.setNumeroRue(35); a2.setLibelleRue("tournicoton"); a2.setVille("tlse");
		 * a2.setCodePostal(31000); a2.setIntervenant(aa2); aa2.getAdresses().add(a2);
		 * 
		 * Adresse a3 = new Adresse(); em.persist(a3);
		 * 
		 * a3.setNumeroRue(15); a3.setLibelleRue("tournicotonlaine");
		 * a3.setVille("paris"); a3.setCodePostal(75000); a3.setIntervenant(aa3);
		 * aa3.getAdresses().add(a3);
		 * 
		 * Adresse a4 = new Adresse(); em.persist(a4);
		 * 
		 * a4.setNumeroRue(66); a4.setLibelleRue("tournicotontouki");
		 * a4.setVille("nantes"); a4.setCodePostal(45000); a4.setIntervenant(aa4);
		 * aa4.getAdresses().add(a4);
		 * 
		 * Adresse a5 = new Adresse(); em.persist(a5);
		 * 
		 * a5.setNumeroRue(99); a5.setLibelleRue("la rade"); a5.setVille("toulon");
		 * a5.setCodePostal(83000); a5.setIntervenant(aa5); aa5.getAdresses().add(a5);
		 * 
		 * aa1.getAdresses().add(a1); aa2.getAdresses().add(a2);
		 * aa3.getAdresses().add(a3); aa4.getAdresses().add(a4);
		 * aa5.getAdresses().add(a5);
		 */

		
	
		
		TachesDatees td = new TachesDatees();
		em.persist(td);
		LocalDateTime ldt = LocalDateTime.of(2008, 02, 15, 14, 46, 27);
		td.setDateEcheance(ldt);
		td.setIntervenant(aa1);
		LocalDateTime dte = LocalDateTime.of(2006, 02, 15, 04, 46, 27);
		td.setDate(dte);
		td.setDescription("cascade");
		aa1.getTaches().add(td); 
		

	}

}
