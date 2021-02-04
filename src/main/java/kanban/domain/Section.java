package kanban.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Section {
	
	private int id;
	private String libelle;
	private List<Carte> cartes;
	
	

	public Section() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Section(String libelle) {
		super();
		
		this.libelle = libelle;
			}


	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	@OneToMany(mappedBy = "section", cascade = CascadeType.PERSIST)
	public List<Carte> getCartes() {
		return cartes;
	}

	public void setCartes(List<Carte> cartes) {
		this.cartes = cartes;
	}
}
