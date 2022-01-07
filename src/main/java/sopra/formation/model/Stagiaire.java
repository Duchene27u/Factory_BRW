package sopra.formation.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Intern")
@DiscriminatorValue("Intern")
public class Stagiaire extends Utilisateur{

	@Column(name = "DateOfBirth", length = 100)
	private LocalDate dateNaissance;
	@OneToMany(mappedBy = "stagiaires")
	private List<Cursus> cursus;
	
	public Stagiaire() {
		super();
	}
	



	public Stagiaire(String nom, String prenom, String identifiant, String motDePasse, LocalDate dateNaissance) {
		super(nom, prenom, identifiant, motDePasse);
		this.dateNaissance = dateNaissance;
		super.setDroit(Droit.STAGIAIRE);
	}



	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public List<Cursus> getCursus() {
		return cursus;
	}



	public void setCursus(List<Cursus> cursus) {
		this.cursus = cursus;
	}
	
	

}
