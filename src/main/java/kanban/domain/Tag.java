package kanban.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Tag {
	
	private int id;

	private String tag;
	
	private List<Carte>  cartes;
	
	
	
	
	public Tag() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Tag(int id, String tag) {
		super();
		this.id = id;
		this.tag = tag;
	}


	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ManyToMany()
	public List<Carte> getCartes() {
		return cartes;
	}


	public void setCartes(List<Carte> cartes) {
		this.cartes = cartes;
	}

	
	
	

}
