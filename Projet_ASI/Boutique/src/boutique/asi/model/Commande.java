package boutique.asi.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Commande {
	
	private int id;
	private int id_article;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_article() {
		return id_article;
	}
	public void setId_article(int id_article) {
		this.id_article = id_article;
	}
	
	

}
