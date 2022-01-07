package sopra.formation.test;


import java.time.LocalDate;

import sopra.formation.Application;
import sopra.formation.dao.IAbsenceDao;
import sopra.formation.dao.ICompetenceDao;
import sopra.formation.dao.ICoursDao;
import sopra.formation.dao.ICursusDao;
import sopra.formation.dao.IFiliereDao;
import sopra.formation.dao.IMatiereDao;
import sopra.formation.dao.ISalleDao;
import sopra.formation.dao.IUtilisateurDao;
import sopra.formation.dao.jpa.FiliereDaoJpa;
import sopra.formation.model.Absence;
import sopra.formation.model.Adresse;
import sopra.formation.model.Competence;
import sopra.formation.model.Cours;
import sopra.formation.model.Cursus;
import sopra.formation.model.Filiere;
import sopra.formation.model.Formateur;
import sopra.formation.model.Matiere;
import sopra.formation.model.Niveau;
import sopra.formation.model.Salle;
import sopra.formation.model.Stagiaire;
import sopra.formation.model.Utilisateur;

public class TestJpa {

	public static void main(String[] args) {
		IUtilisateurDao utilisateurDao = Application.getInstance().getUtilisateurDao();
		ISalleDao salleDao = Application.getInstance().getSalleDao();
		IAbsenceDao absenceDao = Application.getInstance().getAbsenceDao();
		ICompetenceDao competenceDao = Application.getInstance().getCompetenceDao();
		IMatiereDao matiereDao = Application.getInstance().getMatiereDao();
		IFiliereDao filiereDao = Application.getInstance().getFiliereDao();
		ICoursDao coursDao = Application.getInstance().getCoursDao();
		ICursusDao cursusDao = Application.getInstance().getCursusDao();

		
		Utilisateur utilisateur1 = new Utilisateur("DUJARDIN", "Jean", "jdujardin", "123");
		utilisateur1.setAdresse(new Adresse("67 Boulevard du Général Leclerc", "", "92110", "CLICHY"));
		utilisateur1 = utilisateurDao.save(utilisateur1);
		
		Utilisateur stagiaire = new Stagiaire("LAMY", "Sarah", "salamy", "456",LocalDate.of(1995, 02, 28));
		stagiaire.setAdresse(new Adresse("68 Boulevard du Général Leclerc", "", "92110", "CLICHY"));
		stagiaire = utilisateurDao.save(stagiaire);
		
		Utilisateur formateur = new Formateur();
		formateur.setNom("SANSON");
		formateur.setPrenom("Sanbruit");
		formateur.setAdresse(new Adresse("69 Boulevard du Général Leclerc", "", "92110", "CLICHY"));
		formateur =  utilisateurDao.save(formateur);
		
		Salle salle1=new Salle();
		salle1.setAdresse(new Adresse("44 rue du Pin", "Etage 2", "44001", "nantes"));
		salle1.setNom("Amandre");
		salle1=salleDao.save(salle1);
		
		Salle salle2=new Salle();
		salle2.setAdresse(new Adresse("44 rue du Pin", "Etage 1", "44001", "nantes"));
		salle2.setNom("Haie");
		salle2 = salleDao.save(salle2);
		
		Absence absence1 = new Absence();
		absence1.setDate(LocalDate.of(2022, 01, 07));
		absence1.setFormateur((Formateur) formateur);
		absence1=absenceDao.save(absence1);
		
		Absence absence2 = new Absence();
		absence2.setDate(LocalDate.of(2022, 02, 10));
		absence2.setFormateur((Formateur) formateur);
		absence2=absenceDao.save(absence2);
		
		
		Matiere maths=new Matiere("M2 - Algèbre", 45, "devenir fort", "M1 - bases", "formation de base");
		maths = matiereDao.save(maths);
		
		Competence algebre = new Competence(Niveau.EXPERT, (Formateur)formateur);
		algebre.setMatiere(maths);
		algebre = competenceDao.save(algebre);

		Competence geometrie = new Competence(Niveau.EXPERT, (Formateur)formateur);
		geometrie.setMatiere(maths);
		competenceDao.save(geometrie);
		
		Filiere contratpro = new Filiere();
		contratpro.setFormateurRef((Formateur) formateur);
		contratpro.setGestionnaire(utilisateur1);
		contratpro.setSalle(salle2);
		contratpro = filiereDao.save(contratpro);
		
		Cursus jaipascompris = new Cursus();
		jaipascompris.setFiliere(contratpro);
		jaipascompris.setStagiaires((Stagiaire) stagiaire);
		cursusDao.save(jaipascompris);

		Cours apprentissageDerivee = new Cours();
		coursDao.save(apprentissageDerivee);

		
	}

}
