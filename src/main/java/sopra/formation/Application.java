package sopra.formation;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import sopra.formation.dao.ICursusDao;
import sopra.formation.dao.IFiliereDao;
import sopra.formation.dao.ISalleDao;
import sopra.formation.dao.jpa.CursusDaoJpa;
import sopra.formation.dao.jpa.FiliereDaoJpa;
import sopra.formation.dao.jpa.SalleDaoJpa;

public class Application {

	private static Application instance = null;
	private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("Factory-jpa");
	private final ISalleDao salleDao = new SalleDaoJpa();
	private final ICursusDao cursusDao = new CursusDaoJpa();
	private final IFiliereDao filiereDao = new FiliereDaoJpa();
	
	public static Application getInstance() {
		if (instance == null) {
			instance = new Application();
		}

		return instance;
	}
	
	public EntityManagerFactory getEmf() {
		return emf;
	}

	public ISalleDao getSalleDao() {
		return salleDao;
	}

	public ICursusDao getCursusDao() {
		return cursusDao;
	}

	public IFiliereDao getFiliereDao() {
		return filiereDao;
	}
	
	
}
