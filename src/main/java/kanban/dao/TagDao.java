package kanban.dao;

import java.util.List;

import javax.persistence.EntityTransaction;

import kanban.domain.Tag;
import kanban.jpa.EntityManagerHelper;

public class TagDao {
	// Q1bis
		public void saveTag(Tag tag) {
			EntityTransaction t = EntityManagerHelper.getEntityManager().getTransaction();

			t.begin();
			EntityManagerHelper.getEntityManager().persist(tag);
			t.commit();
		}

		// Q1
		public List<Tag> getTag() {
			String query = "select t from Tag as t";
			return EntityManagerHelper.getEntityManager().createQuery(query, Tag.class).getResultList();
		}

		// Q1NamedQuery
		public List<Tag> getAllTagter() {
			return EntityManagerHelper.getEntityManager().createNamedQuery("Tous les tags", Tag.class)
					.getResultList();
		}

		
}
