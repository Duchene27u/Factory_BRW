package sopra.formation.model;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Version;

@Entity
@Table(name="Curriculum")



public class Cursus {

	@Id
	@GeneratedValue
	private int id;
	@Version
	private int version;
	@Column(name="rateB")
	private int noteC;
	@Column(name="commentB")
	private String commentairesC;
	@Column(name="rateT")
	private int noteT;
	@Column(name="commentT")
	private String commentairesT;
	@Transient
	private List<Stagiaire> stagiaires = new ArrayList<Stagiaire>();
	@Transient
	private Filiere filiere;
	
	public Cursus() {
		super();
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
	public int getNoteC() {
		return noteC;
	}
	public void setNoteC(int noteC) {
		this.noteC = noteC;
	}
	public String getCommentairesC() {
		return commentairesC;
	}
	public void setCommentairesC(String commentairesC) {
		this.commentairesC = commentairesC;
	}
	public int getNoteT() {
		return noteT;
	}
	public void setNoteT(int noteT) {
		this.noteT = noteT;
	}
	public String getCommentairesT() {
		return commentairesT;
	}
	public void setCommentairesT(String commentairesT) {
		this.commentairesT = commentairesT;
	}
	public List<Stagiaire> getStagiaires() {
		return stagiaires;
	}
	public void setStagiaires(List<Stagiaire> stagiaires) {
		this.stagiaires = stagiaires;
	}
	public Filiere getFiliere() {
		return filiere;
	}
	public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}
	
	
}
