package kanban.dao;

import kanban.dao.generic.AbstractJpaDao;
import kanban.domain.Fiche;
import kanban.domain.Section;
import kanban.domain.Utilisateur;

public class FicheDao extends AbstractJpaDao<Long, Fiche> {
    public FicheDao() {
        super();
        this.clazz = Fiche.class;
    }
    public void save(Fiche f) {
        if(super.findAll().size()!=0){
            super.update(f);
        }else {
            super.save(f);
        }

    }
}
