package kanban.dao;

import java.util.List;

import javax.persistence.EntityTransaction;

import kanban.dao.generic.AbstractJpaDao;
import kanban.domain.Section;
import kanban.domain.Tag;


public class TagDao extends AbstractJpaDao<Long, Tag> {
	public TagDao() {
		super();
		this.clazz=Tag.class;
	}
}
