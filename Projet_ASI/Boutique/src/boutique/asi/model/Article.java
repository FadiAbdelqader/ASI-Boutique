package boutique.asi.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Article {
	
	private int id;
	private String libelle;
	private String marque;
	private int prix;
	private int id_categorie,id_boutique;
	
	
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
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public int getId_categorie() {
		return id_categorie;
	}
	public void setId_categorie(int id_categorie) {
		this.id_categorie = id_categorie;
	}
	public int getId_boutique() {
		return id_boutique;
	}
	public void setId_boutique(int id_boutique) {
		this.id_boutique = id_boutique;
	}

}
