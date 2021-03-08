package kanban.dao;

import kanban.dao.generic.AbstractJpaDao;
import kanban.domain.PositionnementFiche;


public class PositionnementFicheDao extends AbstractJpaDao<Long, PositionnementFiche> {
    public PositionnementFicheDao() {
        super();
        this.clazz=PositionnementFiche.class;
    }

}
