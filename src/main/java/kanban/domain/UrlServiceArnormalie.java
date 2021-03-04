package kanban.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class UrlServiceArnormalie {

    private String urlServA;
    private List<Fiche> fiches;


    public UrlServiceArnormalie(String urlServA, List<Fiche> fiches) {
        this.urlServA = urlServA;
        this.fiches = fiches;
    }

    @Id
    public String getUrlServA() {
        return urlServA;
    }

    public void setUrlServA(String url) {
        this.urlServA = url;
    }

    @OneToMany(mappedBy = "urlServiceAnormalie", cascade = CascadeType.PERSIST)
    public List<Fiche> getFiches() {
        return fiches;
    }

    public UrlServiceArnormalie setFiches(List<Fiche> fiches) {
        this.fiches = fiches;
        return this;
    }
}
