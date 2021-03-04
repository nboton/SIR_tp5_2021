package kanban.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;


@Entity
public class Fiche {


    private long idFiche;
    private Date dateButoire;
    private String libelle;
    private String lieu;
    private String url;
    private String noteExplicative;
    private String delai;
    private Utilisateur utilisateur;
    private List<Tag> tags;
    private Section section;
    private HashCommit hachC;
    private UrlServiceArnormalie urlServiceAnormalie;
    private List<ColonneTableau> ColonneTableaux;


    public Fiche() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Fiche(int idFiche, Date dateButoire, String libelle, String lieu, String url, String noteExplicative, String delai, Utilisateur utilisateur, List<Tag> tags, Section section, HashCommit hachC, UrlServiceArnormalie urlServiceAnormalie, List<ColonneTableau> colonneTableaux) {
        this.idFiche = idFiche;
        this.dateButoire = dateButoire;
        this.libelle = libelle;
        this.lieu = lieu;
        this.url = url;
        this.noteExplicative = noteExplicative;
        this.delai = delai;
        this.utilisateur = utilisateur;
        this.tags = tags;
        this.section = section;
        this.hachC = hachC;
        this.urlServiceAnormalie = urlServiceAnormalie;
        ColonneTableaux = colonneTableaux;
    }

    @Id
    @GeneratedValue
    public long getIdFiche() {
        return idFiche;
    }

    public void setIdFiche(int idFiches) {
        this.idFiche = idFiche;
    }

    @Temporal(TemporalType.DATE)
    public Date getDateButoire() {
        return dateButoire;
    }

    public void setDateButoire(Date dateButoire) {
        this.dateButoire = dateButoire;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    @ManyToOne()
    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    @OneToMany(mappedBy = "fiche", cascade = CascadeType.PERSIST)
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    @ManyToOne()
    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public String getLibelle() {
        return libelle;
    }
    public Fiche setLibelle(String libelle) {
        this.libelle = libelle;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public Fiche setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getNoteExplicative() {
        return noteExplicative;
    }

    public Fiche setNoteExplicative(String noteExplicative) {
        this.noteExplicative = noteExplicative;
        return this;
    }

    public String getDelai() {
        return delai;
    }

    public Fiche setDelai(String delai) {
        this.delai = delai;
        return this;
    }

    @ManyToOne()
    public HashCommit getHachC() {
        return hachC;
    }

    public Fiche setHachC(HashCommit hachC) {
        this.hachC = hachC;
        return this;
    }

    @ManyToOne()
    public UrlServiceArnormalie getUrlServiceAnormalie() {
        return urlServiceAnormalie;
    }

    public Fiche setUrlServiceAnormalie(UrlServiceArnormalie urlServiceAnormalie) {
        this.urlServiceAnormalie = urlServiceAnormalie;
        return this;
    }

    @OneToMany(mappedBy = "fiche", cascade = CascadeType.PERSIST)
    public List<ColonneTableau> getColonneTableaux() {
        return ColonneTableaux;
    }

    public Fiche setColonneTableaux(List<ColonneTableau> colonneTableaux) {
        ColonneTableaux = colonneTableaux;
        return this;
    }
}
