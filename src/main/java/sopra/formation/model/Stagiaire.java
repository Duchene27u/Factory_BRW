package sopra.formation.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "Intern")
@DiscriminatorValue("Intern")
public class Stagiaire extends Utilisateur{

	public LocalDate dateNaissance;
	@Transient
	public Cursus cursus;
	
	public Stagiaire() {
		super();
	}
	
	

	public Stagiaire(String nom, String prenom, String identifiant, String motDePasse, LocalDate dateNaissance) {
		super(nom, prenom, identifiant, motDePasse);
		this.dateNaissance = dateNaissance;
	}



	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public Cursus getCursus() {
		return cursus;
	}

	public void setCursus(Cursus cursus) {
		this.cursus = cursus;
	}
	
	

}
