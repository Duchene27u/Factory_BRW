package sopra.formation.model;

import java.util.List;

public class Cursus {

	private int id;
	private int version;
	private int noteC;
	private String commentairesC;
	private int noteT;
	private String commentairesT;
	private List<Stagiaire> stagiaires;
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
