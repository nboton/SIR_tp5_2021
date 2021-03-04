package kanban.domain;

import java.util.List;

import javax.persistence.*;

@Entity
public class Tag {

    private long id;
    private String libTag;
    private Fiche fiche;


    public Tag() {
        super();
        // TODO Auto-generated constructor stub
    }


    public Tag(long id, String libTag, Fiche fiche) {
        this.id = id;
        this.libTag = libTag;
        this.fiche = fiche;
    }

    public String getLibTag() {
        return libTag;
    }

    public Tag setLibTag(String libTag) {
        this.libTag = libTag;
        return this;
    }

    @Id
    @GeneratedValue
    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @ManyToOne()
    public Fiche getFiche() {
        return fiche;
    }

    public Tag setFiche(Fiche fiche) {
        this.fiche = fiche;
        return this;
    }


}
