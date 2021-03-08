package kanban.dao;

import kanban.dao.generic.AbstractJpaDao;
import kanban.domain.Section;
import kanban.domain.Utilisateur;
import kanban.domain.Utilisateur;

public class UtilisateurDao extends AbstractJpaDao<Long, Utilisateur> {

	public UtilisateurDao() {
		super();
		this.clazz = Utilisateur.class;
	}


	public Utilisateur findById(String id) {
		return entityManager.find(clazz, id);
	}

	public void save(Utilisateur u) {
		if(super.findAll().size()!=0){
			super.update(u);
		}else {
			super.save(u);
		}

	}

}
