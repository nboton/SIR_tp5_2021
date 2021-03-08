package kanban.dao;

import java.util.List;

import javax.persistence.EntityTransaction;

import kanban.dao.generic.AbstractJpaDao;
import kanban.domain.Section;
import kanban.domain.Tableau;
import kanban.domain.Tag;
import kanban.domain.Utilisateur;


public class TagDao extends AbstractJpaDao<Long, Tag> {
	public TagDao() {
		super();
		this.clazz=Tag.class;
	}
	public void save(Tag t) {
		if(super.findAll().size()!=0){
			super.update(t);
		}else {
			super.save(t);
		}

	}
}
