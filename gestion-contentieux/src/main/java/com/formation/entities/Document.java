package com.formation.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Document implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long idDocument;
	private Date dateCreation;
	private String nom;
	private String description;
	private Affaire affaire;

	public Document() {
		super();
	}

	public Document(Long idDocument, Date dateCreation, String nom, String description, Affaire affaire) {
		super();
		this.idDocument = idDocument;
		this.dateCreation = dateCreation;
		this.nom = nom;
		this.description = description;
		this.affaire = affaire;
	}


	@Override
	public String toString() {
		return "Document [idDocument=" + idDocument + ", dateCreation=" + dateCreation + ", nom=" + nom
				+ ", description=" + description + ", affaire=" + affaire + "]";
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getIdDocument() {
		return idDocument;
	}
	
	public void setIdDocument(Long idDocument) {
		this.idDocument = idDocument;
	}


	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@ManyToOne
	@JoinColumn(name="idAffaire")
	public Affaire getAffaire() {
		return affaire;
	}

	public void setAffaire(Affaire affaire) {
		this.affaire = affaire;
	}
	
	
}
