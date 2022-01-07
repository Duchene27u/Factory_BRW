package sopra.formation.model;

import java.time.LocalDate;
import java.util.List;

public class Filiere {

	private int id;
	private int version;
	private LocalDate dateDebut;
	private int duree;
	private Dispositif dispositif;
	private Gestionnaire gestionnaire;
	private List<Cours> cours;
	private Salle salle;
	private Formateur formateurRef;
	private List<Cursus> cursus;
	
	public Filiere() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public LocalDate getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(LocalDate dateDebut) {
		this.dateDebut = dateDebut;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public Dispositif getDispositif() {
		return dispositif;
	}

	public void setDispositif(Dispositif dispositif) {
		this.dispositif = dispositif;
	}

	public Gestionnaire getGestionnaire() {
		return gestionnaire;
	}

	public void setGestionnaire(Gestionnaire gestionnaire) {
		this.gestionnaire = gestionnaire;
	}

	public List<Cours> getListeCours() {
		return cours;
	}

	public void setListeCours(List<Cours> listeCours) {
		this.cours = listeCours;
	}

	public Salle getSalle() {
		return salle;
	}

	public void setSalle(Salle salle) {
		this.salle = salle;
	}

	public Formateur getFormateurRef() {
		return formateurRef;
	}

	public void setFormateurRef(Formateur formateurRef) {
		this.formateurRef = formateurRef;
	}

	public List<Cursus> getListeCursus() {
		return cursus;
	}

	public void setListeCursus(List<Cursus> listeCursus) {
		this.cursus = listeCursus;
	}
	
	
	
	
}
