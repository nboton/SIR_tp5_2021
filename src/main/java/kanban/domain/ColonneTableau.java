package kanban.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ColonneTableau {
    private  long id;
    private Tableau tableau;
    private Section section;
    private Fiche fiche;



    @Id
    @GeneratedValue
    public long getId() {
        return id;
    }

    public ColonneTableau setId(long id) {
        this.id = id;
        return this;
    }
    @ManyToOne
    public Tableau getTableau() {
        return tableau;
    }

    public ColonneTableau setTableau(Tableau tableau) {
        this.tableau = tableau;
        return this;
    }

    @ManyToOne
    public Section getSection() {
        return section;
    }

    public ColonneTableau setSection(Section section) {
        this.section = section;
        return this;
    }

    @ManyToOne
    public Fiche getFiche() {
        return fiche;
    }

    public ColonneTableau setFiche(Fiche fiche) {
        this.fiche = fiche;
        return this;
    }
}
