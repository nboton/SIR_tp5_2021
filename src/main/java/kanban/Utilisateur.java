package kanban;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Utilisateur {

	private String nom;
	private String prenom;
	private String email;
	private List<Carte> cartes;
	
	
	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Utilisateur(String nom, String prenom, String email, List<Carte> cartes) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.cartes = cartes;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	@Id
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@OneToMany(mappedBy = "utilisateur", cascade = CascadeType.PERSIST)
	public List<Carte> getCartes() {
		return cartes;
	}
	public void setCartes(List<Carte> cartes) {
		this.cartes = cartes;
	}
	@Override
	public String toString() {
		return "Utilisateur [nom=" + nom + ", prenom=" + prenom + ", email=" + email + "]";
	}
	
}
