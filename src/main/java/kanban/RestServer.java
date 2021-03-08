package kanban;

import io.undertow.Undertow;
import kanban.dao.*;
import kanban.domain.*;
import org.jboss.resteasy.plugins.server.undertow.UndertowJaxrsServer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Logger;

/**
 * RESTfull microservice, based on JAX-RS and JBoss Undertow
 *
 */
public class RestServer {

    private static final Logger logger = Logger.getLogger(RestServer.class.getName());

    public static void main( String[] args ) throws ParseException {

        UndertowJaxrsServer ut = new UndertowJaxrsServer();

        TestApplication ta = new TestApplication();

        ut.deploy(ta);

        ut.start(
                Undertow.builder()
                        .addHttpListener(8080, "localhost")

        );

        logger.info("JAX-RS based micro-service running!");

      //test
        UtilisateurDao utilisateurDao=new UtilisateurDao();
        FicheDao ficheDao=new FicheDao();
        TableauDao tableauDao=new TableauDao();
        SectionDao sectionDao=new SectionDao();
        TagDao tagDao=new TagDao();



        //+++++++++++++++++Enregistrement  de trois utilisateurs+++++++++++++++++++++++++++++++++++++
        //user1
        Utilisateur u1 = new Utilisateur();
        u1.setCodeUser("u1");
        u1.setNom("BOTON");
        u1.setPrenom("Olive");
        u1.setEmail("boton@gmail.com");


        //user2
        Utilisateur u2 = new Utilisateur();
        u2.setCodeUser("u2");
        u2.setNom("MACHADI");
        u2.setPrenom("Anwar");
        u2.setEmail("machadi@gmail.com");

        //user3
        Utilisateur u3 = new Utilisateur();
        u3.setCodeUser("u3");
        u3.setNom("Dupont");
        u3.setPrenom("Auguste ");
        u3.setEmail("august@gmail.com");


        //+++++++++++++++++Enregistrement fiche+++++++++++++++++++++++++++++++++++++++++++++++++
        SimpleDateFormat formatDat=new SimpleDateFormat("dd-MM-yyyy", Locale.FRENCH);
        //Fiche 1
        Fiche f1 = new Fiche();
        f1.setDateButoire(formatDat.parse("10-02-2021"));
        f1.setDelai(20);
        f1.setLibelle("Fiche 1");
        f1.setLieu("Ville jean");
        f1.setUrl("http:/www.toto.com");
        f1.setNoteExplicative("Backup cfg file-Cisco");
        f1.setUtilisateur(u1);

        //Fiche 2
        Fiche f2 = new Fiche();
        f2.setDateButoire(formatDat.parse("07-02-2021"));
        f2.setDelai(45);
        f2.setLibelle("Fiche 2");
        f2.setLieu("Rennes beaulieu");
        f2.setUrl("http:/www.toto.com");
        f2.setNoteExplicative("Configuration de l'ip du client xx.");
        f2.setUtilisateur(u1);

        //Fiche 3
        Fiche f3 = new Fiche();
        f3.setDateButoire(formatDat.parse("11-02-2021"));
        f3.setDelai(35);
        f3.setLibelle("Fiche 3");
        f3.setLieu("Clémenceau");
        f3.setUrl("http:/www.toto.com");
        f3.setNoteExplicative("Configuration d'un router");
        f3.setUtilisateur(u2);

        //Fiche 4
        Fiche f4 = new Fiche();
        f4.setDateButoire(formatDat.parse("11-02-2021"));
        f4.setDelai(60);
        f4.setLibelle("Fiche 4");
        f4.setLieu("Clémenceau");
        f4.setUrl("http:/www.toto.com");
        f4.setNoteExplicative("PC 19- virus check");
        f4.setUtilisateur(u2);

        //Fiche 5
        Fiche f5 = new Fiche();
        f5.setDateButoire(formatDat.parse("08-02-2021"));
        f5.setDelai(45);
        f5.setLibelle("Fiche 5");
        f5.setLieu("Rennes Charles de gaule");
        f5.setUrl("http:/www.toto.com");
        f5.setNoteExplicative("Developpement d'un nouveau module");
        f5.setUtilisateur(u3);

        //Fiche 6
        Fiche f6 = new Fiche();
        f6.setDateButoire(formatDat.parse("09-02-2021"));
        f6.setDelai(30);
        f6.setLibelle("Fiche 6");
        f6.setLieu("Saint Jacques");
        f6.setUrl("http:/www.toto.com");
        f6.setNoteExplicative("Configuration serveur pour un employé");
        f6.setUtilisateur(u3);

        utilisateurDao.save(u1);
        utilisateurDao.save(u2);
        utilisateurDao.save(u3);
        ficheDao.save(f1);
        ficheDao.save(f2);
        ficheDao.save(f3);
        ficheDao.save(f4);
        ficheDao.save(f5);
        ficheDao.save(f6);

        //+++++++++++++++++++++Crétion de tableau++++++++++++++++++++++++++++++
        Tableau tableau1=new Tableau("Tableau 1");
        Tableau tableau2=new Tableau("Tableau 2");
        tableauDao.save(tableau1);
        tableauDao.save(tableau2);


        //+++++++++++++++++++Crétion de section++++++++++++++++++++++++++
        Section section1=new Section("en attente");
        Section section2=new Section("en cours");
        Section section3=new Section("realisé 3");


        sectionDao.save(section1);
        sectionDao.save(section2);
        sectionDao.save(section3);

        //+++++++++++++++++++Crétion de tag ++++++++++++++++++++++++++
        Tag tag1=new Tag("tag1");
        Tag tag2=new Tag("tag2");
        Tag tag3=new Tag("tag3");
        tagDao.save(tag1);
        tagDao.save(tag2);
        tagDao.save(tag3);





    }
}
