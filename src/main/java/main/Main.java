package main;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.List;
import main.beans.Acteur;
import main.beans.ActeurRepository;
import main.beans.Categorie;
import main.beans.CategorieRepository;
import main.beans.Film;
import main.beans.FilmRepository;

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
		System.out.println(em.find(Acteur.class, 1));
		System.out.println(em.find(Film.class, 1));

		 // creer nouvel acteur et l'affilié au film mission impossible
		Acteur acteur = new Acteur();
		acteur.setNom("Simon");
		acteur.setPrenom("Pegg");
		em.persist(acteur); 
		
		Acteur aa2 = em.find(Acteur.class, 8);
		Film f2 = em.find(Film.class, 3);
		aa2.getFilms().add(f2); 

		 Film avenger = em.find(Film.class, 4);
		avenger.setAnneeSortie("2019");
		em.persist(avenger); 
		
		Film roilion = new Film();
		
		Categorie cat = em.find(Categorie.class, 3);
		
		roilion.setTitre("Le Roi lion");
		roilion.setAnneeSortie("2020");
		roilion.setCategorie(cat);
		em.persist(roilion); 
		
		Film roilion2 = em.find(Film.class, 5);
		Acteur a1 = em.find(Acteur.class, 1);
		Acteur a2 = em.find(Acteur.class, 2);
		Acteur a3 = em.find(Acteur.class, 3);
		roilion.getActeurs().add(a1);
		roilion.getActeurs().add(a2);
		roilion.getActeurs().add(a3);
		
		
		 // supprimer les categories 10 et 13 
		 Categorie cat10 = em.find(Categorie.class,10); 
		 em.remove(cat10);
		 
		Categorie cat13 = em.find(Categorie.class, 13);
		em.remove(cat13);
		 */
		
		 Acteur acteur = acteurRepo.findByNomAndPrenom("Simon", "Pegg");
		 System.out.println(acteur);
		 
		 Film film = filmRepo.findByTitre("Deepwater");
		 System.out.println(film);
		 
		 LocalDateTime ldt = LocalDateTime.of(2006, 02, 15, 04, 46, 27);
		 List<Categorie> cate = cateRepo.findByDateMaj(ldt);
		 System.out.println(cate);
	}

}
