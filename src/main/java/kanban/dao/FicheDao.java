package kanban.dao;

import kanban.dao.generic.AbstractJpaDao;
import kanban.domain.Fiche;
import kanban.domain.Section;

public class FicheDao extends AbstractJpaDao<Long, Fiche> {
    public FicheDao() {
        super();
        this.clazz = Fiche.class;
    }
}
