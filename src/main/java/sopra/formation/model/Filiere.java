package sopra.formation.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Version;

@Entity
@Table(name="Workshop")
public class Filiere {

	@Id
	@GeneratedValue
	private int id;
	@Version
	private int version;
	private LocalDate dateDebut;
	private int duree;
	@Enumerated
	private Dispositif dispositif;
	@Transient
	private Utilisateur gestionnaire;
	@Transient
	private List<Cours> cours=new ArrayList<Cours>();
	@Transient
	private Salle salle;
	@Transient
	private Formateur formateurRef;
	@Transient
	private List<Cursus> cursus = new ArrayList<Cursus>();
	
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

	public Utilisateur getGestionnaire() {
		return gestionnaire;
	}

	public void setGestionnaire(Utilisateur gestionnaire) {
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
