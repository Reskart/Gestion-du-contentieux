package com.formation.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="idAffaire")
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
	private List<Tache> taches;
	private List<Document> documents;
	
	public Affaire() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Affaire(Long idAffaire, String reference, String titre, String description, int statut, List<Tache> taches,
			List<Document> documents) {
		super();
		this.idAffaire = idAffaire;
		this.reference = reference;
		this.titre = titre;
		this.description = description;
		this.statut = statut;
		this.taches = taches;
		this.documents = documents;
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

	@OneToMany(mappedBy="affaire",orphanRemoval = true,fetch = FetchType.LAZY)
	public List<Tache> getTaches() {
		return taches;
	}

	public void setTaches(List<Tache> taches) {
		this.taches = taches;
	}

	@OneToMany(mappedBy="affaire",orphanRemoval = true, fetch = FetchType.LAZY)
	public List<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}

	@Override
	public String toString() {
		return "Affaire [idAffaire=" + idAffaire + ", reference=" + reference + ", titre=" + titre + ", description="
				+ description + ", statut=" + statut + ", taches=" + taches + ", documents=" + documents + "]";
	}
	
	



	
	
	
	
}
