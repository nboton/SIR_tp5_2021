package kanban;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Carte {

	
	private int numCarte;
	private Date dateButoire;
	private int temps;
	private String lieu;
	
	private Utilisateur utilisateur;
	
	private List<Tag> tags;
	private Section section;
	

	public Carte() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Carte(Date dateButoire, int temps, String lieu, Utilisateur utilisateur, Section section) {
		super();
		this.dateButoire = dateButoire;
		this.temps = temps;
		this.lieu = lieu;
		this.utilisateur = utilisateur;
		this.section = section;
	}
	@Id
	@GeneratedValue
	public int getNumCarte() {
		return numCarte;
	}
	public void setNumCarte(int numCarte) {
		this.numCarte = numCarte;
	}
	
	@Temporal(TemporalType.DATE)
	public Date getDateButoire() {
		return dateButoire;
	}
	public void setDateButoire(Date dateButoire) {
		this.dateButoire = dateButoire;
	}
	public int getTemps() {
		return temps;
	}
	public void setTemps(int temps) {
		this.temps = temps;
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
	
	@ManyToMany(mappedBy = "cartes")
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
	
	
	
	
	
	
}
