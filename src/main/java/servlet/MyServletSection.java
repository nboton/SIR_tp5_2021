package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.Session;

import kanban.dao.SectionDao;
import kanban.domain.Section;
import kanban.jpa.EntityManagerHelper;

@WebServlet(name = "section", urlPatterns = { "/MyServletSection" })
public class MyServletSection extends HttpServlet{
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String libelle=request.getParameter("libelle");	
		EntityManager manager = EntityManagerHelper.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		tx.commit();
		
		try {
			System.out.print("ooooooooooooo");
			SectionDao dao = new SectionDao();
			Section section=new Section();
			section.setLibsect(libelle);
		
			//dao.saveSection(section);
								
			 
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		tx.commit();
		
		 PrintWriter out = response.getWriter();
		  
		  out.println("<HTML>\n<BODY>\n" + "<H1>Informations section</H1>\n" + "<UL>\n"
		  + " <LI>Nom: " + request.getParameter("libelle") + "\n" + "</UL>\n" +
		  "</BODY></HTML>"); 
		  
		 
		
		
		
		
		
	}
}
