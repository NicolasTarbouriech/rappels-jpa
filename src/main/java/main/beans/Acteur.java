package main.beans;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "acteur")
public class Acteur {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@ManyToMany
	@JoinTable(name = "film_acteur", joinColumns = @JoinColumn(name = "id_acteur", referencedColumnName = "ID"),
	inverseJoinColumns = @JoinColumn(name = "id_film", referencedColumnName = "ID"))
	private Set<Film> films;

	@Column(name = "nom")
	private String nom;

	@Column(name = "prenom")
	private String prenom;

	public Acteur() {
		super();
	}

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

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Acteur [id=" + id +  "nom=" + nom + ", prenom=" + prenom + "]";
	}

	

}
