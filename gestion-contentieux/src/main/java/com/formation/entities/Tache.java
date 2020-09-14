package com.formation.entities;

import java.io.Serializable;
import java.util.Date;

public class Tache implements Serializable {
	private long IdTache;
	private Date dateCreation;
	private String titre;
	private String description;
	private boolean statutAudience;
	
	
	@Override
	public String toString() {
		return "Tache [IdTache=" + IdTache + ", dateCreation=" + dateCreation + ", titre=" + titre + ", description="
				+ description + ", statutAudience=" + statutAudience + "]";
	}
	public long getIdTache() {
		return IdTache;
	}
	public void setIdTache(long idTache) {
		IdTache = idTache;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isStatutAudience() {
		return statutAudience;
	}
	public void setStatutAudience(boolean statutAudience) {
		this.statutAudience = statutAudience;
	}
	
	
	

}
