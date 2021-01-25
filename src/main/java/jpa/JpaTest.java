package jpa;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;

import dao.SectionDao;
import dao.TagDao;
import kanban.Carte;
import kanban.Section;
import kanban.Tag;
import kanban.Utilisateur;

public class JpaTest {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EntityManager manager = EntityManagerHelper.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		
		try {
			SectionDao dao = new SectionDao();
			Section sec=new Section();
			sec.setLibelle("En cours");
			dao.saveSection(sec);
			
			/*Tag tag=new Tag();
			tag.s
			
			TagDao dao = new TagDao();
			List<Tag> tags = dao.getAllTag();
			for (Tag t: tags) {
					System.err.println(t.getTag());*/
			
			
			
			
			
			 SectionDao dao1 = new SectionDao(); List<Section> sections =
			 dao1.getAllSection(); for (Section t: sections) {
			 System.err.println(t.getLibelle()); }
			 
			
			 
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		tx.commit();
		
		
		
		
		
		
		manager.close();
	}

		

}
