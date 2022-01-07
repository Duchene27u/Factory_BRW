package sopra.formation.test;


import sopra.formation.Application;
import sopra.formation.dao.IUtilisateurDao;
import sopra.formation.model.Adresse;
import sopra.formation.model.Utilisateur;

public class TestJpa {

	public static void main(String[] args) {
		IUtilisateurDao utilisateurDao = Application.getInstance().getUtilisateurDao();

		
		Utilisateur utilisateur1 = new Utilisateur("DUJARDIN", "Jean", "jdujardin", "123");
		utilisateur1.setAdresse(new Adresse("67 Boulevard du Général Leclerc", "", "92110", "CLICHY"));
		utilisateur1 = utilisateurDao.save(utilisateur1);
		
		Utilisateur utilisateur2 = new Utilisateur("LAMY", "Sarah", "salamy", "456");
		utilisateur2.setAdresse(new Adresse("68 Boulevard du Général Leclerc", "", "92110", "CLICHY"));
		utilisateur2 = utilisateurDao.save(utilisateur2);
		
		Utilisateur utilisateur3 = new Utilisateur("SANSON", "Sanbruit", "ssanbruit", "789");
		utilisateur3.setAdresse(new Adresse("69 Boulevard du Général Leclerc", "", "92110", "CLICHY"));
		utilisateur3 =  utilisateurDao.save(utilisateur3);
		
		
		
		
	}

}
