package kanban.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Tableau {
    private  long idTableau;
    private String libTableau;
    private List<ColonneTableau> colonneTableaux;

    public Tableau() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Tableau(int idTableau, String libTableau, List<ColonneTableau> colonneTableaux) {
        this.idTableau = idTableau;
        this.libTableau = libTableau;
        this.colonneTableaux = colonneTableaux;
    }

    @Id
    @GeneratedValue
    public long getIdTableau() {
        return idTableau;
    }

    public Tableau setIdTableau(int idTableau) {
        this.idTableau = idTableau;
        return this;
    }

    public String getLibTableau() {
        return libTableau;
    }

    public Tableau setLibTableau(String libTableau) {
        this.libTableau = libTableau;
        return this;
    }
   @OneToMany(mappedBy = "tableau", cascade = CascadeType.PERSIST)
    public List<ColonneTableau> getColonneTableaux() {
        return colonneTableaux;
    }

    public Tableau setColonneTableaux(List<ColonneTableau> colonneTableaux) {
        this.colonneTableaux = colonneTableaux;
        return this;
    }
}
