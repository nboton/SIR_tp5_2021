package kanban.dao;

import kanban.dao.generic.AbstractJpaDao;
import kanban.domain.Fiche;
import kanban.domain.Tableau;
import kanban.domain.Utilisateur;

public class TableauDao extends AbstractJpaDao<Long, Tableau> {
    public TableauDao() {
        super();
        this.clazz=Tableau.class;
    }

    public void save(Tableau t) {
        if(super.findAll().size()!=0){
            super.update(t);
        }else {
            super.save(t);
        }

    }
}
