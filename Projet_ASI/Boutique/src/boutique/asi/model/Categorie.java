package boutique.asi.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Categorie {
	
	private int id;
	private String libelle;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	

}
