package kanban.dao;


import kanban.dao.generic.AbstractJpaDao;
import kanban.domain.Section;
import kanban.domain.Utilisateur;

public class SectionDao extends AbstractJpaDao<Long, Section> {

    public SectionDao() {
        super();
        this.clazz = Section.class;
    }

    public void save(Section s) {
        if(super.findAll().size()!=0){
            super.update(s);
        }else {
            super.save(s);
        }

    }

}
