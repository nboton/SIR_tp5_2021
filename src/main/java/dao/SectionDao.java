package dao;

import java.util.List;

import javax.persistence.EntityTransaction;

import jpa.EntityManagerHelper;
import kanban.Section;
import kanban.Tag;

public class SectionDao {
	// Q1bis
				public void saveSection(Section sec) {
					//EntityTransaction t = EntityManagerHelper.getEntityManager().getTransaction();

					//t.begin();
					EntityManagerHelper.getEntityManager().persist(sec);
					//t.commit();
				}

				// Q1
				public List<Section> getAllSection() {
					String query = "select t from Section as t";
					return EntityManagerHelper.getEntityManager().createQuery(query, Section.class).getResultList();
				}

				// Q1NamedQuery
				public List<Section> getAllSectionter() {
					return EntityManagerHelper.getEntityManager().createNamedQuery("Tous les tags", Section.class)
							.getResultList();
				}
}
