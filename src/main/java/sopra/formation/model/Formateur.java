package sopra.formation.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Trainer")
@DiscriminatorValue("Trainer")
public class Formateur extends Utilisateur{
	
	@OneToMany(mappedBy = "formateur")
	private List<Absence> absences = new ArrayList<>();
	@OneToMany(mappedBy = "formateur")
	private List<Competence> competences = new ArrayList<>();
	@OneToMany(mappedBy = "formateur")
	private List<Cours> ListeCours = new ArrayList<>();
	@OneToMany(mappedBy = "formateurRef")
	private List<Filiere> filieres = new ArrayList<>();
	
	
	public Formateur() {
			super.setDroit(Droit.FORMATEUR);
	}
	
	public List<Absence> getAbsences() {
		return absences;
	}

	public void setAbsences(List<Absence> absences) {
		this.absences = absences;
	}

	public List<Competence> getCompetences() {
		return competences;
	}

	public void setCompetences(List<Competence> competences) {
		this.competences = competences;
	}

	public List<Cours> getListeCours() {
		return ListeCours;
	}

	public void setListeCours(List<Cours> listeCours) {
		ListeCours = listeCours;
	}

	public List<Filiere> getFilieres() {
		return filieres;
	}

	public void setFilieres(List<Filiere> filieres) {
		this.filieres = filieres;
	}
	

}
