package kanban.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Url {
	
	
	private String url;
	
	
	private Carte carte;
	
	
	
	public Url(String url, Carte carte) {
		super();
		this.url = url;
		this.carte = carte;
	}

	@Id
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@OneToOne
	public Carte getCarte() {
		return carte;
	}

	public void setCarte(Carte carte) {
		this.carte = carte;
	}
	
	
}
