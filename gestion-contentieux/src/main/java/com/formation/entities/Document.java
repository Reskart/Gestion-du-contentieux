package com.formation.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Document implements Serializable{


	private long idDocument;
	
	private Date dateCreation;
	
	private String nom;
	
	private String description;

	public Document() {
		super();
	}

	public Document(long idDocument, Date dateCreation, String nom, String description) {
		super();
		this.idDocument = idDocument;
		this.dateCreation = dateCreation;
		this.nom = nom;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Document [idDocument=" + idDocument + ", dateCreation=" + dateCreation + ", nom=" + nom
				+ ", description=" + description + "]";
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public long getIdDocument() {
		return idDocument;
	}

	public void setIdDocument(long idDocument) {
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
}
