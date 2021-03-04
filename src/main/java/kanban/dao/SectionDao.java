package kanban.dao;


import kanban.dao.generic.AbstractJpaDao;
import kanban.domain.Section;
public class SectionDao extends AbstractJpaDao<Long, Section> {
    // Q1bis
    public SectionDao() {
        super();
        this.clazz = Section.class;
    }



}
