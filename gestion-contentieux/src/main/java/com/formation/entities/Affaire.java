package com.formation.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Affaire implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long idAffaire;
	private String reference;
	private String titre;
	private String description;
	private int statut;
	
	
	public Affaire() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Affaire(Long idAffaire, String reference, String titre, String description, int statut) {
		super();
		this.idAffaire = idAffaire;
		this.reference = reference;
		this.titre = titre;
		this.description = description;
		this.statut = statut;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getIdAffaire() {
		return idAffaire;
	}


	public void setIdAffaire(Long idAffaire) {
		this.idAffaire = idAffaire;
	}


	public String getReference() {
		return reference;
	}


	public void setReference(String reference) {
		this.reference = reference;
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


	public int getStatut() {
		return statut;
	}


	public void setStatut(int statut) {
		this.statut = statut;
	}


	@Override
	public String toString() {
		return "Affaire [idAffaire=" + idAffaire + ", reference=" + reference + ", titre=" + titre + ", description="
				+ description + ", statut=" + statut + "]";
	}
	
	
	
	
}
