package sopra.formation.model;

import java.util.List;

public class Formateur extends Utilisateur{
	
	public List<Absence> absences;
	public List<Competence> competences;
	public List<Cours> ListeCours;
	public List<Filiere> filieres;
	
	
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
