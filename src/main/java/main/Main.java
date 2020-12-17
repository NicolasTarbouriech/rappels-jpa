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
import main.beans.dao.ActeurDao;
import main.beans.dao.AdresseDao;
import main.beans.dao.CategorieDao;
import main.beans.dao.FilmDao;
import main.beans.dao.ProducteurDao;
import main.beans.dao.RealisateurDao;
import main.beans.dao.TachesDao;
import main.beans.dao.TachesDateesDao;
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

		
		ActeurDao acteurDao = new ActeurDao();
		Acteur acteur = acteurDao.creerActeur("Depp2", "Johnny2", "agence", 0);
		em.persist(acteur);

		TachesDao tacheDao = new TachesDao();
		Taches tache = tacheDao.creerTaches("test", LocalDateTime.now());
		em.persist(tache);
		tache.setIntervenant(acteur);
		
		TachesDateesDao tacheDateeDao = new TachesDateesDao();
		TachesDatees tacheDatee = tacheDateeDao.creerTachesDatees(LocalDateTime.now());
		em.persist(tacheDatee);
		tacheDatee.setIntervenant(acteur);
		
		AdresseDao adresseDao = new AdresseDao();
		Adresse adresse = adresseDao.creerAdresse(2, "rue de la liberte", "Montpellier", 34000);
		em.persist(adresse);
		adresse.setIntervenant(acteur);

		FilmDao filmDao = new FilmDao();
		Film f = filmDao.creerFilm("Pirates des caraibes 2");
		em.persist(f);
		f.getIntervenant().add(acteur);

	}

}
