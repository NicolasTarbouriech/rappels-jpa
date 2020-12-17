package main.beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE")
@DiscriminatorValue("IN")
@Table(name = "intervenant")
public class Intervenant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@ManyToMany
	@JoinTable(name = "film_intervenant", joinColumns = @JoinColumn(name = "id_intervenant", referencedColumnName = "ID"),
	inverseJoinColumns = @JoinColumn(name = "id_film", referencedColumnName = "ID"))
	private Set<Film> films = new HashSet<>();
	
	@OneToMany(mappedBy = "intervenant")
	private Set<Taches> taches = new HashSet<>();
	
	@OneToMany(mappedBy = "intervenant")
	private Set<Adresse> adresse = new HashSet<>(); // référence vers les films
	
	@Column(name = "nom")
	private String nom;
	
	@Column(name = "prenom")
	private String prenom;

	public Intervenant() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	public Set<Taches> getTaches() {
		return taches;
	}

	public void setTaches(Set<Taches> taches) {
		this.taches = taches;
	}

	public Set<Adresse> getAdresse() {
		return adresse;
	}

	public void setAdresses(Set<Adresse> adresse) {
		this.adresse = adresse;
	}

	public Set<Film> getFilms() {
		return films;
	}

	public void setFilms(Set<Film> films) {
		this.films = films;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
}
