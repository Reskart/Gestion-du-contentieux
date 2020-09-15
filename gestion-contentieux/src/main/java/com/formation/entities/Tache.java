package com.formation.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tache implements Serializable {
	
	private long IdTache;
	private Date dateCreation;
	private String titre;
	private String description;
	private boolean statutAudience;
	
	
	public Tache() {
		super();
	}
	public Tache(long idTache, Date dateCreation, String titre, String description, boolean statutAudience) {
		super();
		IdTache = idTache;
		this.dateCreation = dateCreation;
		this.titre = titre;
		this.description = description;
		this.statutAudience = statutAudience;
	}
	@Override
	public String toString() {
		return "Tache [IdTache=" + IdTache + ", dateCreation=" + dateCreation + ", titre=" + titre + ", description="
				+ description + ", statutAudience=" + statutAudience + "]";
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
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
