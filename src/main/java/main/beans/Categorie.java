package main.beans;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "categorie")
public class Categorie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@OneToMany(mappedBy = "categorie")
	private Set<Film> films; // référence vers les films

	public Categorie() {
		films = new HashSet<Film>();
	}

	@Column(name = "nom")
	private String nom;

	@Column(name = "date_maj")
	private LocalDate date_maj;

	public Set<Film> getFilms() {
		return films;
	}

	public void setFilms(Set<Film> films) {
		this.films = films;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public LocalDate getDate_maj() {
		return date_maj;
	}

	public void setDate_maj(LocalDate date_maj) {
		this.date_maj = date_maj;
	}

	@Override
	public String toString() {
		return "Categorie [id=" + id +  "nom=" + nom + ", date_maj=" + date_maj + "]";
	}

	
}
