package kanban.dao;

import kanban.dao.generic.AbstractJpaDao;
import kanban.domain.Fiche;
import kanban.domain.Tableau;

public class TableauDao extends AbstractJpaDao<Long, Tableau> {
    public TableauDao() {
        super();
        this.clazz=Tableau.class;
    }
}
