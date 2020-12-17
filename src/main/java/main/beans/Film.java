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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "film")
public class Film {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@ManyToMany
	@JoinTable(name = "film_intervenant", joinColumns = @JoinColumn(name = "id_film", referencedColumnName = "ID"),
	inverseJoinColumns = @JoinColumn(name = "id_intervenant", referencedColumnName = "ID"))
	private Set<Intervenant> intervenant;

	@ManyToOne
	@JoinColumn(name = "id_categ")
	private Categorie categorie;

	@Column(name = "titre")
	private String titre;

	@Column(name = "annee_sortie")
	private String anneeSortie;

	public Film() {
		super();
	}

	public Set<Intervenant> getIntervenant() {
		return intervenant;
	}

	public void setIntervenant(Set<Intervenant> intervenant) {
		this.intervenant = intervenant;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAnneeSortie() {
		return anneeSortie;
	}

	public void setAnneeSortie(String anneeSortie) {
		this.anneeSortie = anneeSortie;
	}

	@Override
	public String toString() {
		return "Film [id=" + id + ", titre=" + titre + "annee sortie : " + anneeSortie;

	}

}
