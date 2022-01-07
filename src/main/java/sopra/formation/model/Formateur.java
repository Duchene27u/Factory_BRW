package sopra.formation.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "Former")
@DiscriminatorValue("Former")
public class Formateur extends Utilisateur{
	
	@Transient
	public List<Absence> absences = new ArrayList<>();
	@Transient
	public List<Competence> competences = new ArrayList<>();
	@Transient
	public List<Cours> ListeCours = new ArrayList<>();
	@Transient
	public List<Filiere> filieres = new ArrayList<>();
	
	
	public Formateur() {
				
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
