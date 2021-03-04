package kanban.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Section implements Serializable {
	
	private long id;
	private String libsect;
	private List<Fiche> fiches;
	private List<ColonneTableau> colonneTableaux;
	
	

	public Section() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Section(long id, String libsect, List<Fiche> fiches, List<ColonneTableau> colonneTableaux) {
		this.id = id;
		this.libsect = libsect;
		this.fiches = fiches;
		this.colonneTableaux = colonneTableaux;
	}

	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public String getLibsect() {
		return libsect;
	}

	public void setLibsect(String libelle) {
		this.libsect = libelle;
	}


	@OneToMany(mappedBy = "section", cascade = CascadeType.PERSIST)
	public List<Fiche> getFiches() {
		return fiches;
	}

	public void setFiches(List<Fiche> fiches) {
		this.fiches = fiches;
	}


	@OneToMany(mappedBy = "section", cascade = CascadeType.PERSIST)

	public List<ColonneTableau> getColonneTableaux() {
		return colonneTableaux;
	}

	public Section setColonneTableaux(List<ColonneTableau> colonneTableaux) {
		this.colonneTableaux = colonneTableaux;
		return this;
	}
}
