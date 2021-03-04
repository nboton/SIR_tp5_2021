package kanban.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class HashCommit {
	private String hashC;
	private List<Fiche> fiches;
	
	
	public HashCommit() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Id
	public String getHash1() {
		return hashC;
	}

	public void setHash1(String hash) {
		this.hashC = hash;
	}

	@OneToMany(mappedBy = "hachC", cascade = CascadeType.PERSIST)
	public List<Fiche> getFiches() {
		return fiches;
	}

	public HashCommit setFiches(List<Fiche> fiche) {
		this.fiches = fiche;
		return this;
	}
}
