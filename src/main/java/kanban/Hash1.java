package kanban;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Hash1 {
	private String hash1;
	private Carte carte;
	
	
	public Hash1() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	public String getHash1() {
		return hash1;
	}

	public void setHash1(String hash) {
		this.hash1 = hash;
	}

	@OneToOne()
	public Carte getCarte() {
		return carte;
	}
	
	public void setCarte(Carte carte) {
		this.carte = carte;
	}
	
}
